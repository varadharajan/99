import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob23Test extends AnyFlatSpec with Matchers {
  "randomSelect" should "return max elements if list is small" in {
    Prob23.randomSelect(3, List(1)) shouldBe List(1)
  }

  "randomSelect" should "return elements randomly from list" in {
    val orig = List(1,2,3,4,5)
    val xs = Prob23.randomSelect(3, orig)
    xs.length shouldBe 3
    xs.forall(orig.contains) shouldBe true
  }
}
