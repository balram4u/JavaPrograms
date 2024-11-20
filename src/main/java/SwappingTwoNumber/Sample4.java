package SwappingTwoNumber;

public class Sample4 {
    public static void main(String[] args) {
        //We are going to use Bitwise XOR operator (^)
        //this logic will not be applicable with 0 numbers
        int a=10,b=20;
        System.out.println("Before Swapping the values are .. "+a+ "  "+b);
       a=a^b;  //a=30
       b=a^b;   //b=10
       a=a^b;   //a=20
        System.out.println("After Swapping the values are .. "+a+ "  "+b);
    }
}
// XOR = When both the inputs are different then it gives 1 , when same it gives 0.
// 10 =01010
// 20 =10100
//a=a^b=11110 =30   now a=30

//b=a^b =30^20 =
// 30  =11110
// 20  =01010
//30^20=10100 =20    now b=10

//a=a^b  = 30^10
//30  = 11110
// 10 = 01010
//30^10=10100 =20    now a=20





