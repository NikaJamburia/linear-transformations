package display

import ge.nika.display.CoordinateSystemDisplay2D
import ge.nika.display.CoordinateSystemOriginLocation
import ge.nika.math.Vector2D
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import shouldBe

class CoordinateSystemDisplay2DTest {

    @Test
    fun `can not convert not normalized vectors to system coordinates`() {
        val subject = CoordinateSystemDisplay2D(
            height = 1,
            width = 1,
            originLocaltion = CoordinateSystemOriginLocation.CENTER
        )
        assertThrows<IllegalArgumentException> {
            subject.convertToSystemCoordinates(
                Vector2D(x = 3, y = 4)
            )
        }.message!! shouldBe "Only normalized vectors are can be displayed!"
    }

    @Test
    fun `converts normalized vectors to system coordinates when system origin is at center of the screen`() {
        val subject = CoordinateSystemDisplay2D(
            height = 300,
            width = 600,
            originLocaltion = CoordinateSystemOriginLocation.CENTER
        )

        val vector = Vector2D(x = 0.5, y = 0.5)
        subject.convertToSystemCoordinates(vector) shouldBe Vector2D(x = 450, y = 225)
    }
}