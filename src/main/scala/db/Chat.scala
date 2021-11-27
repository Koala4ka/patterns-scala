package db

import model.{Message, Sender}
import observer.Observable

import scala.collection.mutable.ListBuffer

case class Chat(sender: Sender, text: String) extends Observable[Chat] {
  val messages = ListBuffer[Message]()
  def addMessage(message: Message): Unit = {
    messages.+=:(message)
    notifyObservers()
  }
}