import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob14Test extends AnyFlatSpec with Matchers {
  "double" should "return empty list" in {
    Prob14.double(List()) shouldBe List()
  }

  "double" should "return list duplicating each element" in {
    Prob14.double(List(1,2,2,3)) shouldBe List(1,1,2,2,2,2,3,3)
  }
}
