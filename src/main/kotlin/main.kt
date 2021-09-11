fun main() {

    val purchaseAmount = 10_000
    var isOftenBuyer: Boolean = false

    val discount = if (purchaseAmount >= 1_001 && purchaseAmount <= 10_000) 100
    else if (purchaseAmount <= 1_000) 0
    else purchaseAmount / 100 * 5

    val progressDiscount = if (isOftenBuyer == true && purchaseAmount <= 1_000) purchaseAmount/100*1
    else if(isOftenBuyer == true) (discount / 100 * 1) + discount
    else 0

    var totalDiscount = discount + progressDiscount
    var totalSum = purchaseAmount - totalDiscount

    println("""Скидка покупателя $totalDiscount руб.
        |Сумма $totalSum руб.
    """.trimMargin())

}