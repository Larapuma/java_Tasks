package LeetcodeTasks;

import java.util.stream.Stream;

public class Add_Binary_67 {
    public static void main(String[] args) {
        System.out.println(addBinary_("01010101","10101010"));
        System.out.println(addBinary("0","0"));


    }
    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ost = 0;
        char[] a_char = a.toCharArray();
        char[] b_char = b.toCharArray();
        int i = a.length()-1;
        int j = b.length()-1;
        while (i>=0||j>=0||ost>0){
            int digitA = 0;
            int digitB = 0;

            if(i>=0){
                digitA = a_char[i] - '0';
                i-=1;
            }
            if(j>=0){
                digitB = b_char[j] - '0';
                j-=1;
            }
            int sum = digitA+digitB+ost;
            res.append(sum%2);
            ost = sum/2;



        }
        return res.reverse().toString();
    }

    public static String addBinary_(String a, String b) {
        if(a.equals("0")&&b.equals("0")){
            return a;
        }
        int sum = convert_to10(a) +convert_to10(b);
        StringBuilder res = new StringBuilder();
        while (sum!=0){
            int ost = sum%2;
            res.append(ost);
            sum/=2;
        }

        return (res.reverse()).toString();

    }
    public static int convert_to10(String a){
        if(a.equals("0") ||a.equals("1")){
            return Integer.parseInt(a);
        }
        int res = 0;
        char[] arr = a.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            res+= Math.pow(2,(arr.length-i-1))*Character.getNumericValue(arr[i]);
        }
        return res;
    }

}
// 1111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000