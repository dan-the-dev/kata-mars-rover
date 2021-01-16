class MarsRover {
    const val FORWARD_COMMAND = "F"

    private var latitude: Int = 0
    private var longitude: Int = 0

    fun exec(instructions: Instructions): Unit {
        instructions.instructions.forEach {
            if(it.toString() == FORWARD_COMMAND) {
                this.latitude++
            } else {
                this.latitude--
            }
        }
    }

    fun latitude(): Int {
        return this.latitude
    }

    fun longitude(): Int {
        return this.longitude
    }
}