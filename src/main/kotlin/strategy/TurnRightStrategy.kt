package strategy

class TurnRightStrategy : TurnStrategy {
    override fun execute(value: String): String {
        return "East"
    }
}