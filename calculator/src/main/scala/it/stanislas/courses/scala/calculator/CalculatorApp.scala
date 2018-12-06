package it.stanislas.courses.scala.calculator


object CalculatorApp {
  println("Calculator")

  def main(args: Array[String]): Unit = {

    val input = parsArgs(args)

    val result = calculateInput(input)

    println(result)
  }

  def parsArgs(args: Array[String]) : Input = {
    args.length match {
      case 3 => ValidInput(args(0).toDouble, args(1), args(2).toDouble)
      case _ => InValidInput("Dude pass a calculation like: 1 + 2")
    }
  }

  def calculateInput(input: Input) : String = {
    input match {
      case validInput: ValidInput => calculate(validInput)
      case InValidInput(message) => message
    }
  }

  def calculate(input: ValidInput) : String = {
    val result = Calculator.calculate(input.first, input.operator, input.second)
    result match {
      case Number(number) => number.toString
      case Error(message) => message
    }
  }


}
