package generics

class Contest<T : Pet>(var vet: Vet<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score > 0) scores[t] = score
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        return scores.filter { entry -> entry.value == highScore }
            .keys
            .toMutableSet()
    }
}