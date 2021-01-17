class NorthCardinalPoint(): CardinalPoint {
    override fun label(): String {
        return "North"
    }

    override fun right(): CardinalPoint {
        return EastCardinalPoint()
    }

    override fun left(): CardinalPoint {
        return WestCardinalPoint()
    }
}