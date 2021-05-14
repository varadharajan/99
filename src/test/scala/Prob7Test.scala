import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob7Test extends AnyFlatSpec with Matchers {
  "flatten" should "return empty list for empty list" in {
    Prob7.flatten(List()) shouldBe List()
  }

  "flatten" should "flatten depth of 1 level" in {
    Prob7.flatten(List(1, List(2), 3)) shouldBe List(1,2,3)
  }

  "flatten" should "flatten depth of multiple level" in {
    Prob7.flatten(List(1, List(2, List(4)), 3)) shouldBe List(1,2,4, 3)
  }
}
