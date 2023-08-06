import java.util.regex.Pattern

class TaskThree(val datas: List<Student>) {
    fun task33(regex: String) {
        val filteredStudents = findStudentsByAddress(regex)
        printFilteredStudents(filteredStudents)
    }

    private fun findStudentsByAddress(regex: String): List<Student> {
        val pattern = Pattern.compile(regex)
        return datas.filter { student ->
            pattern.matcher(student.address).find()
        }
    }

    private fun printFilteredStudents(students: List<Student>) {
        students.forEach { student ->
            println("\nHasil pencarian berdasarkan alamat")
            println("${student.name}, ${student.gender}, ${student.address}, " +
                    "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
        }
    }
}
