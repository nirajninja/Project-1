package com.example.navigation_drawer.Quiz


object Constant{

    fun getQuestions(): ArrayList<Questions>{
        val questionList = ArrayList<Questions>()
        val question1=Questions(1,"Who is the pm of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question1)

        val question2=Questions(2,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question2)

        val question3=Questions(3,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question3)

        val question4=Questions(4,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question4)

        val question5=Questions(5,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question5)

        val question6=Questions(6,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question6)

        val question7=Questions(7,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question7)

        val question8=Questions(8,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question8)

        val question9=Questions(9,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question9)

        val question10=Questions(10,"Who is the president  of india","rahul gandhi","modi","sonia","eminem",2)
        questionList.add(question10)

        return questionList
    }
}