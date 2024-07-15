package mate.academy

fun main() {
    println(removeChars("book"))   // "oo"
    println(removeChars("house"))  // "ous"
    println(removeChars("us"))     // ""
    println(removeChars("a"))      // ""
    println(removeChars(""))       // ""
}

fun removeChars(str: String): String {
    if (str.length <= 2) {
        return ""
    }
    return str.substring(1, str.length - 1)
}