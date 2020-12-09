package com.example.moneymeditaion2

object Constants3{
    
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "Example Text for question 1",
                "Answer 1",
                "Answer 2",
                "Answer 3",
                "Answer 4",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "Example Text for question 2",
                "Answer 1",
                "Answer 2",
                "Answer 3",
                "Answer 4",
                4
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "Example Text for question 3",
                "Answer 1",
                "Answer 2",
                "Answer 3",
                "Answer 4",
                1
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "Example Text for question 4",
                "Answer 1",
                "Answer 2",
                "Answer 3",
                "Answer 4",
                2
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "Example Text for question 5",
                "Answer 1",
                "Answer 2",
                "Answer 3",
                "Answer 4",
                3
        )

        questionsList.add(que5)


        return questionsList
    }

}
