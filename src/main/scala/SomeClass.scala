case class SomeClass(private var _id: Int, private var _description: String, private var _kind: Option[Int]) {
  def id: Int = _id

  def description: String = _description

  def kind: Option[Int] = _kind
}