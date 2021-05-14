import scala.annotation.tailrec

object Prob17 {
//  def split[T](times: Int, xs: List[T]): (List[T], List[T]) = (xs.take(times), xs.drop(times))

  def split[T](times: Int, xs: List[T]): (List[T], List[T]) = {
    @tailrec
    def loop(xs: List[T], times: Int, acc: List[T] = List()): (List[T], List[T]) = (xs, times) match {
      case (h :: t, 1) => (h :: acc, t)
      case (h :: t, x) if x > 1 => loop(t, x - 1, h :: acc)
      case _ => (acc, xs)
    }
    val result = loop(xs, times)
    (result._1.reverse, result._2)
  }
}
