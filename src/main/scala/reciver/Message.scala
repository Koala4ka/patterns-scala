package reciver

//case class Message(sender: String,
//                   recipient: String,
//                   body: String) {
case class Message(){
  //  def copy(newSender: String = sender,
  //           newRecipient: String = recipient, newBody: String = body): Message =
  //    Message(newSender, newRecipient, newBody)
  //
  //  System.out.println("Message copied")
  //
  //  override def toString = s"Sender: $sender Recipient: $recipient Body: $body"
  def copy(): Unit = {
    System.out.println("Message copied")
  }

  def delete(): Unit = {
    System.out.println("Message removed")
  }

  def send(): Unit = {
    System.out.println("Message sent")
  }

  def resent(): Unit = {
    System.out.println("Message resented")
  }

//  val message1 = Message("Anna", "Kate", "hello,whats'up?")
//  val message2 = Message("Kate", "Anna", "I am fine and U?")


}
