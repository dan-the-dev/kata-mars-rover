package strategy

interface TurnStrategy {
    fun turn(cardinalPoint: String): String
}