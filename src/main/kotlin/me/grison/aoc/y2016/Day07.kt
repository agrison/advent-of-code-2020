package me.grison.aoc.y2016

import me.grison.aoc.Day

class Day07 : Day(7, 2016) {
    override fun title() = "Internet Protocol Version 7"

    private val addresses = inputList.map { it.trim().split("""\[|\]""".regex()) }
    private val supernet = addresses.map { it.filterIndexed { i, _ -> i % 2 == 0 }.joinToString(" ") }
    private val hypernet = addresses.map { it.filterIndexed { i, _ -> i % 2 == 1 }.joinToString(" ") }

    override fun partOne() = supernet.zip(hypernet).count { (sup, hyp) -> is_abba(sup) && !is_abba(hyp) }

    override fun partTwo() = supernet.zip(hypernet).count { (sup, hyp) -> is_ababab(sup, hyp) }

    private fun is_abba(s: String): Boolean {
        val (a, b) = p(s, s.substring(1))
        val (c, d) = p(s.substring(2), s.substring(3))
        return d.indices.map { a[it] + b[it] + c[it] + d[it] }
            .any { it[0] + it[1] == it[3] + it[2] && it[0] != it[1] }
    }

    private fun is_ababab(sup: String, hyp: String): Boolean {
        val (b, c) = p(sup.substring(1), sup.substring(2))
        return c.indices.map { sup[it] + b[it] + c[it] }.any {
            it[0] == it[2] && it[0] != it[1] && ((it[1] + it[0] + it[1]) in hyp)
        }
    }
}