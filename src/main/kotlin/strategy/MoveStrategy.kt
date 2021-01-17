package strategy

interface MoveStrategy : Strategy<Int> {
    override fun execute(value: Int): Int
}

