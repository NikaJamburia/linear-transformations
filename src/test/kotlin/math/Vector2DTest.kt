package math

import ge.nika.math.Vector2D
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Vector2DTest {

    @Test
    fun `is normalized if both values are in range -1 to 1`() {
        assertTrue { Vector2D(-1.0, -1.0).isNormalized() }
        assertTrue { Vector2D(1.0, -1.0).isNormalized() }
        assertTrue { Vector2D(1.0, -1.0).isNormalized() }
        assertTrue { Vector2D(1.0, 1.0).isNormalized() }
        assertTrue { Vector2D(0.0, 0.0).isNormalized() }

        assertFalse { Vector2D(-1.1, 1.0).isNormalized() }
    }
}