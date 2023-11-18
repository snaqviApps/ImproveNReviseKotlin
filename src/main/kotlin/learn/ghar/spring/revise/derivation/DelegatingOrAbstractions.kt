package learn.ghar.spring.revise.derivation

fun main(){

    val gameScore = 15
    val game : Game = Tennis(gameScore)  // Instance 'type' (Game) can be abstract, not Instance-itSelf, or we can't instantiate an abstract class
    playGame(game)
    playGame(Tennis(gameScore))

    val tableTennis = TableTennis()
    tableTennis.score = 1      // will cause an exception
//    if(tableTennis.score < 0) tableTennis.score = 0
    tableTennis.play()
}

fun playGame(game: Game) {
    game.play()
}

/**
 * abstract classes:
 *
 * 1. cannot be instantiated ,but could be of 'type'
 * 2. can have states (properties), and behaviors (methods)
 * 3. properties can be initialized (not needed though), can be overridden-then used
 */
abstract class Game() {
    abstract var score: Int
    abstract fun play()
}

abstract class BallGame(val name: String) : Game()

class Tennis(override var score: Int) : BallGame("Tennis") {

    override fun play() {
        println("Playing $name game, score: $score")
    }
}

/** Table tennis (also known as ping-pong) is a racket sport derived from tennis */
class TableTennis : BallGame("known as ping-pong") {
    private var _score : Int = 0
    override var score: Int
        get() = _score                  // _scroe used as backing-field
        set(value) {
            if(value < 0) throw Exception()
            _score = value
        }

    override fun play() {
        println("this is called also: $name")
    }
}

/** backing field assigned to overridden parameters */