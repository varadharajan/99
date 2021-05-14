import scala.util.Random

object Prob24 {

  def lotto(num: Int, max: Int): List[Int] = {
    val set = 0 to max
    (0 until num).foldLeft[List[Int]](List()) { (acc, _) =>
      set(Random.nextInt(set.length)) :: acc
    }
  }

}
