public class exception {
    static void validate(int age){
        if (age< 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to election");

    }
    public static void main(String[] args){
        try {
            validate(50);
        }
        catch (ArithmeticException e){
            System.out.println("caught an exception :" + e.getMessage());
        }

        System.out.println("rest of the code ....");
    }

}
