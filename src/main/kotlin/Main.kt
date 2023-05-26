fun main(args: Array<String>) {
    //f201
    println("Number of digits: ${f201(458887)}")
    //f202
    println("Sum of digits: ${f202(1234)}")
    //f203
    println("Multiplication of digits: ${f203(256)}")
    //f204
    println("Reverse number: ${f204(12345)}")
    //one more solution with extension function
    val num = 489
    num.f2041()
    //205
    val num1 = 12345
    num1.f205()
    //206
    val num2 = 789
    println("Reverse Integer: ${num2.f206()}")
    //207
    val num3 = 2049
    println("Is $num3 contains number 2? - ${num3.f207(2)}")
    //208
    val num4 = 11112
    println("Is $num4 elements are the same? - ${num4.f208()}")
    //209
    val num5 = 123
    println("Is $num5 contains odd number? - ${num5.f209()}")
    //210
    val number = 1221
    println("Are the sums equal? ${number.odd().sum() == number.even().sum()}")

}

fun f201(number: Int): Int {
    return number.toString().length
}

fun f202(number: Int): Int {
    return number.toString().map { it.toString().toInt() }
        .sum()
}

fun f203(number: Int): Int {
    return  number.toString().map { it.toString().toInt() }
        .reduce { acc, digit -> acc * digit }
}

fun f204(number: Int): Int {
    return number.toString().toList()
        .foldRight("") { char, acc -> acc + char }
            .toInt()
}

fun Int.f2041() {
    print("Elements are: ")
    toString().reversed().forEach { digit ->
        print("$digit ")
    }
    println()
}

fun Int.f205() {
    print("Elements are: ")
    toString().forEach { digit ->
        print("$digit ")
    }
    println()
}

fun Int.f206(): Int {
    return toString().reversed().toInt()
}

fun Int.f207(digit: Int): Boolean {
    return this.toString().contains(digit.toString())
}

fun Int.f208(): Boolean {
    val digits = this.toString().map { it.toString().toInt() }
    return this.toString().map { it.toString().toInt() }
        .all { it == digits.first() }
}

fun Int.f209(): Boolean {
    return toString().any { it.toString().toInt() % 2 == 1 }
}

fun Int.odd(): List<Int> {
    return this.toString().map{ it.toString().toInt() }
        .filterIndexed { index, _ -> index % 2 != 0 }
}

fun Int.even(): List<Int> {
    return this.toString().map { it.toString().toInt() }
        .filterIndexed { index, _ -> index % 2 == 0 }
}
