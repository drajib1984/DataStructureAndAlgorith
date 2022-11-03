package DataStructureAlgorithm.i_FirstJavaProgram;

public class TypeCasting {
    public static void main(String[] args) {
        //type casting
//int a= 67.58; will through an error because the input is float. LHS must be always greater than RHS
// to do this we need to type cast
// compressing the bigger type into smaller type explicitly is called type casting
        int a = (int) (67.88);
        System.out.println(a); // will always print the whole number ignoring the decimal part

        //automatic type promotion
// maximum number byte can store is 256. If you give larger it will only store the difference with 256

         byte b = (byte) 260;
        System.out.println(b);

        byte c = 40;
        byte d =50;
        byte e = 10;
        int f =c*d/e; // during byte operation, bytes are automatically converted in to int
        System.out.println(f);

        int number='A'; // Java follows Unicode and ASCII
        System.out.println(number);
        System.out.println("नमस्ते");



    }
}
