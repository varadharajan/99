import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob25Test extends AnyFlatSpec with Matchers  {
  "permute" should "generate a perumation of the list" in {
    val permute1 = Prob25.permute((0 to 10).toList)
    val permute2 = Prob25.permute((0 to 10).toList)
    permute1 == permute2 shouldBe false
    permute1.length shouldBe (0 to 10).length
    permute2.length shouldBe (0 to 10).length
  }
}
