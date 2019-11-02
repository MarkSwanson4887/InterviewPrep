class lengthOfLastWord {
     public static int lengthOfLastWord(String s) {
        int lastWord = 0;
        char[] stringArray = s.toCharArray();
        boolean endNull = false;

        if(s.isEmpty() == true){
            return 0;
        }
        if(Character.isLetter(stringArray[s.length() - 1]) == false){
            endNull = true;
        }
        for(int i = stringArray.length - 1;i >= 0;i--){
            if(endNull == true){
                if(Character.isLetter(stringArray[i]) == true){
                    endNull = false;
                }
            }
            if(endNull == false){
                if(Character.isLetter(stringArray[i]) == false){
                    break;
                }
                lastWord++;
            }
        }
        return lastWord;
    }
    public static void main(String args[]){
        System.out.println(lengthOfLastWord("Hello World") + ": The result of this should be 5");
        System.out.println(lengthOfLastWord("Hi my name is matthew swentzel") + ": The result of this should be 8");
        System.out.println(lengthOfLastWord(" ") + ": The result of this should be 0");
        System.out.println(lengthOfLastWord("aaa  ") + ": The result of this should be 3");
        System.out.println(lengthOfLastWord("a a ") + ": The result of this should be 1");
    }
}