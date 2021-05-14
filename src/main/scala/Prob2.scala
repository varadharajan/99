import scala.annotation.tailrec

object Prob2 {
//  def lastButOne[T](xs: List[T]): Option[T] = xs.takeRight(2).dropRight(1).headOption

  @tailrec
  def lastButOne[T](xs: List[T]): Option[T] = xs match {
    case h :: t :: Nil => Option(h)
    case h :: t :: x => lastButOne(t :: x)
    case h :: Nil => None
    case Nil => None
  }
}
