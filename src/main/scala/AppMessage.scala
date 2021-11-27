import commands.{CopyMessage, DeleteMessage, ResentMessage, SendMessage}
import db.ChatDB
import reciver.Message

object AppMessage {
  def main(args: Array[String]): Unit = {
    val message = Message()
    val chatDb = new ChatDB
    chatDb.issueCommand(SendMessage(message))
    chatDb.issueCommand(CopyMessage(message))
    chatDb.issueCommand(ResentMessage(message))
    chatDb.issueCommand(DeleteMessage(message))
    chatDb.showHistory()
  }
}