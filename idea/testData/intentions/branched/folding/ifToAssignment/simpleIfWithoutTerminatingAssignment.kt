// IS_APPLICABLE: false
fun doSomething<T>(a: T) {}

fun test(n: Int): String {
    var res: String

    <caret>if (n == 1) {
        res = "one"
        doSomething("***")
    } else {
        doSomething("***")
        res = "two"
    }

    return res
}
