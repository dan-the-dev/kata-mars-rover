package strategy

class MoveForwardStrategy : MoveStrategy {
    override fun execute(value: Int): Int {
        return value+1
    }
}