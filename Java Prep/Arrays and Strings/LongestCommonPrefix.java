class Solution {
    public String longestCommonPrefix(String[] strs) {
            String longestPrefix = "";
            if(strs == null || strs.length == 0 || strs[0].isEmpty() == true){
                return "";
            }
            if(strs.length < 2){
                return strs[0];
            }
            String[] firstWord = strs[0].split("(?!^)");
            int j = 0;
            while(j < firstWord.length){
                for(int i = 0; i < strs.length;i++){
                    if(strs[i].length() <= j){
                        return longestPrefix;
                    }
                    if(!(String.valueOf(strs[i].charAt(j)).equals(firstWord[j]))){
                        System.out.println(String.valueOf(firstWord[j]));
                        return longestPrefix;
                    }    
                }
                String string = String.valueOf(firstWord[j]);
                longestPrefix += string;
                j++;
            }
            return longestPrefix;
        }
    public static void main(args[]){
        System.out.println(longestCommonPrefix("hehello"));
    }
}