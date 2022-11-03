package YouTubeCodingQuestions;
//sum of cube of all the digits is equal to the number
public class ArmstrongNumber {
    public static void main(String[] args) {
        checkArmstrong(153);
    }

    public static void checkArmstrong(int a){
        int sum=0;
        int a_copy=a;
        while (a>0){
            int remainder = a%10;
            int remainder_cube=remainder*remainder*remainder;
            sum=sum+remainder_cube;
            a=a/10;
        }
        if(a_copy==sum){
            System.out.println(a_copy+" is an armstrong number");
        }
        else {
            System.out.println(a_copy+" is not an armstrong number");
        }
    }
}
