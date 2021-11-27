package model

import db.ChatDB
import observer.Observer

case class Sender(name: String) extends Observer[ChatDB] {

  override def handleUpdate(chat: ChatDB): Unit = {
    System.out.println(s"Hey, I'm ${name}. I send in chat a new message:)${chat.messages}")
  }
}
