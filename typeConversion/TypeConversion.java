public class TypeConversion {
    public static void main(String[] args) {
        //Type casting is when you assign a value of one data type to another data type.

        //There are two types of casting : 1) Widening Casting 2)Narrowing Casting

        //Widening Casting : byte -> short -> char -> int -> long -> float -> double (Automatically)

        int number = 10;

        double d_number = number; // Automatically integer value got converted into double. 

        System.out.println(d_number); 

        //Narrowing Casting : double -> float -> long -> int -> char -> short -> byte (Manually)


        double doubleNum = 108.6;
        int intNum = (int) doubleNum; // Manually we are converting double to integer.

        System.out.println(intNum);
    }
}
