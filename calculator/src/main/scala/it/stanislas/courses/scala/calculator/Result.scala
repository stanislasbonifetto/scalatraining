package it.stanislas.courses.scala.calculator

sealed trait Result
final case class Number(number: Double) extends Result
final case class Error(string: String) extends Result
