package org.lol;
import solutions.*;

public class Main{
    public static void main(String[] args){
        //This is where I'll be running my tests, it'll be empty most of the time (unless i'm actively working on one)
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] arr = {2,3,4,5,18,17,6};

        System.out.println(c.solution(arr));
    }
}