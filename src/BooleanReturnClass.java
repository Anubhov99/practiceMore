//Write a method that takes in 3 integers as parameter and returns true if atleast two of the integers
// have the same rightmost number

public class BooleanReturnClass {



    public static boolean returnBoolean(int x, int y, int z){

        int d1 = Math.abs(x%10);
        int d2 = Math.abs(y%10);
        int d3 = Math.abs(z%10);


       return (d1==d2 || d2==d3 || d3==d1);
    }

    public static void main(String[] args) {
        System.out.println(returnBoolean(27,37,45)); // true
        System.out.println(returnBoolean(21,23,43)); //true
        System.out.println(returnBoolean(20,23,47)); //false
    }
}
