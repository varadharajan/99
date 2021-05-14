object Prob12 {
  def decode[T](xs: List[(Int, T)]): List[T] = xs.flatMap { el =>
    List.fill(el._1)(el._2)
  }
}
