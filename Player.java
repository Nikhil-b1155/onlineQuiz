package com.quizapplication;

import java.util.Scanner;

public class Player {

    Scanner sc = new Scanner(System.in);

    String playerName ;
    int score=0 ;

    public void getDetails(){
        System.out.println("Enter the Players Name = ");
        playerName=sc.next();
    }


}
