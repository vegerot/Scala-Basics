object Variances {

  abstract class Animal {
    def name: String
  }
  case class Cat(name: String) extends Animal
  case class Dog(name: String) extends Animal

  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach { animal =>
      println(animal.name)
    }
  }

  abstract class Printer[-A] {
    def print(value: A): Unit
  }

  class AnimalPrinter extends Printer[Animal] {
    def print(animal: Animal): Unit =
      println("The animal's name is: " + animal.name)
  }

  class CatPrinter extends Printer[Cat] {
    def print(cat: Cat): Unit =
      println("the cat's name is: " + cat.name)
  }

  class Container[A](value: A) {
    private var _value: A = value
    def getValue: A = _value
    def setValue(value: A): Unit = {
      _value = value
    }
  }
  def main(args: Array[String]): Unit = {
    val cats: List[Cat] = List(Cat("Simon"), Cat("Khaleesi"))
    val dogs: List[Dog] = List(Dog("Riley"), Dog("Penny"))
    printAnimalNames(cats)
    printAnimalNames(dogs)

    val catPrinter: Printer[Cat] = new CatPrinter
    val animalPrinter: Printer[Animal] = new AnimalPrinter

    val myCat: Cat = Cat("BabyMows")

    def printMyCat(printer: Printer[Cat]): Unit = { printer.print(myCat) }

    printMyCat(catPrinter)
    printMyCat(animalPrinter)

    //val catContainer: Container[Cat] = new Container(Cat("Ben"))
    //val animalContainer: Container[Animal] = catContainer
    //animalContainer.setValue(Dog("Charlie"))
    //val cat: Cat = catContainer.getValue
    //println(cat)
  }
}
