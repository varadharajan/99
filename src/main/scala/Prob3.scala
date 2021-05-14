import scala.annotation.tailrec
import scala.util.Try

object Prob3 {
//  def kth[T](xs: List[T], idx: Int): Option[T] = Try(xs(idx)).toOption

//  def kth[T](xs: List[T], idx: Int): Option[T] = xs.slice(idx, idx + 1).headOption

  @tailrec
  def kth[T](xs: List[T], idx: Int): Option[T] = (xs, idx) match {
    case (h :: _, 0) => Some(h)
    case (_ :: t, n) if n > 0 => kth(t, n - 1)
    case _ => None
  }
}
