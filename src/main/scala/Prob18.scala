object Prob18 {
  def slice[T](start: Int, end: Int, xs: List[T]): List[T] =
    xs
      .zipWithIndex
      .filter { x => x._2 >= start && x._2 <= end}
      .map(_._1)

}
