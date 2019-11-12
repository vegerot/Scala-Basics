import scala.util.Random
object Extractors
{
    object CustomerID
    {
        def apply(name: String): String = s"$name--${Random.nextLong}"

        def unapply(customerID: String): Option[String] =
        {
            val stringArray: Array[String] = customerID.split("--")
            if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
        }
    }

    def main(args: Array[String]): Unit =
    {
        val customer1ID = CustomerID("Max")
        println(customer1ID.getClass())
        customer1ID match {
            case CustomerID(name) => println(name)
            case _ => println("Could not  extract a CustomerID")
        }

        val customer2ID = CustomerID("Nico")
        val CustomerID(name) = customer2ID
        println(name)

        //val CustomerID(name2) = "-123"
        //println(name2)
    }
}