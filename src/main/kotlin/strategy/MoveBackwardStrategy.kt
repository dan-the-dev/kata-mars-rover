package strategy

class MoveBackwardStrategy : MoveStrategy {
    override fun execute(value: Int): Int {
        return value-1
    }
}