package solutions;

import java.util.Random;

public class NextPermutation{

    public NextPermutation(){

    }

    public void solution(){
        Random r = new Random();
        int total1 = 0, total2 = 0;
        int inter = 0;
        double avg1 = 0, avg2 = 0;
        for(int i = 0; i < 1000; i++){
            inter = r.nextInt(1000);
            total1 += inter;
            total2 += inter;
            if(i == 500){
                avg2 = (double)total2 / 500;
                total2 = 0;
            }
            else if(i == 999){
                avg2 = ((double)total2/500 + avg2) / 2;

            }

        }
        avg1 = (double)total1/1000;
        System.out.println("The averages are: 1: " + avg1 + "\n2: " + avg2);
    }
}
