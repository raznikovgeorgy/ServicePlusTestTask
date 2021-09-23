object Main extends App {
  val obj = SomeClass(1, "Some description", Some(666))
  println(kindMatcher(obj))

  def kindMatcher(obj: SomeClass): String = obj.kind match {
    case None => "Unknown"
    case x if obj.kind.get % 2 == 0 => "Even"
    case _  => obj.description
  }

  val seq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  print(sumOfOddNumbersInASequence(seq))

  def sumOfOddNumbersInASequence(seq: Seq[Int]) = {
    seq.filter(_ % 2 != 0).sum
  }
}