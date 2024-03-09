fun main() {
    val likes = 31
    val people = if (likes % 100 in 11..19) "людям" else {
        val lastDigit = likes % 10
        if (lastDigit == 1) "человеку" else "людям"
    }
    println("Понравилось $likes $people")
}
