package com.example.demo16.UdemyCourse;

import org.springframework.beans.factory.annotation.Autowired;

public class MyApp
{



    public static void main(String[] args){
       Coach c = new BaskeBallCoach();
       Coach c2 = new TrackCoach();
        System.out.println(c.getDailyWorkOut());
        System.out.println(c2.getDailyWorkOut());



    }
}
