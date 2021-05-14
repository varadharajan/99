import scala.annotation.tailrec

object Prob1 {
  def lastInBuilt[T](xs: List[T]): Option[T] = xs.lastOption

  @tailrec
  def last[T](xs: List[T]): Option[T] = xs match {
    case Nil => None
    case h :: Nil => Some(h)
    case h :: t => last(t)
  }

  def lastFold[T](xs: List[T]): Option[T] = xs.foldLeft[Option[T]](None) {(acc, x) =>
    x match {
      case Nil => acc
      case h => Some(h)
    }
  }
}
