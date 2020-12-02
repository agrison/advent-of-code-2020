package days

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test

class Day01Test {
    private val day = Day01()

    @Test
    fun testPartOne() {
        assertThat(day.partOne(), `is`(514579))
    }

    @Test
    fun testPartTwo() {
        assertThat(day.partTwo(), `is`(241861950))
    }
}
