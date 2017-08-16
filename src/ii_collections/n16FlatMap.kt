package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products this customer has ordered
    /*val allProducts = ArrayList<Product>()
    this.orders.forEach { allProducts.addAll(it.products) }*/
    val list = this.orders.flatMap { it.products }
    return list.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    val list = this.customers.flatMap { it.orderedProducts }
    return list.toSet()
}

fun String.maxValueFrom(): Int {
    //return this.toList().sortedDescending().joinToString(separator = "", prefix = "", postfix = "").toInt()
    var sum = 0
    this.forEach { sum+=it.toInt() }
    return sum
}
