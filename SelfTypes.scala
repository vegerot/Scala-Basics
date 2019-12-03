object SelfTypes {
  trait User {
    def username: String
  }

  trait Tweeter {
    this: User =>
    def tweet(tweetText: String) = println(s"$username: $tweetText")
  }

  class VerifiedTweeter(val username_ : String) extends User with Tweeter {
    def username = s"real $username_"
  }
  def main(args: Array[String]): Unit = {
    val `👩🏿‍🎤` = new VerifiedTweeter("Beyoncé")
    `👩🏿‍🎤`.tweet("Just spilled my glass of lemonade")

  }
}
