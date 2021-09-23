class MainTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Main.kindMatcher") {
    val obj1 = SomeClass(1, "Some description", Some(666))
    val obj2 = SomeClass(1, "Some description", Some(667))
    val obj3 = SomeClass(1, "Some description", None)
    assert(Main.kindMatcher(obj1) == "Even")
    assert(Main.kindMatcher(obj2) == "Some description")
    assert(Main.kindMatcher(obj3) == "Unknown")
  }

  test("Main.sumOfOddNumbersInASequence") {
    val seq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(Main.sumOfOddNumbersInASequence(seq) == 25)
  }
}