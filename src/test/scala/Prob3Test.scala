import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob3Test extends AnyFlatSpec with Matchers {
  "kth" should "return the kth elem of a valid list" in {
    Prob3.kth(List(1,2,3), 1) shouldBe Some(2)
  }

  "kth" should "return None if element does not exist" in {
    Prob3.kth(List(1,2,3), 3) shouldBe None
  }
}
