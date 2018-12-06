package it.stanislas.courses.scala.calculator

object Calculator {

  def sum(a : Int, b: Int) = a + b

  def subtract(a : Int, b : Int) = sum(a, -b)

  def multiply(a: Int, b: Int) = a * b

//TODO: deve restituire un tipo diverso perchè deve contenere il caso non valido
  def divide(a: Int, b: Int) = {
    if(b == 0)
      0
    else
      a / b
  }

//TODO: usare Either! e gestire errore
  def calculate(a : Double, operator : String, b: Double): Result = {
    operator match {
      case "+" => Number(a + b)
      case "-" => Number(a - b)
      case "*" => Number(a * b)
      case "/" => Number(a / b)
      case _ => Error("Any operator")
    }
  }

}