package lectures.part1basics

object StringOps extends App
{
  val str: String = "Hello, i am learning Scala";

  println(str.charAt(2)); //Return index position 2, like a vector
  println(str.substring(7, 11)); //Return the index between 7 and 10
  println(str.split(" ").toList); //delimiters
  println(str.startsWith("Hello")); //return true or false, in this case true, like a comparator
  println(str.replace(" ", "-")); //Change spaces by dashs;
  println(str.toLowerCase()); //Change all letters by lower case;
  println(str.length); //Return the length of string typed;

  val aNumberString = "2";
  val aNumber = aNumberString.toInt; //Convert "45" to 45
  println(aNumber);
  println('a' +: aNumberString :+ 'z'); //Concatenation in middle of text //is possible also call like "" + variable + ""
  println(str.reverse); //Revert the position of String array
  println(str.take(2));

  //Scala-specific: String interpolators.

  //S-interpolators
  val name = "David";
  val age = 12;
  val greeting = s"Hello, my name is $name and I am $age years old."; //String interpolation
  val anotherGreeting = s"Hello, my name is $name and i will be turning ${age + 1} years old."; //execute and operation inside {}
  println(anotherGreeting);

  //F-interpolators
  val speed = 1.2f;
  val myth = f"$name can eat $speed%2.2f burgers per minute"; //f indicates that it will return a float throughout interpolation.
  //%2.2f indicates that it will have 2 decimal cases.
  println(myth);

  val x = 1.1f;
  val str2 = f"$x%11.4f"; //completes cases before comma with 10 spaces, and 3 zeros after comma.
  //val str3 = f"$x%3d"; //it run error, because it will try receive 3 numbers of int.
  println(str2);

  //raw-interpolator
  println(raw"This is a \n newline"); //don't break line;
  val escaped = "This is a \nnewline"; //break line because \n is allocated in value escaped;
  println(raw"$escaped"); //indicates that escaped is passed in raw;
}
