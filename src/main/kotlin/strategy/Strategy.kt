package strategy

interface Strategy<T> {
    fun execute(value: T) : T
}

