/*

import java.util.regex.Pattern

//Membuat class tabel student 1.


//Membuat List Tabel Student 2.


fun searchByRegex(dataList: List<Student>, regex: String): List<Student> {
    val pattern = Pattern.compile(regex)
    return dataList.filter { student ->
        pattern.matcher(student.name).find() ||
                pattern.matcher(student.gender).find() ||
                pattern.matcher(student.address).find()
    }
}

//Task 3.2 Mengandung keyword yang di cari
fun task32(dataList: List<Student>, keyword: String): List<Student>{
    return dataList.filter { student ->
        student.name.contains(keyword, ignoreCase = true) ||
                student.gender.contains(keyword, ignoreCase = true) ||
                student.address.contains(keyword, ignoreCase = true)
    }
}

//task 3.3 alamat yang mengandung kata
fun task33(dataList: List<Student>,kota: String): List<Student>{
    return dataList.filter { student->
        student.address.contains(kota, ignoreCase = true)
    }
}

//task 3.4 mencari nilai sesuai yang di inputkan
fun task34(dataList: List<Student>, subject: String, score: Int): List<Student>{
    return dataList.filter { student ->
        when (subject.toLowerCase()){
         "math" -> student.scoreMath== score
         "science" -> student.scoreScience== score
         "english" -> student.scoreEnglish==score
            else -> false
        }
    }
}

//task 3.5 rentang suatu nilai pada suatu Mapel
fun task35(dataList: List<Student>, subject: String, minScore: Int, maxScore: Int): List<Student>{
    return dataList.filter { student->
        val score = when (subject.toLowerCase()){
            "math" -> student.scoreMath
            "science" -> student.scoreScience
            "english" -> student.scoreEnglish
            else -> 0
        }
        score in minScore..maxScore
    }
}


//task 3.6 Nilai terbesar / nilai terkecil
fun task36(dataList: List<Student>, subject: String, ascending: Boolean = true): List<Student>{
    val sortedList = when (subject.toLowerCase()){
        "math" -> dataList.sortedBy { it.scoreMath }
        "science" -> dataList.sortedBy { it.scoreScience }
        "english" -> dataList.sortedBy { it.scoreEnglish }
        else -> dataList
    }
    return if(ascending) sortedList else sortedList.reversed()
}

//task 3.7 menghitung jumlah dan rata rata nilai
fun task37(dataList: List<Student>) : Pair<Int,Double> {
    val totalStudents = dataList.size
    val totalScores = dataList.sumBy { it.scoreMath + it.scoreScience + it.scoreEnglish }
    val averageScore = totalScores/ (3.0 * totalStudents)
    return Pair(totalScores, averageScore)
}

//task 3.8 menghitung ranking
fun task38(dataList: List<Student>): List<Student>{
    val sortedList = dataList.sortedByDescending { it.scoreMath + it.scoreScience + it.scoreEnglish }
    return sortedList.mapIndexed { index, student ->
        student.copy(name = "${student.name} (Rank ${index + 1 }")
    }
}



fun main2 (){
    val dataList = readDataList()

    val keyword = "f"
    val regex = "(?i)f"
    val kota = "utara"
    val subject = "Math"
    val minScore = 70
    val maxScore = 90

    val searchRegex = searchByRegex(dataList, regex)
    val searchByKeywordResult = task32(dataList, keyword)
    val searchByAddressKeywordResult = task33(dataList, kota)
    val searchBySubjectScoreResult = task34(dataList, subject, 50)
    val searchByScoreRangeResult = task35(dataList, subject, minScore, maxScore)
    val sortBySubjectScoreResult = task36(dataList, subject, ascending = false)
    val scoreStatistics = task37(dataList)
    val rankingResult = task38(dataList)

    // task 3.1
    println("Hasil pencarian berdasarkan keyword insensitive case")
    searchRegex.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }
/*
    // task 3.1
    println("Hasil pencarian berdasarkan keyword insensitive case")
    searchResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

    // task 3.2
    println("\nHasil pencarian berdasarkan keyword")
    searchByKeywordResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

    // task 3.3
    println("\nHasil pencarian berdasarkan alamat")
    searchByAddressKeywordResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

    // task 3.4
    println("\nHasil pencarian berdasarkan nilai")
    searchBySubjectScoreResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

    // task 3.5
    println("\nHasil pencarian berdasarkan rentang nilai Matematika antara 80 dan 90:")
    searchByScoreRangeResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

    // task 3.6
    println("\nPengurutan data :")
    sortBySubjectScoreResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

    // task 3.7
    println("\nJumlah dan rata-rata:")
    println("Jumlah nilai: ${scoreStatistics.first}")
    println("Rata-rata nilai: ${scoreStatistics.second}")

    // task 3.8
    println("\nPerangkingan Siswa:")
    rankingResult.forEach { student ->
        println("${student.name}, ${student.gender}, ${student.address}, " +
                "Math: ${student.scoreMath}, Science: ${student.scoreScience}, English: ${student.scoreEnglish}")
    }

} */