package ge.nika

data class Vector2D(
    val x: Double,
    val y: Double,
)

val Pair<Double, Double>.vector: Vector2D
    get() = Vector2D(first, second)
