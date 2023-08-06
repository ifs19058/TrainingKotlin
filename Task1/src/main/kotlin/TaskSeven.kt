class TaskSeven(val datas: List<Student>) {
    fun task37(): Pair<Triple<Int, Int, Int>, Triple<Double, Double, Double>> {
        val totalScores = calculateTotalScores()
        val averageScores = calculateAverageScores(totalScores)

        printTotalScores(totalScores)
        printAverageScores(averageScores)

        return Pair(totalScores, averageScores)
    }

    private fun calculateTotalScores(): Triple<Int, Int, Int> {
        val totalMath = datas.sumOf { it.scoreMath }
        val totalScience = datas.sumOf { it.scoreScience }
        val totalEnglish = datas.sumOf { it.scoreEnglish }
        return Triple(totalMath, totalScience, totalEnglish)
    }

    private fun calculateAverageScores(totalScores: Triple<Int, Int, Int>): Triple<Double, Double, Double> {
        val totalStudents = datas.size
        val averageMath = totalScores.first.toDouble() / totalStudents
        val averageScience = totalScores.second.toDouble() / totalStudents
        val averageEnglish = totalScores.third.toDouble() / totalStudents
        return Triple(averageMath, averageScience, averageEnglish)
    }

    private fun printTotalScores(totalScores: Triple<Int, Int, Int>) {
        println("\nTotal scores:")
        println("Math: ${totalScores.first}")
        println("Science: ${totalScores.second}")
        println("English: ${totalScores.third}")
    }

    private fun printAverageScores(averageScores: Triple<Double, Double, Double>) {
        println("\nAverage scores:")
        println("Math: ${averageScores.first}")
        println("Science: ${averageScores.second}")
        println("English: ${averageScores.third}")
    }
}