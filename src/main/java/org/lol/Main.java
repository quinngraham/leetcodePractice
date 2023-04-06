package org.lol;
import solutions.*;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //This is where I'll be running my tests, it'll be empty most of the time (unless i'm actively working on one)
        FourSum f = new FourSum();
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(f.solution(nums, 0));
    }
}