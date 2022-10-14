package com.practice.quizapp

import androidx.appcompat.widget.SearchView.OnQueryTextListener

object Constant {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val quest1 = Question(
            id = 1,
            "what anime is this from?",
            R.drawable.ic_lufy
            "Dragon Ball",
            "Dragon Ball Z",
            "Attack on Titan",
            "One Piece",
            4
        )
        questionList.add(quest1)

        return questionList
    }
}