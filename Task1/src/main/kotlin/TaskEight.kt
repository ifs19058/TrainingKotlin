class TaskEight(val datas: List<Student>) {
    fun task38(): List<Student> {
        val rankedStudents = calculateRankedStudents()
        printRankedStudents(rankedStudents)
        return rankedStudents
    }

    private fun calculateRankedStudents(): List<Student> {
        val sortedList = datas.sortedByDescending { it.scoreMath + it.scoreScience + it.scoreEnglish }
        return sortedList.mapIndexed { index, student ->
            student.copy(name = "${student.name} (Rank ${index + 1})")
        }
    }

    private fun printRankedStudents(students: List<Student>) {
        println("\nRanked Students:")
        students.forEach { student ->
            println("${student.name} - Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
        }
    }
}