class lengthOfLastWord {
     public int lengthOfLastWord(String s) {
        boolean spaceConfirmation = false; int lastWord = 0;
        char[] stringArray = s.toCharArray();
        
        for(int i = 0; i < stringArray.length; i++){
            if(Character.isLetter(stringArray[i]) == false){
                spaceConfirmation = true;
            }
            if(spaceConfirmation == true){
                lastWord++;
            }
            if(spaceConfirmation == true && Character.isLetter(stringArray[i]) == false){
                System.out.println("here");
                lastWord = 0;
                spaceConfirmation = false;
            }
        }
        return lastWord;
    }
    public static void main(String args[]){
    }
}