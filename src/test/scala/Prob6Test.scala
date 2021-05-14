import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob6Test extends AnyFlatSpec with Matchers {
  "palindrome" should "return true if string is palindrome" in {
    Prob6.palindrome(List(1,2,3,2,1)) shouldBe true
  }

  "palindrome" should "return false otherwise" in {
    Prob6.palindrome(List(1,2,3)) shouldBe false
  }
}
