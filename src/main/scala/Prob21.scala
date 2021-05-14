object Prob21 {
  def insert[T](xs: List[T], idx: Int, el: T): List[T] = {
    val splits = xs.splitAt(idx)
    splits._2 match {
      case Nil => splits._1 ::: List.fill(idx - splits._1.length)(el) ::: List(el)
      case x => splits._1 ::: List(el) ::: splits._2
    }
  }
}
