import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob5Test extends AnyFlatSpec with Matchers {
  "reverse" should "reverse the list" in {
    Prob5.reverse(List(1,2,3)) shouldBe List(3,2,1)
  }

  "reverse" should "return empty list for empty list" in {
    Prob5.reverse(List()) shouldBe List()
  }
}
