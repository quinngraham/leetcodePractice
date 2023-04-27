package org.lol;
import implementations.ListNode;
import solutions.*;


public class Main{
    public static void main(String[] args){
        //This is where I'll be running my tests, it'll be empty most of the time (unless i'm actively working on one)
        RemoveElement r = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(r.solution(nums, 2));
    }
}