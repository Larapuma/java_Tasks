package LeetcodeTasks;

import java.util.Arrays;

public class Length_of_Last_Word_58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String s1 = "Hello World";
        String s2 = "a   chdasda asdsadas  asd as dsa d";
        System.out.println(f(s));
        System.out.println(f(s1));
        System.out.println(f(s2));
        System.out.println("-=================================-");
        String str ="Hello world this is Java";
        System.out.println(Arrays.toString(str.split(" ")));

        System.out.println(Arrays.toString(s2.split(" ")));






    }
    public static int  f(String string) {
        if (string.indexOf(' ') == -1) {
            return string.length();
        }
        int counter = 0;
        int ind = string.length() - 1;
        char[] arr = string.toCharArray();
        while (arr[ind]==' '){
            ind-=1;
        }
        while (arr[ind]!=' '){
            counter+=1;
            if(ind-1<0){
                break;
            }
            ind-=1;
        }
        return counter;
    }

}
