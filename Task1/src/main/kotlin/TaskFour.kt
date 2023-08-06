class TaskFour(val datas: List<Student>) {
    fun task34(subject: Mapel, score: Int) {
        val filteredStudents = findStudentsByScore(subject, score)
        printFilteredStudents(filteredStudents)
    }

    private fun findStudentsByScore(subject: Mapel, score: Int): List<Student> {
        return datas.filter { student ->
            when (subject) {
                Mapel.MATH -> student.scoreMath == score
                Mapel.SCIENCE -> student.scoreScience == score
                Mapel.ENGLISH -> student.scoreEnglish == score
            }
        }
    }

    private fun printFilteredStudents(students: List<Student>) {
        students.forEach { student ->
            println("\nHasil pencarian berdasarkan nilai")
            println("${student.name}, ${student.gender}, ${student.address}, " +
                    "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
        }
    }
}
