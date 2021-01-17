class SouthCardinalPoint(): CardinalPoint {
    override fun label(): String {
        return "South"
    }

    override fun right(): CardinalPoint {
        return WestCardinalPoint()
    }

    override fun left(): CardinalPoint {
        return EastCardinalPoint()
    }
}