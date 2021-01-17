package strategy

class MoveStrategyContext() {
    private lateinit var strategy: Strategy<Any>

    fun setStrategy(strategy: Strategy<Any>) {
        this.strategy = strategy
    }

    fun execute(value: Any): Any {
        return this.strategy.execute(value)
    }
}