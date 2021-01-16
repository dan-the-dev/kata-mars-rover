class MarsRover {
    private var latitude: Int = 0

    fun exec(instructions: Instructions): Unit {
        instructions.instructions.forEach {
            this.latitude++
        }
    }

    fun latitude(): Int {
        return this.latitude
    }
}