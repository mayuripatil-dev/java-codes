public class OperatorsDemo {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("Addition:" + sum);
    }

    //Method with return 
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args){
        //Operators
        int x = 10, y = 10;
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));

        //Arithmetic Promotion
        byte a = 20, b = 40;
        int result = a + b;   // promoted to int 
        System.out.println("Arithmetic Promotion Result: " + result);

        //Method Calling 
        OperatorsDemo obj = new OperatorsDemo();
        obj.add(6,  5);
        int product = obj.multiply( 4,  6);
        System.out.println("Multiplication: " + product);
    }
}