object q2{
  def main(args: Array[String]):Unit={
  val number = scala.io.StdIn.readInt() 
  val temp = number match{
    case x if  x <= 0 => "Negative/Zero input"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
    }

  println(temp)
  }
}