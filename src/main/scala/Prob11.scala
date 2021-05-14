object Prob11 {
  def mrle[T](xs: List[T]): List[Any] = Prob10.rle(xs).map {
    case (1, x) => x
    case x => x
  }
}
