package org.lol;
import solutions.*;

public class Main{
    public static void main(String[] args){
        //This is where I'll be running my tests, it'll be empty most of the time (unless i'm actively working on one)
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(c.solution(arr));
    }
}