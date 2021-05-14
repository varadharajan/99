object Prob20 {

  def remove[T](idx: Int, xs: List[T]): (List[T], Option[T]) = {
    case class Accumulator[T](xs: List[T], el: Option[T])
    val acc = xs.zipWithIndex.foldLeft[Accumulator[T]](Accumulator(List(), None)) { (acc, el) =>
      if(el._2 == idx) {
        Accumulator(acc.xs, Option(el._1))
      } else { Accumulator(acc.xs ++ List(el._1), acc.el) }
    }
    (acc.xs, acc.el)
  }
}
