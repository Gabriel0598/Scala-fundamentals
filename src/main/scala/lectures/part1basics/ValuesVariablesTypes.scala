package lectures.part1basics

object ValuesVariablesTypes extends App
{
  //inheritance from app
  //In this declaration, x is inferred with an int wrapper in code at front;
  val x: Int = 42;
  println(x)

  //In this declaration, y is inferred with an int in compilation time, types are optionals and compiler can infer types;
  val y = 55;
  println(y)

  //val works such as a constant reference, so is not possible do it:
  //x = 2;
  //vals are immutable

  val aString: String = "Hello"; //semicolons are optionals in scala, just is necessary when you types several instructions in same line, ex:
  val bString: String = "Hi"; val cString: String = "Scala";

  val aBoolean: Boolean = false;
  val aChar: Char = 'a';
  val anInt: Int = 'x';
  val aShort: Short = 4613; //Two bytes
  val aLong: Long = 5273985273895267L; //L declares an Int like a Long here
  val aFloat: Float = 2.0f; //f to declares float;
  val aDouble: Double = 3.14;

  //variables
  var aVariable: Int = 4;
  //var can be reassigned
  aVariable = 5; //Functional proggraming; side effects
}
