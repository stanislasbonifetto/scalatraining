package it.stanislas.courses.scala.calculator

import it.stanislas.courses.scala.calculator.CalculatorApp.args

object CalculatorApp extends App {
  println("Calculator")

  args.length match {
    case 3 => printComputation(args)
    case _ => println("dude, i need at least one parameter")
  }

  def printComputation(args : Array[String]) {
    val a = args(0).toDouble
    val operator = args(1)
    val b = args(2).toDouble

    val (v, m) = Calculator.calculate(a, operator, b)
    val message = prepareMessage(v, m)
    println(message)
  }

  def prepareMessage(v : Option[Double], message:  Option[String]) : String = {
    return (v, message) match {
      case (x, None) => x.get.toString
      case (None, m) => m.get
      case _ => "Something goes wrong"
    }
  }




}
