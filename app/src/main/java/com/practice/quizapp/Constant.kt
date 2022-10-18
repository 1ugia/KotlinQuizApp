package com.practice.quizapp

import androidx.appcompat.widget.SearchView.OnQueryTextListener

object Constant {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val quest1 = Question(id = 1,
            "what anime is this from?",
            R.drawable.ic_lufy,
            "Dragon Ball",
            "Dragon Ball Z",
            "Attack on Titan",
            "One Piece",
            4)
        questionList.add(quest1)


        val quest2 = Question(id = 2,
            "what anime is this from?",
            R.drawable.ic_naruto,
            "Naruto",
            "Dragon Ball",
            "Dragon Ball Z",
            "Hunter X Hunter",
            1)
        questionList.add(quest2)

        val quest3 = Question(id = 3,
            "what anime is this from?",
            R.drawable.ic_ryuku,
            "Attack on Titan",
            "Death note",
            "Dragon Ball Z",
            "Demon Slayer",
            2)
        questionList.add(quest3)

        val quest4 = Question(id = 4,
            "what anime is this from?",
            R.drawable.ic_goku,
            "Dragon Ball",
            "Death note",
            "Dragon Ball Z",
            "Hunter X Hunter",
            1)
        questionList.add(quest4)

        return questionList
    }
}