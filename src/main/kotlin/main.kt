fun main() {
    val itemPrice = 100
    val itemCount = 100
    val discount = 100
    val isRegular = true;
    val notRegular = false;
    var totalPrice = itemPrice * itemCount
    if (totalPrice <= 1_000) {
        println("Сумма покупки: $totalPrice")
    } else if (totalPrice > 1_000 && totalPrice < 10_000) {
        totalPrice -= discount
        println("Сумма покупки: $totalPrice")
    } else if (totalPrice >= 10_000) {
        totalPrice = totalPrice - (totalPrice / 100 * 5)
        println("Сумма покупки: $totalPrice")
    } else if (isRegular && totalPrice >= 10_000) {
        totalPrice = totalPrice - (totalPrice / 100 * 5)
        totalPrice = totalPrice - totalPrice/100
        println("Сумма покупки: $totalPrice")
}
}

