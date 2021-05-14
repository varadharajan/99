import scala.annotation.tailrec

object Prob5 {
//  def reverse[T](xs: List[T]): List[T] = xs.reverse

//  def reverse[T](xs: List[T]): List[T] = xs.foldLeft(List[T]()) { (acc, x) => x :: acc }

  def reverse[T](xs: List[T]): List[T] = {
    @tailrec
    def loop(xsOrig: List[T], reversed: List[T] = List()): List[T] = xsOrig match {
      case Nil => reversed
      case h :: t => loop(t, h :: reversed)
    }

    loop(xs)
  }
}
