package commands

import reciver.Message

case class DeleteMessage (message: Message) extends MessageCommand {

  override def execute(): Unit = message.delete()
}
