fun readDataList(): List<Student> {
    return listOf(
        Student("Ferman", "Male", "Jakarta Selatan", 100, 50, 60),
        Student("Andy", "Male", "Tangerang kabupaten", 80, 60, 70),
        Student("Iqbal", "Male", "Jakarta Utara", 90, 40, 50),
        Student("Fauzan", "Male", "Tangerang Selatan", 50, 100, 100),
        Student("Aritio", "Male", "Jakarta Selatan", 60, 10, 100),
        Student("Mei", "Female", "Tangerang Kota", 90, 80, 50),
        Student("Gloria", "Female", "Jakarta Barat", 100, 80, 40)
    )
}

fun main() {
    val students = readDataList()

    task1(students)
    task2(students)
    task3(students)
    task4(students)
    task5(students)
    task6(students)
    task7(students)
    task8(students)
}

fun task1(datas: List<Student>) {
    val task1 = TaskOne(datas)
    task1.task31("Dy")
}

fun task2(datas: List<Student>) {
    val task2 = TaskTwo(datas)
    task2.task32("(?i)tio")
}

fun task3(datas: List<Student>) {
    val task3 = TaskThree(datas)
    task3.task33("(?i)utara")
}

fun task4(datas: List<Student>) {
    val task4 = TaskFour(datas)
    task4.task34(Mapel.MATH, 10)
}

fun task5(datas: List<Student>) {
    val task5 = TaskFive(datas)
    task5.task35(Mapel.MATH, 10, 30)
}

fun task6(datas: List<Student>) {
    val task6 = TaskSix(datas)
    task6.task36(Mapel.MATH, true)
}

fun task7(datas: List<Student>) {
    val task7 = TaskSeven(datas)
    task7.task37()
}

fun task8(datas: List<Student>) {
    val task8 = TaskEight(datas)
    task8.task38()
}
/*fun main() {
    val task1 = TaskOne(readDataList())
    task1.task31("Dy")

    val task2 = TaskTwo(readDataList())
    task2.task32("(?i)tio")

    val task3 = TaskThree(readDataList())
    task3.task33("(?i)utara")

    val task4 = TaskFour(readDataList())
    task4.task34(Mapel.MATH, 10)

    val task5 = TaskFive(readDataList())
    task5.task35(Mapel.MATH, 10, 30)

    val task6 = TaskSix(readDataList())
    task6.task36(Mapel.MATH, true).forEach { student ->
        println(
            "${student.name}, ${student.gender}, ${student.address}, " +
                    "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}"
        )
    }

    val task7 = TaskSeven(readDataList())
    val (totalScores, averageScores) = task7.task37()
    println("\nTotal scores:")
    println("Math: ${totalScores.first}")
    println("Science: ${totalScores.second}")
    println("English: ${totalScores.third}")
    println("\nAverage scores:")
    println("Math: ${averageScores.first}")
    println("Science: ${averageScores.second}")
    println("English: ${averageScores.third}")

    val task8 = TaskEight(readDataList())
    val rankedStudents = task8.task38()
    println("\nRanked Students:")
    rankedStudents.forEach { student ->
        println("${student.name} - Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")

 */