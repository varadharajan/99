object Prob10 {
  def rle[T](xs: List[T]): List[(Int, T)] = xs match {
    case Nil => List()
    case _ =>  Prob9.pack(xs).map { el => (el.length, el.head) }
  }
}
