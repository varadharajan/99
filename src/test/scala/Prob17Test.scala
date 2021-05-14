import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob17Test extends AnyFlatSpec with Matchers {
  "split" should "return empty list for empty list" in {
    Prob17.split(3, List()) shouldBe (List(), List())
  }

  "split" should "split the input list into two partitions" in {
    Prob17.split(3, List(1,2,3,4,5,6,7)) shouldBe (List(1,2,3), List(4,5,6,7))
  }
}
