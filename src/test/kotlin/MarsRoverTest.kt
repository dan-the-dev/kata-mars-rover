import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

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

}