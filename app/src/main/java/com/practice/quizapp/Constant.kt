package com.practice.quizapp

object Constant {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val quest1 = Question(id = 1,
            "What anime is this from?",
            R.drawable.ic_lufy,
            listOf("Dragon Ball",
            "Dragon Ball Z",
            "Attack on Titan",
            "One Piece"),
            4)
        questionList.add(quest1)


        val quest2 = Question(id = 2,
            "What anime is this from?",
            R.drawable.ic_naruto,
            listOf("Naruto",
            "Dragon Ball",
            "Dragon Ball Z",
            "Hunter X Hunter"),
            1)
        questionList.add(quest2)

        val quest3 = Question(id = 3,
            "What anime is this from?",
            R.drawable.ic_ryuku,
            listOf("Attack on Titan",
            "Death note",
            "Dragon Ball Z",
            "Demon Slayer"),
            2)
        questionList.add(quest3)

        val quest4 = Question(id = 4,
            "What anime is this from?",
            R.drawable.ic_goku,
            listOf("Dragon Ball",
            "Death note",
            "Dragon Ball Z",
            "Hunter X Hunter"),
            1)
        questionList.add(quest4)

        return questionList
    }
}