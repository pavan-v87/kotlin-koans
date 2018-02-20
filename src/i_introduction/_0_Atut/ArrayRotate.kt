package i_introduction._0_Atut

/**
 * Created by pavan.vijayanar on 8/18/2017.
 */

object ArrayRotate {
    fun rotateRightArray(array: IntArray, steps: Int): IntArray {
        val stack = IntArray(array.size)

        var k=0
        while (k<steps){
            stack[k] = array[array.size-1-k]
            k++
        }

        var i = array.size -1
        while (i >= steps) {
            array[i]=array[i-k]
            i--
        }

        var j=0
        while (j<steps){
            array[j] = stack[steps-1-j]
            j++
        }
        return array
    }
}
