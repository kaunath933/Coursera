package week1

object sqrt1 extends App {
  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)


    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001 //(guess * guess - x)/x divided by x is reqd for very large and small nos

    def improve(guess: Double, x: Double) = (guess + x / guess) / 2


    def abs(x: Double) = if (x < 0) -x else x

    sqrtIter(1.0, x)
  }

  println(sqrt(2))
  println(sqrt(6))
  println(sqrt(1e-8))
  println(sqrt(1e+30))
}

