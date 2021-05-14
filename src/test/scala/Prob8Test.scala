import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob8Test extends AnyFlatSpec with Matchers {
  "compress" should "return empty list for empty list" in {
    Prob8.compress(List()) shouldBe List()
  }

  "compress" should "return the list after dropping consecutive repeated elems" in {
    Prob8.compress(List(1,1,2,2,2,3,3,1,1,3,2)) shouldBe List(1,2,3,1,3,2)
  }
}
