import Prob1._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Test1 extends AnyFlatSpec with Matchers {
  "lastInBuilt" should "return the last element of a non-empty list" in {
    lastInBuilt(List(1,2,3)) shouldBe Some(3)
    lastInBuilt(List("a", "b", "c")) shouldBe Some("c")
  }

  "lastInBuilt" should "return None for empty list" in {
    lastInBuilt(List()) shouldBe None
  }

  "last" should "return the last element of a non-empty list" in {
    last(List(1,2,3)) shouldBe Some(3)
    last(List("a", "b", "c")) shouldBe Some("c")
  }

  "last" should "return None for empty list" in {
    last(List()) shouldBe None
  }

  "lastFold" should "return the last element of a non-empty list" in {
    lastFold(List(1,2,3)) shouldBe Some(3)
    lastFold(List("a", "b", "c")) shouldBe Some("c")
  }

  "lastFold" should "return None for empty list" in {
    lastFold(List()) shouldBe None
  }
}
