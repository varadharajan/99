import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Prob21Test extends AnyFlatSpec with Matchers {
//  "insert" should "insert the element at last for out of bounds index" in {
//    Prob21.insert(List(1,2,3), 10, 4) shouldBe List(1,2,3,4)
//  }

  "insert" should "insert the element at last for out of bounds index" in {
    Prob21.insert(List(1,2,3), 10, 4) shouldBe List(1,2,3,4,4,4,4,4,4,4,4)
  }

  "insert" should "insert into the right index" in {
    Prob21.insert(List(1,2,3), 1, 4) shouldBe List(1,4,2,3)
  }
}
