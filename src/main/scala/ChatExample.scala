import commands.{DeleteMessage, SendMessage}
import db.ChatDB
import model.{Message, Sender}

object ChatExample {
  def main(args: Array[String]): Unit = {
    val senderIvan = Sender("Ivan")
    val message = Message(sender = senderIvan, text = "Hello I am Ivan")
    val senderMaria = Sender("Maria")
    val senderJohn = Sender("John")
    val chat = ChatDB(senderIvan, "Hello I am Ivan")
    chat.addMessage(Message(senderIvan, "How are u?"))
    chat.addObserver(senderJohn)
    chat.addObserver(senderMaria)
    chat.addMessage(Message(senderIvan, "Nice to meet you"))
    chat.addMessage(Message(senderMaria, "I am amazing! Thanks!"))
    chat.issueCommand(SendMessage(message))
    chat.issueCommand(DeleteMessage(message))
    chat.showHistory()

  }
}
