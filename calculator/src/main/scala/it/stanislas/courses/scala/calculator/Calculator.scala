package it.stanislas.courses.scala.calculator

object Calculator {

  def sum(a : Int, b: Int) = a + b

  def subtract(a : Int, b : Int) = sum(a, -b)

  def multiply(a: Int, b: Int) = a * b

  def divide(a: Int, b: Int) = {
    if(b == 0)
      0
    else
      a / b
  }

  def calculate(a : Double, operator : String, b: Double): (Option[Double], Option[String]) = {
    return operator match {
      case "+" => (Some((a + b)), None)
      case "-" => (Some((a - b)), None)
      case "*" => (Some((a * b)), None)
      case "/" => (Some((a / b)), None)
      case _ => (None, Some("Any operator"))
    }
  }

}