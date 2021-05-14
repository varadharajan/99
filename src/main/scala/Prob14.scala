object Prob14 {
  def double[T](xs: List[T]): List[T] = xs.flatMap(List.fill(2)(_))
}
