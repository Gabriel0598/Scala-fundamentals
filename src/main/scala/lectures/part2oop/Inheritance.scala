package lectures.part2oop

object Inheritance extends App
{
  //Single class inheritance
  sealed class Animal
  {
    def eat = println("nomnom"); //When is not assigned is global scope, used in public classes; Different from Java we can`t declare work public;
    private def eat2 = println("nomnom"); //use just in this class, private in this scope, is not able call it in global scope;
    protected def eat3 = println("nomnom"); //Use in this class and sub classes;
    val creatureType = "Wild"
  }

  class Cat extends Animal
  {
    def crunch =
      {
        eat3;
        println("crunch crunch");
      }
  }

  val cat = new Cat;
  cat.crunch;

  //Constructors
  class Person(name: String, age: Int)
  {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name);

  //Overriding
//  class Dog (override val creatureType) extends Animal
//  {
//    override val creatureType: String = "Domestic"
//    override def eat = println("crunch, crunch");
//  }
  class Dog(dogType: String) extends Animal {
    override val creatureType: String = dogType

    override def eat = {
      super.eat
      println("Crunch, crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // Polimorfism
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //overriding vs overloading
  //Super
  //preventing overrides:
  //1 - final at method
  //2 - final at class
  //3 - seal the class - possible to override in this file but not in others
}