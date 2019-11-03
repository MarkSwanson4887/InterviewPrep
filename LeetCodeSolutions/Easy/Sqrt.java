class Sqrt {
    public static int mySqrt(int x) {
        if(x < 0){
            return -2147483648;
        }
        int returnVal = (int) Math.pow(x, .5);
        return returnVal;
    }
    public static void main(String args[]){
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(16));
    }
}