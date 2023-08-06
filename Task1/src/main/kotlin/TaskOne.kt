import java.util.regex.Pattern

class TaskOne(val datas: List<Student>) {
    fun task31(regex: String) {
        val filteredStudents = findStudentsByKeywordInsensitive(regex)
        printFilteredStudents(filteredStudents)
    }

    private fun findStudentsByKeywordInsensitive(regex: String): List<Student> {
        val pattern = Pattern.compile(regex)
        return datas.filter { student ->
            pattern.matcher(student.name).find() ||
                    pattern.matcher(student.gender).find() ||
                    pattern.matcher(student.address).find()
        }
    }

    private fun printFilteredStudents(students: List<Student>) {
        students.forEach { student ->
            println("Hasil pencarian berdasarkan keyword insensitive case")
            println("${student.name}, ${student.gender}, ${student.address}, " +
                    "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
        }
    }
}