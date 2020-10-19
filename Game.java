package com.quizapplication;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Largest Planet in Universe ?","India is the --- Largest country in the world ?","Which is the Largest ocean in the world ?"};
    String[] options1={"Earth","1","Pacific Ocean"};
    String[] options2={"Mars","5","Atlantic Ocean"};
    String[] options3={"Jupiter","7","Indian Ocean"};
    String[] options4={"Saturn","10","Arctic Ocean"};
    int[] answers ={3,3,1};


    public void initGame()
    {

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Right Answer");
                player.score=player.score+5;
            }
            else{
                System.out.println("Wrong Answer");
                player.score=player.score-5;

            }
        }

        System.out.println(player.playerName+" your score is "+player.score);

    }

}


