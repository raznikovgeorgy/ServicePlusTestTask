object Main extends App {
  val obj = SomeClass(1, "Some description", Some(666))
  println(optionalChecker(obj))

  def optionalChecker(obj: SomeClass): String = {
    if (obj.getKind.isEmpty)
      "Unknown"
    else if (obj.getKind.get % 2 == 0)
      "Even"
    else
      obj.getDescription
  }

  val seq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  print(sumOfOddNumbersInASequence(seq))

  def sumOfOddNumbersInASequence(seq: Seq[Int]) = {
    var sum = 0
    seq.foreach((element: Int) => if (element % 2 != 0) sum = sum + element)
    sum
  }
}