package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String s1="cat";
        String s2="act";
        if(isAnagrams(s1,s2))
        {
            System.out.println(s1+ " and "+s2+ " are anagrams");
        }
        else
        {
            System.out.println(s1+ " and "+s2+ " are not anagrams");
        }

    }
    static boolean isAnagrams(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }
        else
        {
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}


