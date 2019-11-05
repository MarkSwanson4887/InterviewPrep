import java.io.*; 
import java.util.*; 

class validPalindrome{
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.isEmpty()){
            return true;
        }
       for(int i = 0; i < s.length();i++){
           if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
               stack.push(s.charAt(i));
           }
       }
       for(int j = 0; j < s.length();j++){
           if(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j))){
               char poppedChar =  stack.pop();
               if(Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(poppedChar)){
                   return false;
               }
           }
       }
       return true;         
    }
    public static void main(String args[]){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama") + ": Should return true");
    }
}