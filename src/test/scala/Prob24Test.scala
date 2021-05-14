import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob24Test extends AnyFlatSpec with Matchers {
  "lotto" should "pick random elements from the list" in {
    val x = Prob24.lotto(5, 100)
    println(x)
    x.length shouldBe 5
    x.forall(List.range(0,100).contains) shouldBe true
  }
}
