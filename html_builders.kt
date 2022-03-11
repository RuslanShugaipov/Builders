fun renderProductTable(): String {
 return html {
        table {
            tr(color = getTitleColor()){
                td(color = getCellColor(0, 0)) {
                    text("Product")
                }
                td(color = getCellColor(0, 1)) {
                    text("Price")
                }
                td(color = getCellColor(0, 2)) {
                    text("Popularity")
                }
            }
            val products = getProducts()
            this.attributes.add(Attribute("products", products.toString()))
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"
