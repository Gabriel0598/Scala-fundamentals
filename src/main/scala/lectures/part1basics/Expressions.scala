package lectures.part1basics

object Expressions extends App
{
  val x = 1 + 2; //EXPRESSION
  println(x);

  println(2 + 3 * 4);
  // + - * / & (and) | (or) ^ (or exclusive) << (left shift) >> (right shift) >>> (right shift with zero extension)

  println(1 == x); //Expression that is equivalent a boolean - comparing 1 to x
  // == (equal) != (not equal) > >= < <=

  println(!(1 == x)); //comparing attributes and inverting;
  // ! && || (logical operation)

  var aVariable = 2;
  aVariable += 3; //Also works with -= *= /= .... side effects
  println(aVariable);

  // Instructions (DO) vs Expressions (VALUE)
  // IF expression
  val aCondition = true; //atributtes to aCondition a bool
  val aConditionedValue = if(aCondition) 5 else 3; //If aCondition was true, it returned 5/ if aCondition was false, it returned 3; //IF EXPRESSION
  println(aConditionedValue);
  println(if(aCondition) 5 else 3);
  println(1 + 3);

  var i = 0;
  //This generates an unit:
  val aWhile = while (i < 10)
    {
      println(i);
      i += 1;
    } //side effects;

  //while
  var j = 0;
  //This generates an unit:
  while (j < 10)
  {
    println(j);
    j += 1;
  } //side effects;

  //NEVER WRITE THIS AGAIN;
  //Is a imperative code;

  //EVERYTHING in scala is an expression;
  val aWeirdValue = (aVariable = 3); //Unit === void
  println(aWeirdValue);

  //side effects: println(), whiles, reassigning (imperative programming);

  //code blocs
  //is an expression
  val aCodeBlock =
    {
      val y = 2;
      val z = y + 1;
      if (z > 2) "hello" else "goodbye";
    }
  println(aCodeBlock);
  //Instructions are executed, like Java;
  //Expressions are evaluated, like Scala;

  // val anotherValue = z + 1;
  //don't use while loops in Scala;

  //1. difference between "hello world" vs println("hello world")?
  //R = String "hello world" is a value of type string, string literal/ println("hello world") is a expression (side effect);
  //2.
  val someValue =
    {
      2 < 3; //return a boolean
    }

  val someOtherValue =
    {
      if(someValue) 239 else 986;
      42;
    }
    println(someOtherValue);
}
