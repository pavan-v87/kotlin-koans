package i_introduction._0_Atut

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by pavan.vijayanar on 8/18/2017.
 */
class ArrayRotateTest {
    @Test fun testRotateRightArray() {
        assertArrayEquals(intArrayOf(3, 4, 5, 1, 2), ArrayRotate.rotateRightArray(intArrayOf(1, 2, 3, 4, 5), 3))
    }
}