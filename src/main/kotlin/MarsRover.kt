class MarsRover {
    private var facingCardinal: CardinalPoint = NorthCardinalPoint()
    private var coordinates: Coordinates = Coordinates(0, 0)

    fun exec(commandsString: String)
    {
        val commands = commandsString.toCharArray()
        commands.forEach {
            when (it) {
                'F' -> this.coordinates = this.coordinates.incrementLatitude()
                'B' -> this.coordinates = this.coordinates.decrementLatitude()
                'R' -> this.facingCardinal = this.facingCardinal.right()
                'L' -> this.facingCardinal = this.facingCardinal.left()
            }
        }
    }

    fun facingAt(): CardinalPoint {
        return facingCardinal
    }

    fun coordinates(): Coordinates {
        return this.coordinates
    }
}
