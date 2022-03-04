class WorkZone {
    private interface Expr
    private class Num(val value: Int) : Expr
    private class Sum(val left: Expr, val right: Expr) : Expr

    private fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }
}