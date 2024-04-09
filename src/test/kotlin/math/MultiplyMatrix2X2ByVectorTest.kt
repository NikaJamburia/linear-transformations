package math

import ge.nika.math.Matrix2X2
import ge.nika.math.Vector2D
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MultiplyMatrix2X2ByVectorTest {

    @Test
    fun `matrix can be correctly multiplied by vector`() {
        val matrix = Matrix2X2(
            topLeft = 1.0,
            topRight = 2.0,
            bottomLeft = 3.0,
            bottomRight = 4.0,
        )
        val vector = Vector2D(1.0, 2.0)
        val result = matrix.multiply(vector)

        assertEquals(result, Vector2D(5.0, 11.0))
    }
}