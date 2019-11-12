import scala.util.Random
object PatternMatching
{
  
  abstract class Notification
  
  case class Email(sender: String, title: String, body: String) extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification
  
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender,title,_) =>
        s"You got an email from $sender with title: $title"
      case SMS(number,message)=>
      s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name,link)=>
      s"You received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
  
  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String =
  {
    notification match {
      case Email(sender, _,_) if importantPeopleInfo.contains(sender) =>
      "You . got an email from special"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
      "You got an SMS from special"
      case other =>
      showNotification(other)
    }
  }
  
  abstract class Device
  
  case class Phone(model: String) extends Device {
    def screenOff: String = "Turning screen off"
  }
  
  case class Computer(model: String) extends Device {
    def screenSaverOn = "Turning screen saver on..."
  }
  
  def goIdle(device: Device): String = device match {
    case p: Phone => p.screenOff
    case c:  Computer => c.screenSaverOn
  }

  sealed abstract class Furniture
  case class Couch() extends Furniture
  case class Chair() extends Furniture

  def findPlaceToSit(piece: Furniture): String = piece match {
    case _: Couch => "Lie on the couch"
    case _: Chair => "Sit on the chair"
  }
  
  def main(args: Array[String]): Unit=
  {
    val x: Int = Random.nextInt(10)
    
    def matchTest(x: Int): String = x match {
      case 0 =>"zero"
      case 1 => "one"
      case 2 => "two" 
      case _ => "other"
    }
    println(matchTest(3))
    println(matchTest(1))
    println(matchTest(2))
    
    val someSms: SMS = SMS("12345", "Are you there?")
    val someVoiceRecording: VoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    
    println(showNotification(someSms))
    println(showNotification(someVoiceRecording))
    
    
    val importantPeopleInfo: Seq[String] = Seq("867-5309", "jenny@gmail.com")
    
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")
    
    println(showImportantNotification(someSms, importantPeopleInfo)) //prints You got an SMS from 123-4567! Message: Are you there?
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo)) //prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
    println(showImportantNotification(importantEmail, importantPeopleInfo)) //prints You got an email from special someone!
    
    println(showImportantNotification(importantSms, importantPeopleInfo)) //prints You got an SMS from special someone!
    
  }
}
