import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MarsRoverTest() {

    @Test
    fun testShallPass(): Unit
    {
        assertEquals(1, 1)
    }

    @Test
    fun testHandleReturnTrue(): Unit
    {
        val marsRover = MarsRover()
        assertEquals(true, marsRover.exec())
    }

}