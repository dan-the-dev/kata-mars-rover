class WestCardinalPoint(): CardinalPoint {
    override fun label(): String {
        return "West"
    }

    override fun right(): CardinalPoint {
        return NorthCardinalPoint()
    }

    override fun left(): CardinalPoint {
        return SouthCardinalPoint()
    }
}