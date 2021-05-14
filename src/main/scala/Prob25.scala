object Prob25 {
  def permute[T](xs: List[T]): List[T] = Prob23.randomSelect(xs.length, xs)
}
