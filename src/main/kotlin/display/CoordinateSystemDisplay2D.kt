package ge.nika.display

import ge.nika.math.Vector2D

class CoordinateSystemDisplay2D (
    private val height: Int,
    private val width: Int,
    private val originLocaltion: CoordinateSystemOriginLocation,
) {
    fun convertToSystemCoordinates(normalizedVector: Vector2D): Vector2D {
        require(normalizedVector.isNormalized()) {
            "Only normalized vectors are can be displayed!"
        }

        return normalizedVector
    }
}

enum class CoordinateSystemOriginLocation {
    CENTER, BOTTOM_LEFT
}
