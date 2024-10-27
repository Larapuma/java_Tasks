package LeetcodeTasks;

import java.util.Arrays;

public class Plus_one_66 {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println(Arrays.toString(plusOne(arr2)));
        System.out.println(Arrays.toString(plusOne(arr3)));

    } public static int[] plusOne(int[] digits) {
        if(digits.length==0){
            return digits;
        }
        int ind = digits.length -1;
        for (int i = ind; i >=0; i--) {
            digits[i]+=1;
            if(digits[i] == 10){
                digits[i] = 0;
            }
            else {
                break;
            }

        }

        if(digits[0] == 0){
            int[] new_digits = new int[ind+2];
            for (int i = 0; i < new_digits.length; i++) {
               new_digits[i] = 0;

            }
            new_digits[0] =1;
            return new_digits;
        }
        return digits;
    }


       }

