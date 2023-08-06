class TaskSix(val datas: List<Student>) {
    fun task36(subject: Mapel, ascending: Boolean = true): List<Student> {
        val sortedStudents = sortStudentsByScore(subject, ascending)
        printSortedStudentsInfo(sortedStudents)
        return sortedStudents
    }

    private fun sortStudentsByScore(subject: Mapel, ascending: Boolean): List<Student> {
        val sortedList = when (subject) {
            Mapel.MATH -> datas.sortedBy { it.scoreMath }
            Mapel.SCIENCE -> datas.sortedBy { it.scoreScience }
            Mapel.ENGLISH -> datas.sortedBy { it.scoreEnglish }
        }
        return if (ascending) sortedList else sortedList.reversed()
    }

    private fun printSortedStudentsInfo(students: List<Student>) {
        students.forEach { student ->
            println(
                "${student.name}, ${student.gender}, ${student.address}, " +
                        "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}"
            )
        }
    }
}