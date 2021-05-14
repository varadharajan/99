import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob22Test extends AnyFlatSpec with Matchers {
  "range" should "return range" in {
    Prob22.range(5,8) shouldBe List(5,6,7,8)
  }
}
