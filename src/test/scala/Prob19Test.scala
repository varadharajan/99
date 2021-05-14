import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob19Test extends AnyFlatSpec with Matchers {
  "rotate" should "return empty list" in {
    Prob19.rotate(4, List()) shouldBe List()
  }

  "rotate" should "rotate to left" in {
    Prob19.rotate(2, List(1,2,3,4,5)) shouldBe List(3,4,5,1,2)
  }

  "rotate" should "rotate to right" in {
    Prob19.rotate(-2, List(1,2,3,4,5)) shouldBe List(4,5,1,2,3)
  }
}
