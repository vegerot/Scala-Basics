import scala.math
object Companions
{
    case class Circle(radius: Double)
    {
        import Circle._
        def area: Double = calculateArea(radius)
        //private def calculateArea(radius: Double): Double = math.Pi*math.pow(radius,2.0)
    }
    
    object Circle
    {
        def calculateArea(radius: Double): Double = math.Pi*math.pow(radius,2.0)
    }
    
    
    class Email(val username: String, val domainName: String)
    
    object Email
    {
        def fromString(emailString: String): Option[Email] =
        {
            emailString.split('@') match {
                case Array(a,b) =>Some(new Email(a,b))
                case _ => None
            }
        }
        
    }
    def main(args: Array[String]):Unit =
    {
        println(Circle.calculateArea(10))
        
        val circle1 = Circle(5.0)
        
        println(circle1.area)
        
        val scalaCenterEmail  = Email.fromString("scala.center@epfl.ch")
        scalaCenterEmail match {
            case Some(email)=>println(
            s"""Registered an email
            |Username: ${email.username}
            |Domain Name: ${email.domainName}
            """)
            case None =>println("Error: could not parse email") 
            
        }
        
    }
}