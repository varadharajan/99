case class Accumulator[T](full: List[List[T]], current: List[T]) {
  def lastSeen(): Option[T] = current.headOption
  def value(): List[List[T]] = full ++ List(current)
  def add(el: T): Accumulator[T] = Option(el) match {
    case x if x == lastSeen() => this.copy(full, el :: current)
    case x if current.nonEmpty => this.copy(full ++ List(current), List(el))
    case x => this.copy(full, List(el))
  }
}

object Accumulator {
  def apply[T](): Accumulator[T] = {
    Accumulator(List.empty[List[T]], List.empty[T])
  }
}

object Prob9 {
  def pack[T](xs: List[T]): List[List[T]] = xs.foldLeft(Accumulator[T]())(_.add(_)).value()
}
