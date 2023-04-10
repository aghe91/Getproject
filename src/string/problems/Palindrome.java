package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String str="MOM";
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("palindrome String");
        }
        else
        {
            System.out.println("not palindrome String ");
        }
    }

}


