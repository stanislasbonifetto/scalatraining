package it.stanislas.courses.scala.calculator

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class CalculatorSpec extends WordSpec {
  private val a = 1
  private val b = 3

  "A Calculator" when{
    "sum" should {
      "a + b" in {
        Calculator.sum(a, b) should === (a + b)
      }
    }
  }

  "A Calculator" when{
    "subtract" should {
      "a - b" in {
        Calculator.subtract(a, b) should === (a - b)
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
