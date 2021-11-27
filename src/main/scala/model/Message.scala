package model

case class Message(sender: Sender, text: String) {

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

}