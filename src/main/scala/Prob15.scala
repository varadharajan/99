object Prob15 {
  def repeat[T](xs: List[T], times: Int): List[T] = xs flatMap (List.fill(times)(_))
}
