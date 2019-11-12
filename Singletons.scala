import logging.Logger.info
//import eat.Foods.Milk.NutritionInfo
import eat.Foods.Milk
import eat.Foods.OJ
//import eat.Foods.OJ.NutritionInfo
object Singletons
{
    object Box

    class Project(name: String, daysToComplete: Int)

    class Test {
        val project1 = new Project("TPS Reports",1)
        val project2 = new Project("Website redesign", 5)
        info("Created Projects")
    }


    def main(args: Array[String]): Unit = 
    {
        val test = new Test()

        val milk = new Milk()

        val oj = new OJ()

        //import milk.NutritionInfo
        import oj.NutritionInfo

        NutritionInfo

    }
}