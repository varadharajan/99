object Prob13 {
  def rle[T](xs: List[T]): List[(Int, T)] = xs match {
    case Nil => List()
    case _ => {
      val (curr, tail) = xs.span(x => x == xs.head)
      (curr.length, curr.head) :: rle(tail)
    }
  }
}
