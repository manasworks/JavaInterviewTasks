package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Asel_8_11_2022 {
    public static void main(String[] args) {
        int n = 4566;
        int digits=0;
        while (n>0){
            n/=10;
            digits++;
        }
        System.out.println(digits);
    }
}
