package strategy

class MoveBackwardStrategy : MoveStrategy {
    override fun move(position: Int): Int {
        return position-1
    }
}