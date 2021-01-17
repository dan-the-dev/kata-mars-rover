import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.Ignore

internal class MarsRoverTest() {

    private lateinit var marsRover: MarsRover

    @BeforeEach
    fun init() {
        this.marsRover = MarsRover()
    }

    @Test
    fun testShallPass() {
        assertEquals(1, 1)
    }

    @Test
    fun testMarsRoverFaceNorthAsDefault() {
        assertEquals(NorthCardinalPoint().javaClass, this.marsRover.facingAt().javaClass)
    }

    @Test
    fun testMarsRoverIsAt0Latitude0LongitudeAsDefault() {
        assertEquals(Coordinates(0, 0), this.marsRover.coordinates())
    }

    @Test
    fun testItMovesLatitudeForwardByOneWhenReceivingFCommand() {
        this.marsRover.exec("F")

        assertEquals(Coordinates(1, 0), this.marsRover.coordinates())
    }

    @Test
    fun testItMovesLatitudeForwardByTwoWhenReceivingFFCommand() {
        this.marsRover.exec("FF")

        assertEquals(Coordinates(2, 0), this.marsRover.coordinates())
    }

    @Test
    fun testItMovesLatitudeForwardByTwoWhenReceivingFFFCommand() {
        this.marsRover.exec("FFF")

        assertEquals(Coordinates(3, 0), this.marsRover.coordinates())
    }

    @Test
    fun testItMovesLatitudeBackByOneWhenReceivingBCommand() {
        this.marsRover.exec("B")

        assertEquals(Coordinates(-1, 0), this.marsRover.coordinates())
    }

    @Test
    fun testItMovesLatitudeBackByThreeWhenReceivingBBBCommand() {
        this.marsRover.exec("BBB")

        assertEquals(Coordinates(-3, 0), this.marsRover.coordinates())
    }

    @Test
    fun testItTurnsToEastWhenReceivingRCommand() {
        this.marsRover.exec("R")

        assertEquals(EastCardinalPoint().javaClass, this.marsRover.facingAt().javaClass)
    }

    @Test
    fun testItTurnsToWestWhenReceivingLCommand() {
        this.marsRover.exec("L")

        assertEquals(WestCardinalPoint().javaClass, this.marsRover.facingAt().javaClass)
    }

}