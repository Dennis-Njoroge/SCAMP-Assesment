public class JavaFibonacci {

    public static void main(String[] args) {
        //Declare and initialize variables
        int count = 10, num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series of "+count+" numbers:");

        //Using for-loop
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPreviousNo = num1 + num2;
            num1 = num2;
            num2 = sumOfPreviousNo;
        }
    }
}
