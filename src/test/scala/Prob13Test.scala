import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob13Test extends AnyFlatSpec with Matchers {
  "rle" should "return empty string" in {
    Prob13.rle(List()) shouldBe List()
  }

  "rle" should "return encoded string" in {
    Prob13.rle(List(1,1,1,2,2,3,1)) shouldBe List((3,1), (2, 2), (1, 3), (1,1))
  }
}
