import java.util.Arrays;

class isUnique {
	//An algorithm to determine whether or not a string has all unique chars
	//with data structures used
	static boolean isUniqueString(String word) {
		boolean result = false; 
		char[] toSort = word.toCharArray();
		Arrays.sort(toSort);

		for(int i = 1; i < toSort.length; i++){
			if(toSort[i] == toSort[i - 1]){
				result = false;
				break;
			}
			else{
				result = true;
			}
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		isUniqueString("baeb");
		isUniqueString("stirr");
		isUniqueString("baby");
		isUniqueString("bea");
		isUniqueString("qwertyuiopasdghj");
		
	}

}