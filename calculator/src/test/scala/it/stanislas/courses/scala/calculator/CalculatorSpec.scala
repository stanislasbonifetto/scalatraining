package it.stanislas.courses.scala.calculator

import org.scalatest.WordSpec

class CalculatorSpec extends WordSpec {
  def a = 1
  def b = 3

  "A Calculator" when{
    "sum" should {
      "a + b" in {
        assert(Calculator.sum(a, b) == (a + b))
      }
    }
  }

  "A Calculator" when{
    "subtract" should {
      "a - b" in {
        assert(Calculator.subtract(a, b) == (a - b))
      }
    }
  }

  "A Calculator" when{
    "multiply" should {
      "a * b" in {
        assert(Calculator.multiply(a, b) == (a * b))
      }
    }
  }


  "A Calculator" when{
    "divide" should {
      "a / b" in {
        assert(Calculator.divide(a, b) == (a / b))
      }
    }
  }
}
