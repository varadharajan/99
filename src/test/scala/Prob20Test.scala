import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob20Test extends AnyFlatSpec with Matchers {
  "remove" should "return empty list" in {
    Prob20.remove(10, List()) shouldBe (List(), None)
  }

  "remove" should "handle out of bound exception" in {
    Prob20.remove(100, List(1,2,3)) shouldBe (List(1,2,3), None)
  }

  "remove" should "remove from list and return in result" in {
    Prob20.remove(1, List(1,2,3)) shouldBe (List(1,3), Some(2))
  }
}
