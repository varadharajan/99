import scala.annotation.tailrec
import scala.util.Random

object Prob23 {

  def randomSelect[T](num: Int, xs: List[T]): List[T] = {
    @tailrec
    def loop(xss: List[T] = xs, select: List[T] = List(), times: Int = num): List[T] = {
      if(times == 0) select
      else xss match {
        case Nil => select
        case _ => {
          val subset = Prob20.remove(Random.nextInt(xss.length), xss)
          loop(subset._1, subset._2.get :: select, times - 1)
        }
      }
    }
    loop()
  }
}
