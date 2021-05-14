import scala.annotation.tailrec

object Prob4 {
//  def length[T](xs: List[T]): Int = xs.length

//  def length[T](xs: List[T]): Int = xs.foldLeft[Int](0){(acc, _) => acc + 1}

  def length[T](xs: List[T]): Int = {
    @tailrec
    def loop(xss: List[T], count: Int): Int = xss match {
      case Nil => count
      case _ :: t => loop(t, count + 1)
    }

    loop(xs, 0)
  }
}
