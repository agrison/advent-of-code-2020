# Advent Of Code

## Goal

After the 5 last years with Java, Go (finished with Java), OCaml (finished with Java), Python and Clojure (+ some Java), this year I'll be solving the
[Advent of Code](https://adventofcode.com/2020) with **Kotlin** (hopefully this time I won't need Java).

1. A deep dive into Kotlin.
2. Write fast and idiomatic solutions.
3. Using extensions to make code shorter (see [Extensions.kt](https://github.com/agrison/advent-of-code/blob/master/src/main/kotlin/me/grison/aoc/Extensions.kt)).

I am gradually rewriting all previous years solutions in Kotlin because it's a better language for such challenges than the other I used before (except Python, but I'm not doing so much Python so just forgetting how to write some basic stuff).

## 2020 

![Kotlin - 2020](https://github.com/agrison/advent-of-code/workflows/Kotlin%20-%202020/badge.svg)

![2020](2020.png)

## 2019

![2019](2019.png)

## 2018

![2018](2018.png)

## 2017

![Kotlin - 2017](https://github.com/agrison/advent-of-code/workflows/Kotlin%20-%202017/badge.svg)

![2017](2017.png)

## 2016

![Kotlin - 2016](https://github.com/agrison/advent-of-code/workflows/Kotlin%20-%202016/badge.svg)

![2016](2016.png)

## 2015

![Kotlin - 2015](https://github.com/agrison/advent-of-code/workflows/Kotlin%20-%202015/badge.svg)

![2015](2015.png)

Project is already setup with gradle. To run the app:

* Navigate to top-level directory on the command line
* Run `./gradlew run` to run all days for all years
* Run `./gradlew run --args $DAY` to run a specific day in the current year (*2020*, ex: `./gradlew run --args 8` to run the day 8 of *2020*)
* Run `./gradlew run --args $YEAR/*` to run all days in a specific year (ex: `./gradlew run --args 2015/*` to run the year *2015*)
* Run `./gradlew run --args $YEAR/$DAY` to run a specific year & day (ex: `./gradlew run --args 2015/7` to run the day *7* of *2015*)

### Testing

* Navigate to top-level directory on the command line
* Run `./gradlew test`
* Add `--info`, `--debug` or `--stacktrace` flags for more output

##### Test input

By default, instantiations of `Day` classes in tests will use the input files in `src/test/resources`, _not_ those in `src/main/resources`.
This hopefully gives you flexibility - you could either just copy the real input into `src/test/resources` if you want to test
the actual answers, or you could add a file of test data based on the examples given on the Advent of Code description for the day.
The stub `Day01Test` class shows a test of the functionality of `Day01` where the test input differs from the actual input.

### Architecture

* Inputs go into `src/main/resources` and follow the naming convention `X.txt` where X is like `01`, `02` and so on
* Solutions go into `src/main/kotlin/days` and extend the `Day` abstract class, calling its constructor with their day number 
* Solutions follow the naming convention `DayX`
* It is assumed all solutions will have two parts but share the same input
* Input is exposed in the solution classes in two forms - `inputList` and `inputString`
* Day 1 solution class and input file are stubbed as a guide on how to extend the project,
and how you can use the `inputList` and `inputString` mentioned above
* To get started simply replace `src/main/01.txt` with the real input and the solutions in `Day01` with your own
* A Day 1 test class also exists, mostly to show a few hamcrest matchers, and how test input files can differ from actual ones (see **Test input** section above).
To get started with testing you can edit this class, and the input file at `src/test/resources/01.txt`
