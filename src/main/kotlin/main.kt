
fun main () {
    var amount = 20_000_00  // изменяемая переменая
    val interestRate = 0.0075F
    val interestRateMinimum = 35_00

    val commission = amount * interestRate
    val result = if (commission > interestRateMinimum) amount * interestRate else interestRateMinimum
    println("Комиссия: $result" + " копеек")
}
