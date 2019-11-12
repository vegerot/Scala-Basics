object CaseClass
{
    case class Book(isbn: String)
    
    case class Message(var sender: String, recipient: String, body: String)
    def main(args: Array[String]): Unit =
    {
        //defining
        val frankenstein: Book = Book("978-0486282114")
        val message1: Message = Message("max@example.com", "jack@jack.com", "who are you?")
        println(message1.sender)
        message1.sender="tim@apple.com"
        println(message1.sender)
        
        //comparison
        val message2: Message = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
        val message3: Message = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
        val messagesAreTheSame: Boolean = message1 == message3 
        
        //copying
        val message4: Message = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
        val message5: Message = message4.copy(sender = message4.recipient, recipient = "claire@bourogne.fr")
        println(message5.sender)
        println(message5.recipient)
        println(message5.body)


    }

}