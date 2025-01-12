object Main {

  var uselessWords = List("le", "la", "du", "je", "tu", "il", "un")
  var positiveWords = List("adore", "aime", "bien")
  var negativeWords = List("haine", "déteste", "***")

  class tweet(var text : String, var positif : Float = 0, var negatif : Float = 0) {
    def tokenise() : Array[String] = {
      this.text.toLowerCase().replace("'", " ").split(" ").filter(!uselessWords.contains(_))
    }

    def isPositive() : Unit = {
      if(this.tokenise().exists(positiveWords.contains(_))) this.positif = 1
    }

    def isNegative() : Unit = {
      if(this.tokenise().exists(negativeWords.contains(_))) this.negatif = 1
    }
  }

  def main(args: Array[String]): Unit = {

    def displayTweetStat(tweets: List[tweet]) = {
      println("   Tweet   | Positif | Negatif")
      tweets.foreach(t => t.isPositive())
      tweets.foreach(t => t.isNegative())
      tweets.foreach(t => println(t.text + " | " + t.positif + " | " + t.negatif))
    }

    var test1 = new tweet("j'adore les chats et déteste les chiens")
    var test2 = new tweet("je suis heureux")
    var test3 = new tweet("hey j'adore ce que tu fais, continu ton travail")

    val tweets = List(test1, test2, test3)

    displayTweetStat(tweets)
  }
}