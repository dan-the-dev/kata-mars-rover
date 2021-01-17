package strategy

interface TurnStrategy : Strategy<String> {
    override fun execute(value: String): String
}

