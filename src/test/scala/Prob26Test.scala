import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob26Test extends AnyFlatSpec with Matchers {
  "combinations" should "return all the combinations from a list" in {
    val results = Prob26.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    results.length shouldBe 220
  }
}
