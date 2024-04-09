package ge.nika.math

data class Vector2D(
    val x: Double,
    val y: Double,
) {
    constructor(x: Int, y: Int): this(x.toDouble(), y.toDouble())

    fun isNormalized(): Boolean =
        x in -1.0..1.0 && y in -1.0..1.0

}
