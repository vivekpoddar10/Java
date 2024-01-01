public class Functions {
    /*
    * Defining functions:
    *   While defining functions, we have to explicitly specify the return type of the function
    * @param()
    *
    * */
    public static int calcSum(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myArray = new int[5];
        for(int i=0; i<myArray.length; i++) {
            myArray[i] = i+1;
        }
        for (int i:myArray) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(calcSum(myArray));
    }
}
