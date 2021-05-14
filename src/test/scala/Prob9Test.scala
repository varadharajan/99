import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob9Test extends AnyFlatSpec with Matchers {
  "pack" should "return empty for empty list" in {
    Prob9.pack(List()) shouldBe List()
  }

  "pack" should "return packed list" in {
    Prob9.pack(List(1,1,2,3,3,4,1)) shouldBe List(List(1,1), List(2), List(3,3), List(4), List(1))
  }
}
