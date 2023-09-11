package com.example.quiz_app

object Constraints {

    fun getQuestion():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>();

        // 1
        val ques1 = Questions(
            1,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Denmark",
            "Australia","Armenia",
            1
        )
        questionsList.add(ques1);

        // 2
        val ques2 = Questions(
            2,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Denmark",
            "Australia","Armenia",
            3
        )
        questionsList.add(ques2);

        // 3
        val ques3 = Questions(
            3,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "UAE","Belgium",
            "Germany","Armenia",
            2
        )
        questionsList.add(ques3)

        // 4
        val ques4 = Questions(
            4,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Brazil","Denmark",
            "Kuwait","Armenia",
            1
        )
        questionsList.add(ques4);

        // 5
        val ques5 = Questions(
            5,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Sweden","Denmark",
            "Scotland","Armenia",
            2
        )
        questionsList.add(ques5);

        // 6
        val ques6 = Questions(
            6,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Samoa",
            "Philippines","Vatican City",
            1
        )
        questionsList.add(ques6);

        // 7
        val ques7 = Questions(
            7,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "Argentina","Denmark",
            "Greenland","Germany",
            4
        )
        questionsList.add(ques7);

        // 8
        val ques8 = Questions(
            8,"Which country does this flag belong to ? ( YE TOH PTA HI HONA CHAHIYE>BRO☠️)",
            R.drawable.ic_flag_of_india,
            "India","China",
            "Nepal","Afghanistan",
            1
        )
        questionsList.add(ques8);

        // 9
        val ques9 = Questions(
            9,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Taiwan","Kuwait",
            "Bangladesh","Bhutan",
            2
        )
        questionsList.add(ques9);

        // 10
        val ques10 = Questions(
            10,"Which country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,
            "Armenia","America",
            "New Zealand"," Panj Tara",
            3
        )
        questionsList.add(ques10);

        return questionsList;
    }
}