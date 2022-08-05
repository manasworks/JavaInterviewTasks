package tasks;

import java.util.Scanner;


    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sub = sc.nextLine();
            int n = Integer.parseInt(sub);
            for(int i=0;i<n;i++) {
                String[] input = sc.nextLine().split(" ");
                Car c = new Car();
                if(input.length ==1){
                    c.printTopSpeed();
                }
                if(input.length ==2){
                    c.printTopSpeed(Integer.parseInt(input[1]));
                }
                if(input.length ==3){
                    c.printTopSpeed(input[1], Integer.parseInt(input[2]));
                }
            }
        }
    }


class Car{
    public void printTopSpeed(){
        System.out.println("Top speed of the vehicle is 100 kmph");
    }

    public void printTopSpeed(int topSpeed){
        System.out.println("Top speed of the vehicle is "+topSpeed+" kmph");
    }

    public void printTopSpeed(String vehicleName, int topSpeed){
        System.out.println("Top speed of the vehicle "+ vehicleName +" is "+topSpeed+" kmph");
    }
}