package lectures.part2oop

object OOBasics extends App //Inheritance
{
  val person = new Person("John", 26);
  println(person.x); //field
  person.greet("Daniel");
  person.greet();

  //Author
  val author = new Writer("Charles", "Dickens", 1812);
  val imposter = new Writer("Charles", "Dickens", 1812);
  val novel = new Novel("Great Expectations", 1861, author);

  println(novel.authorAge);
  println(novel.isWritterBy(imposter));

  val counter = new Counter();
  counter.inc.print;
  counter.inc.inc.inc.print; //Incrementing three times
}

//constructor
class Person(name: String, val age: Int = 0)
{
  //body
  val x = 2;

  println(1 + 3);

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name"); //This operator
  //first operator references name parameter in person class (person is instanced in object OOBasics, receives parameter name);
  //second operator references name parameter in method greet (this returns the references in same structure, in this case a function-def);
  //Eliminates ambiguity

  //overloading
  //Different signatures
  def greet(): Unit = println(s"Hi, I am $name");

  //multiple constructors
  def this(name: String) = this(name, 0);
  def this() = this("John Doe");
}

//class parameters are NOT FIELDS
//In this case, val age references person.age;

/*
* Novel and Writer
*
* Writer: first name, surname, year
* - method fullname
*
* Novel: name, year of release, author
* - authorAge
* - isWrittenBy (author)
* - copy (new year of release) = new instance of Novel
*
* Counter class
* - receives an int value
* - method current count
* - method to increment/ decrement => new Counter
* - overload inc/dec to receive an amount
* */

class Writer(firstName: String, surname: String, year: Int)
{
  def fullName: String = firstName + " " + surname;
}

class Novel(name: String, year: Int, author: Writer)
{
  def authorAge = year - year; //Is not year - author.year, like in example of course, age of author is based in year;
  def isWritterBy(author: Writer) = author == this.author;
  def copy(newYear: Int): Novel = new Novel(name, newYear, author);
}

class Counter(val count: Int = 0)
{
  def inc =
    {
      println("Incrementing");
      new Counter(count + 1); //immutability
    }

  def dec =
    {
      println("Decrementing");
      new Counter(count - 1);
    }

  def inc(n: Int) =
    {
      if (n > 0)
      {
        //inc.inc == (n - 1);
        //Problem related to previous code, solution is used the expression;
        (n-1);
      }
      else
      {
        this
      } //Is not the reference of course, the probably solution is that;
      /*Original: else inc.inc(n-1);*/
      //new Counter(count + n)
    }

  def dec(n: Int) =
    {
      if (n > 0)
      {
        //dec.dec == (n - 1);
        //Problem related to previous code, solution is used the expression;
        (n-1);
      }
      else
      {
        this;
      }
      /*Same case here related to def inc*/
      new Counter(count - n);
    }

  def print = println(count);
}