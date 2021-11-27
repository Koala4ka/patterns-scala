package db

import commands.MessageCommand
import reciver.Message

import scala.collection.mutable.ListBuffer

class ChatDB {

//  val chat = ListBuffer[Message]()
//
//  def sendMessages(message: Message): Unit = {
//    message +=: chat
//  }

  val comands = ListBuffer[MessageCommand]()

  def issueCommand(command: MessageCommand): Unit = {
    command +=: comands
    command.execute()
  }

  def showHistory(): Unit = {
    comands.foreach(println)
  }
}


