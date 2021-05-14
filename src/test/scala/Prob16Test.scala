import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob16Test extends AnyFlatSpec with Matchers {
  "dropN" should "return empty list" in {
    Prob16.dropN(List(), 1) shouldBe List()
  }

  "dropN" should "return list with multiples of n dropped" in {
    Prob16.dropN(List(1,2,3,4,5), 2) shouldBe List(1,3,5)
  }
}
