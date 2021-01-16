import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MarsRoverTest() {

    @Test
    fun testShallPass() {
        assertEquals(1, 1)
    }

    @Test
    fun testHandleReturnTrue() {
        val marsRover = MarsRover()
        assertEquals(true, marsRover.exec())
    }

}