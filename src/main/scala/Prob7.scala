object Prob7 {
//  def flatten(xs: List[Any]): List[Any] = xs.foldLeft(List.empty[Any]) { (acc, el) =>
//    el match {
//      case a: List[_] => acc ++ flatten(a)
//      case x => acc ++ List(x)
//    }
//  }

  def flatten(xs: List[Any]): List[Any] = xs flatMap { el =>
    el match {
      case x: List[_] => flatten(x)
      case x => List(x)
    }
  }
}
