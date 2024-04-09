package ge.nika.math

data class Matrix2X2(
    val topLeft: Double,
    val bottomLeft: Double,
    val topRight: Double,
    val bottomRight: Double,
) {
    fun multiply(vector: Vector2D): Vector2D =
        Vector2D(
            x = vector.x * topLeft + vector.y * topRight,
            y = vector.x * bottomLeft + vector.y * bottomRight,
        )
}