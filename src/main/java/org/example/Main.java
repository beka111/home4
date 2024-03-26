package org.example;

public class Main {
    public static void main(String[] args) {double[] numbers = {3.5, 5.5, 6.8, 6.6, -2.5, -9.9, 1.2, 2.8, 5.9, 12.50, 8.7, 15.5, -25.6, 14.2, 66.5};
        double sum = 0;
        int count = 0;
        boolean foundLessNumber = false; // true

        for (double digits: numbers) {
            if (foundLessNumber){
                if (digits > 0){
                    sum+=digits;
                    count++;
                }
            } else if (digits < 0) {
                foundLessNumber = true;
            }
        }
        System.out.println(sum + "/" + count);
    }
}

