import kotlin.test.junit5.JUnit5Asserter.assertEquals

infix fun Any.shouldBe(expected: Any) = assertEquals(
    message = """
        |Assertion failed!
        |Expected: $expected,
        |Actual: $this
    """.trimMargin(),
    expected = expected,
    actual = this
)