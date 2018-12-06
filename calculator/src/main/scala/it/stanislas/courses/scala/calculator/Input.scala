package it.stanislas.courses.scala.calculator

sealed trait Input
case class ValidInput(first: Double, operator: String, second: Double) extends Input
case class InValidInput(message: String) extends Input

