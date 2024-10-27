package LeetcodeTasks;

public class Merge_Strings_Alternately_1768 {
    public static void main(String[] args) {
        String str = "acd";
        String str2 = "befg";
        String sym = mergeAlternately(str,str2);
        System.out.println(sym);

    }
    public static String mergeAlternately(String word1, String word2) {
        if(word1.equals("")){
            return word2;
        }
        if(word2.equals("")){
            return word1;
        }
        int sum_len = word1.length()+word2.length();
        StringBuilder res = new StringBuilder();
        char[] w1_arr = word1.toCharArray();
        char[] w2_arr = word2.toCharArray();
        int i = 0;
        int j = 0;
        while (i+j!=sum_len){
            if(i<word1.length()){
                res.append(w1_arr[i]);
                i+=1;
            }
            if(j<word2.length()){
                res.append(w2_arr[j]);
                j+=1;
            }

        }
        return res.toString();

    }

}
