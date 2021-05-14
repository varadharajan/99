import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob12Test extends AnyFlatSpec with Matchers {
  "decode" should "return empty list for empty list" in {
    Prob12.decode(List()) shouldBe List()
  }

  "decode" should "return decoded list" in {
    Prob12.decode(List((2,1), (3,2))) shouldBe List(1,1,2,2,2)
  }
}
