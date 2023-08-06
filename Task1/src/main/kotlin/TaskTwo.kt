import java.util.regex.Pattern

class TaskTwo(val datas: List<Student>) {
    fun task32(regex: String) {
        val filteredStudents = findStudentsByKeyword(regex)
        printFilteredStudents(filteredStudents)
    }

    private fun findStudentsByKeyword(regex: String): List<Student> {
        val pattern = Pattern.compile(regex)
        return datas.filter { student ->
            pattern.matcher(student.name).find() ||
                    pattern.matcher(student.gender).find() ||
                    pattern.matcher(student.address).find()
        }
    }

    private fun printFilteredStudents(students: List<Student>) {
        students.forEach { student ->
            println("\nHasil pencarian berdasarkan keyword")
            println("${student.name}, ${student.gender}, ${student.address}, " +
                    "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
        }
    }
}