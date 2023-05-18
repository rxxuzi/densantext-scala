import scala.Function.const
import scala.concurrent.duration.Duration.Inf.+
import scala.math.Fractional.Implicits.infixFractionalOps
import scala.math.Integral.Implicits.infixIntegralOps
import scala.math.Numeric.BigDecimalAsIfIntegral.mkNumericOps
import scala.math.Numeric.ShortIsIntegral.mkNumericOps

package object chapter0 {
  val x = 10
  val one = 1
  private val add = (x: Int, y: Int) => x + y
  val msg = "Hello World!"
}
