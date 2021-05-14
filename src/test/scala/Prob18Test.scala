import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob18Test extends AnyFlatSpec with Matchers {
  "slice" should "retunr empty list" in {
    Prob18.slice(10,11, List()) shouldBe List()
  }

  "slice" should "retunr return valid slice" in {
    Prob18.slice(2, 4, List(1,2,3,4,5,6)) shouldBe List(3,4,5)
  }

  "slice" should "return empty list for out of bound slices" in {
    Prob18.slice(100, 120, List(1,2,3)) shouldBe List()
  }
}
