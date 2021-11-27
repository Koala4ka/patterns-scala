package commands

import model.Message

case class CopyMessage (message: Message) extends MessageCommand {

  override def execute(): Unit = message.copy()

}
