object Prob16 {
  def dropN[T](xs: List[T], n: Int): List[T] = xs.zipWithIndex.filterNot { el => (el._2 + 1) % n == 0}.map(_._1)
}
