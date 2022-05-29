package lectures.part1basics

object DefaultArgs extends App
{
  def trFact(n: Int, acc: Int): Int =
    if(n <= 1) acc;
    else trFact(n-1, n * acc);

  val fact10 = trFact(10, 2);

  def savePicture(format: String, width: Int = 1920, height: Int = 1080): Unit = println("saving picture");
  savePicture(format = "jpg", width = 1080, height = 720);

  /*
  * 1. Pass in every leading argument;
  * 2. Name the arguments;
  * */

  savePicture(height = 600, width = 800, format = "bmp");

  def greet(name: String = "Superman", age: Int = 10): String =
    s"Hi, I'm $name and i have $age years old." //s in begin defines that the parameters will be strings;

  println(greet());
}
