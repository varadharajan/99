import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob15Test extends AnyFlatSpec with Matchers {
  "repeat" should "return empty list" in {
    Prob15.repeat(List(), 1) shouldBe List()
  }

  "repeat" should "return list with elements repeated n times" in {
    Prob15.repeat(List(1,2,3), 3) shouldBe List(1,1,1,2,2,2,3,3,3)
  }
}
