class TaskFive(val datas: List<Student>) {
    fun task35(subject: Mapel, minScore: Int, maxScore: Int) {
        val filteredStudents = findStudentsByScoreRange(subject, minScore, maxScore)
        printFilteredStudents(filteredStudents)
    }

    private fun findStudentsByScoreRange(subject: Mapel, minScore: Int, maxScore: Int): List<Student> {
        return datas.filter { student ->
            val score = when (subject) {
                Mapel.MATH -> student.scoreMath
                Mapel.SCIENCE -> student.scoreScience
                Mapel.ENGLISH -> student.scoreEnglish
            }
            score in minScore..maxScore
        }
    }

    private fun printFilteredStudents(students: List<Student>) {
        students.forEach { student ->
            println("\nHasil pencarian berdasarkan rentang nilai")
            println("${student.name}, ${student.gender}, ${student.address}, " +
                    "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
        }
    }
}