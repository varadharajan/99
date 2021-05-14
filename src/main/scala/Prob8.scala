import scala.annotation.tailrec

object Prob8 {
//  def compress[T](xs: List[T]): List[T] = xs.foldLeft((List(xs.headOption), xs.headOption)) {(acc, el) =>
//    Option(el) match {
//      case acc._2 => acc
//      case x => (x :: acc._1, x)
//    }
//  }._1.flatten.reverse

  def foo = 1

  def compress[T](xs: List[T]): List[T] = xs match {
    case Nil => List()
    case _ => {
      @tailrec
      def loop(xss: List[T], acc: List[T], lastSeen: T): List[T] = xss match {
        case Nil => acc
        case h :: t if lastSeen == h => loop(t, acc, lastSeen)
        case h :: t => loop(t, acc ++ List(h), h)
      }

      loop(xs.drop(1), xs.take(1), xs.head)
    }
  }
}
