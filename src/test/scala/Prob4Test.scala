import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob4Test extends AnyFlatSpec with Matchers {
  "length" should "return correct length for a non-empty list" in {
    Prob4.length(List(1,2,3)) shouldBe 3
  }

  "length" should "return 0 for an empty list" in {
    Prob4.length(List()) shouldBe 0
  }
}
