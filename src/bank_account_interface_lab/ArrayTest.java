package bank_account_interface_lab;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Title: ArrayTest
 * @Package bank_account_interface_lab
 * @Author: lijunpeng
 * @CreateTime: 10/16/23 2:29 PM
 */
public class ArrayTest {

    public static void main(String[] args) {
        // String s = "abc";
        // String d = "hijkl";
        // String out = new ArrayTest().mergeAlternately(s, d);
        // System.out.println(out);
        String s = new ArrayTest().reverseVowels(" ");
        System.out.println(s);
    }

    public String reverseVowels(String s) {
        char[] chArr = new char[s.length()];
        List<Integer> vowelIndexList = new ArrayList();
        String upS = s.toUpperCase();
        String regex = "[aeiouAEIOU]";
        for(int i=0; i<upS.length(); i++){
            char c = upS.charAt(i);
            if(("" + c).matches(regex)){
                vowelIndexList.add(i);
            }
        }
        int j = 0;
        int size = vowelIndexList.size();
        for(int n = 0; n<size; n++){
            int limit = vowelIndexList.get(n);
            for(int m = j; m <= limit; m++){
                if(m == limit){
                    chArr[limit] = s.charAt(vowelIndexList.get(size-n-1));
                    j = m+1;
                    break;
                } else {
                    chArr[m] = s.charAt(m);
                }
            }
        }
        for(int k=j; k<s.length(); k++){
            chArr[k] = s.charAt(k);
        }
        return new String(chArr);
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                ret.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                ret.append(word2.charAt(i));
            }
            i++;
        }
        return ret.toString();
    }

    // public String mergeAlternately(String word1, String word2) {
    //     int len1 = word1.length();
    //     int len2 = word2.length();
    //     int diff = len1 - len2;
    //     String newWord = "";
    //     if(diff >= 0){
    //         int cnt = len2;
    //         int i = 0;
    //         while(cnt > 0){
    //             newWord += word1.charAt(i);
    //             newWord += word2.charAt(i);
    //             cnt--;
    //             i++;
    //         }
    //         newWord += word1.substring(len2);
    //     }
    //     if(diff < 0){
    //         int cnt = len1;
    //         int i = 0;
    //         while(cnt > 0){
    //             newWord += word1.charAt(i);
    //             newWord += word2.charAt(i);
    //             cnt--;
    //             i++;
    //         }
    //         newWord += word2.substring(len1);
    //     }
    //     return newWord;
    // }
}
