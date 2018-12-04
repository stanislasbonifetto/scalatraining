package it.stanislas.courses.scala.calculator

import org.scalacheck.Properties

object CalculatorCheckSpec extends Properties("Calculator") {
  import org.scalacheck.Prop.forAll

  property("sum") = forAll { (a: Int, b: Int) =>
    Calculator.sum(a, b) == a + b
  }

  property("subtract") = forAll { (a: Int, b: Int) =>
    Calculator.subtract(a, b) == a - b
  }

  property("multiply") = forAll { (a: Int, b: Int) =>
    Calculator.multiply(a, b) == a * b
  }

  property("divide") = forAll { (a: Int, b: Int) =>
    Calculator.divide(a, b) == a / b
  }

}