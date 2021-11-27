package model

import db.Chat
import observer.Observer

case class Sender(name: String) extends Observer[Chat] {

  override def handleUpdate(chat: Chat): Unit = {
    System.out.println(s"Hey, I'm ${name}. I send in chat a new message:)${chat.messages}")
  }
}
