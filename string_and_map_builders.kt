import java.util.HashMap

fun <K, V> buildMutableMap(build: HashMap<K, V>.() -> Unit): HashMap<K, V>{
    val hashMapBuilder = HashMap<K, V>()
    hashMapBuilder.build()
    return hashMapBuilder
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
