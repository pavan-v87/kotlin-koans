package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N16FlatMapKtTest {
    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
    @Test fun getMaxNumber() {
        assertEquals(98763332, "38293367".maxValueFrom())
        assertEquals(6543210, "1203465".maxValueFrom())
    }
}
