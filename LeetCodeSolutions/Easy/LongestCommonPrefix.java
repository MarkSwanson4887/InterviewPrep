public class LongestCommonPrefix {
    public static String LongestCommonPrefix(String[] strs) {
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
                        return longestPrefix;
                    }    
                }
                String string = String.valueOf(firstWord[j]);
                longestPrefix += string;
                j++;
            }
            return longestPrefix;
        }
    public static void main(String args[]){
        String[] strs= new String[3];
        String[] strs2 = new String[3];
        strs[0] = "flower"; strs[1] = "flow"; strs[2] = "flag";
        strs2[0] = "real"; strs2[1] = "reeel"; strs2[2] = "";
        System.out.println(LongestCommonPrefix(strs));
        System.out.println(LongestCommonPrefix(strs2));
    }
}