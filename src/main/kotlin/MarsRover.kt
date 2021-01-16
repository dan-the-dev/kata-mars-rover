class MarsRover {
    private var facing: String = NORTH
    private var latitude: Int = 0
    private var longitude: Int = 0

    fun exec(instructions: Instructions): Unit {
        instructions.instructions.forEach {
            val command = it.toString()
            if (command == FORWARD_COMMAND) {
                this.latitude++
            } else if (command == BACKWARD_COMMAND) {
                this.latitude--
            } else {
                this.facing = EAST
            }
        }
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
    }
}
