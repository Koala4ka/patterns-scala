package commands

import reciver.Message

case class ResentMessage( message: Message) extends MessageCommand {

  override def execute(): Unit = message.resent()
}
