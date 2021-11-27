package observer

trait Observer[T] {

  def handleUpdate(message: T)
}