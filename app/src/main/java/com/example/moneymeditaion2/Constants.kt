package com.example.moneymeditaion2

object Constants{

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "What is the key to living with limited financial resources?",
                "Resist the urge to save",
                "Borrow money to cover bills",
                "Practice good money management",
                "Marry into wealth",
                3
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "The process of projecting, organizing, monitoring, and controlling future income and expenses is known as?",
                "Budgeting",
                "Investing",
                "Money Management",
                "Personal Finance",
                4
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "In case of emergency you should have what?",
                "Good Credit",
                "Money Saved",
                "A Budget Plan",
                "Credit Cards",
                2
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "When you buy something using this method you have to pay it back and it sometimes it requires interest",
                "Credit",
                "Income",
                "Savings",
                "Investments",
                1
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "What is the difference between a debit card and a credit card?",
                "A debit card takes money immediately from a bank account. With a credit card you pay later. (plus interest)",
                "A credit card takes money immediately from a bank account. With a debit card you pay later.",
                "A credit card takes money immediately from your savings fund. With a debit card you are charged interest.",
                "A debit card takes money immediately from your savings fund. With a debit card you are charged interest. (plus interest)",
                1
        )

        questionsList.add(que5)


        return questionsList
    }

}
