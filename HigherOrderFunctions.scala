object HigherOrderFunctions
{
    case class WeeklyWeatherForecast(temperatures: Seq[Double])
    {
        private def convertCtoF(temp: Double): Double = temp*1.8 + 32
        def forecastInFarhrenheit(): Seq[Double] = temperatures.map(convertCtoF(_))
    }

    object SalaryRaiser
    {
        private def promotion(salaries: List[Double], promotionFunction: Double=>Double): List[Double] =
            salaries.map(promotionFunction(_))
        def smallPromotionsalaries(salaries: List[Double]): List[Double] = 
            promotion(salaries, salary => salary * 1.1)
        def greatPromotionsalaries(salaries: List[Double]): List[Double] = 
            promotion(salaries, salary => salary * math.log(salary))
        def hugePromotionsalaries(salaries: List[Double]): List[Double] = 
            promotion(salaries, salary => salary * salary)
    }

    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String =
    {
        val schema: String = if(ssl) "https://" else "http://"
        (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query" : String
    }

    def main(args: Array[String]): Unit =
    {
        val salaries: Seq[Int] = Seq(20000, 70000, 40000)
        //val doubleSalary = (x: Int) => x*2
        def doubleSalary(x:Int): Int = x*2
        val newSalaries = salaries.map(doubleSalary)
        val anonymousSalaries = salaries.map((s:Int) => s*2)
        val idiomaticSalaries = salaries.map(_*2)
        println(idiomaticSalaries)
        println(WeeklyWeatherForecast(Seq(0, 100)).forecastInFarhrenheit)
       // println(WeeklyWeatherForecast(Seq(0,0)).forecastInFarhrenheit(Seq(0, 100)))

       val domainName = "www.example.com"
       def getURL = urlBuilder(ssl=true, domainName)
       val endpoint = "users"
       val query = "id=1"
       val url = getURL(endpoint, query)
       println(url)
    }
}