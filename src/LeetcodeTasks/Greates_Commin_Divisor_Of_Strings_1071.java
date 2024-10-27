package LeetcodeTasks;

public class Greates_Commin_Divisor_Of_Strings_1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
    }
    public static String gcdOfStrings(String str1, String str2) {

        char[] arr_str1 = str1.toCharArray();
        char[] arr_str2 = str2.toCharArray();
        StringBuilder res = new StringBuilder();
        int size = 0;
        int counter = 0;

        for (int i = 0; i < arr_str1.length; i++) {
            if(size == str2.length() ){
                size = 0;

                counter+=1;

                if(counter>(int) res.length()/str2.length()){
                    res.append(str2);
                }
            }
            if(arr_str1[i] == arr_str2[size]) {
                size += 1;
            }
            else{
                size=0;
                counter =0;
            }
        }
        return res.toString();

    }

}
