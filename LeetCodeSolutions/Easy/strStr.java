public class strStr {
    public static int strStr(String haystack, String needle) {
        //Original first attempt.
        if(needle == "" || needle.isEmpty()){
            return 0;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }
        char[] hArray = haystack.toCharArray(); char[] nArray = needle.toCharArray();
        int needleLen = nArray.length;
        char[] compArray = new char[needleLen];
        int i = 0; int j;
        String string2 = String.valueOf(nArray);
        for(j = 0; j < hArray.length; j++){
            if(hArray[j] == nArray[0]){
                if(j + needleLen > hArray.length){
                    return -1;
                }
                for(int k = j; k < j + needleLen; k++){
                    compArray[i] = hArray[k];
                    i++;
                }
                String string1 = String.valueOf(compArray);
                if(string1.equals(string2)){
                    return j;
                }
                else{
                    compArray = new char[needleLen];
                    i = 0;
                }
            }    
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        //Attempt utilizing substring
        int len = needle.length();
        if(len > haystack.length()){
            return -1;
        }
        if(len == 0 || haystack.length() == 1){
            return 0;
        }
        for(int i = 0; i < haystack.length() - len + 1; i++){
            if((haystack.substring(i,i + len)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("<--- StrStr Tests --->");
        System.out.println(strStr("needle", "ee") + ": Should return 1");
        System.out.println(strStr("dlelell", "ell") + ": Should return 4");
        System.out.println(strStr("string", "ing") + ": Should return 3");
        System.out.println(strStr("aaaa","baaa") + ": Should return -1");

        System.out.println("<--- StrStr2 Tests --->");
        System.out.println(strStr2("needle", "ee") + ": Should return 1");
        System.out.println(strStr2("dlelell", "ell") + ": Should return 4");
        System.out.println(strStr2("string", "ing") + ": Should return 3");
        System.out.println(strStr2("aaaa","baaa") + ": Should return -1");
    } 
}