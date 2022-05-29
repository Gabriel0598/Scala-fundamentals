package lectures.part1basics

object CBNvsCBV extends App
{
  def calledByValue(x: Long): Unit =
    {
      println("by value: " + x);
      println("by value: " + x);
      //println("by value: " + 652057367395900L);
      //println("by value: " + 652057367395900L);
    }

  //=> to late evaluated expression passed like parameter, used in lazy streams
  def calledByName(x: => Long): Unit =
    {
      println("by name: " + x);
      println("by name: " + x);
      //println("by name: " + System.nanoTime());
      //println("by name: " + System.nanoTime());
    }

  calledByValue(System.nanoTime());
  calledByName(System.nanoTime());

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x);

  //printFirst(infinite(), 34); //generates a stack overflow
  printFirst(34, infinite()); //this arrow function returns the correct expression called by name
}
