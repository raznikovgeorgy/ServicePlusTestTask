object Main extends App {
  def kindMatcher(obj: SomeClass): String = obj.kind match {
    case None => "Unknown"
    case x if obj.kind.get % 2 == 0 => "Even"
    case _ => obj.description
  }

  def sumOfOddNumbersInASequence(seq: Seq[Int]) = seq.filter(_ % 2 != 0).sum
}