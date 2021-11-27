package commands

import model.Message

case class SendMessage( message: Message) extends MessageCommand {

  override def execute(): Unit = message.send()
}
