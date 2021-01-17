class EastCardinalPoint(): CardinalPoint {
    override fun label(): String {
        return "East"
    }

    override fun right(): CardinalPoint {
        return SouthCardinalPoint()
    }

    override fun left(): CardinalPoint {
        return NorthCardinalPoint()
    }
}