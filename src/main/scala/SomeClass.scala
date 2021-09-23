case class SomeClass(private var id: Int, private var description: String, private var kind: Option[Int]) {
  def getId: Int = id

  def getDescription: String = description

  def getKind: Option[Int] = kind
}