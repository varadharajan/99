import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob2Test extends AnyFlatSpec with Matchers {
  "lastButOne" should "return the last but one element of a list of size >= 2" in {
    Prob2.lastButOne(List(1,2)) shouldBe Some(1)
    Prob2.lastButOne(List(1,2,3)) shouldBe Some(2)
  }

  "lastButOne" should "return None if List is of size 1" in {
    Prob2.lastButOne(List(1)) shouldBe None
  }

  "lastButOne" should "return None for empty list" in {
    Prob2.lastButOne(List()) shouldBe None
  }
}
