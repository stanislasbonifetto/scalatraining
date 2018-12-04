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
}