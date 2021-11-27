package db

import commands.MessageCommand
import model.{Message, Sender}
import observer.Observable

import scala.collection.mutable.ListBuffer

case class ChatDB(sender: Sender, text: String) extends Observable[ChatDB] {

  val messages = ListBuffer[Message]()
  def addMessage(message: Message): Unit = {
    messages.+=:(message)
    notifyObservers()
  }
  val comands = ListBuffer[MessageCommand]()

  def issueCommand(command: MessageCommand): Unit = {
    command +=: comands
    command.execute()
  }

  def showHistory(): Unit = {
    comands.foreach(println)
  }
}