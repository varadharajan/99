object Prob19 {
  def rotate[T](times: Int, xs: List[T]): List[T] = if (times >= 0) {
    xs.drop(times) ++ xs.take(times)
  } else {
    xs.takeRight(Math.abs(times)) ++ xs.dropRight(Math.abs(times))
  }
}
