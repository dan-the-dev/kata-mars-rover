package strategy

class MoveForwardStrategy : MoveStrategy {
    override fun move(position: Int): Int {
        return position+1
    }
}