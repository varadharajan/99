import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob11Test extends AnyFlatSpec with Matchers {
  "mrle" should "return empty list for empty list" in {
    Prob11.mrle(List()) shouldBe List()
  }

  "mrle" should "return run length encoded list" in {
    Prob11.mrle(List(1,1,2,3,3,1)) shouldBe List((2,1), 2, (2,3), 1)
  }
}
