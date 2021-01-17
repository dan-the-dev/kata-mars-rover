import strategy.*

class MarsRover {
    private var facing: String = NORTH
    private var latitude: Int = 0
    private var longitude: Int = 0
    private var context: MoveStrategyContext = MoveStrategyContext()

    fun exec(instructions: Instructions): Unit {
        instructions.instructions.forEach {
            val command: String = it.toString()
            val strategy: Strategy<Any> = identifyStrategy(command)
            this.context.setStrategy(strategy)
            executeCommand()
        }
    }

    private fun identifyStrategy(command: String): Strategy<Any> {
        var strategy: Strategy<Any>? = null
        if (command == FORWARD_COMMAND) {
            strategy = MoveForwardStrategy()
        } else if (command == BACKWARD_COMMAND) {
            strategy = MoveBackwardStrategy()
        } else if (command == RIGHT_COMMAND) {
            strategy = TurnRightStrategy()
        }
        return strategy!!
    }

    private fun executeCommand() {
        this.latitude = this.context.execute(this.latitude)
    }

    fun latitude(): Int {
        return this.latitude
    }

    fun longitude(): Int {
        return this.longitude
    }

    fun facing(): String {
        return this.facing
    }

    companion object {
        const val FORWARD_COMMAND = "F"
        const val BACKWARD_COMMAND = "B"

        const val RIGHT_COMMAND = "R"
        const val LEFT_COMMAND = "L"

        const val NORTH = "North"
        const val EAST = "East"
        const val SOUTH = "South"
        const val WEST = "West"
    }
}
