import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.Ignore

internal class MarsRoverTest {

    @Test
    fun testMarsRoverGoesForwardOnceWhenReceivingFCommand() {
        val marsRover = MarsRover()

        marsRover.exec(Instructions.fromString("F"))

        assertEquals(1, marsRover.latitude())
    }

    @Test
    fun testMarsRoverGoesForwardTwiceWhenReceivingFFCommand() {
        val marsRover = MarsRover()

        marsRover.exec(Instructions.fromString("FF"))

        assertEquals(2, marsRover.latitude())
    }

    @Test
    fun testMarsRoverGoesForwardThirdWhenReceivingFFFCommand() {
        val marsRover = MarsRover()

        marsRover.exec(Instructions.fromString("FFF"))

        assertEquals(3, marsRover.latitude())
    }

    @Test
    fun testMarsRoverGoesBackwardOnceWhenReceivingBCommand() {
        val marsRover = MarsRover()

        marsRover.exec(Instructions.fromString("B"))

        assertEquals(-1, marsRover.latitude())
    }

    @Test
    fun testMarsRoverGoesBackwardThirdWhenReceivingBBBCommand() {
        val marsRover = MarsRover()

        marsRover.exec(Instructions.fromString("BBB"))

        assertEquals(-3, marsRover.latitude())
    }

    @Test
    fun testMarsRoverWatchNorthWhenInstantiated() {
        val marsRover = MarsRover()

        assertEquals("North", marsRover.facing())
    }

    @Test
    @Ignore
    fun testMarsRoverWatchEastWhenMovedRight() {
        val marsRover = MarsRover()

        marsRover.exec(Instructions.fromString("R"))

        assertEquals("East", marsRover.facing())
    }
}