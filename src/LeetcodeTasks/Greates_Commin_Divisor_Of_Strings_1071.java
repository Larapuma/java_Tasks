package LeetcodeTasks;

public class Greates_Commin_Divisor_Of_Strings_1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));

    }
    public static String gcdOfStrings(String str1, String str2) {
        int str1_size = str1.length();
        int str2_size = str2.length();
        char[] arr = str2.toCharArray();
        String str1_str2 = str1+str2;
        String str_2_str1 = str2+str1;
        if (!str1_str2.equals(str_2_str1)){
        return "";
        }
        int size = NOD(str1_size,str2_size);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            res.append(arr[i]);
        }
        return res.toString();
    }
    public static int NOD(int x, int y){
        if(x==y){return x;}
        while (x!=y){
        if(x>y)x-=y;
        else y-=x;
        }
        return x;
    }

}
