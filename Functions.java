public class Functions {
    /*
    * Defining functions:
    *
    *Anatomy of Methods
    *   <access modifier> - public/private/protected
    *                     - it specify the scope of functions, till method will be available to call
    *   static - it specify that the method will be called without creating the object
    *          -
    *   <return type> - void/<any data type>/array/list etc
    *                 - it specifies what the method will be returning
    *   <method_name> - name of the method
    *   (<arguments>) - arguments that will be passed inside the method
    *                 - methods may have 0 or more arguments
    * */
    public static int calcSum(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }

    private static void sayHello() {
        System.out.println("Hello World");
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
        sayHello();
    }
}
