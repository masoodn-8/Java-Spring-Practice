import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        //Arrays are used to store same type of multiple data
        //Example : Storing the data of student marks in one variable using array.
        
        
        int studentMrks[] = new int[5]; //Declaration of array

        //After initialization we have to insert values into array using indexes.
        studentMrks[0] = 50;
        studentMrks[1] = 48;
        studentMrks[2] = 45;


        //Initialization and declaration of array.
        int studentMarks[] = {50,48,45,40,42}; //One student multiple marks in single variable

        //Accessing values using indexes..
        System.out.println("value at index 2: " + studentMarks[2]); //It will print the value of second index of student array.

        //Note : Index for array starts from 0.

        //Update of values.
        studentMarks[1] = 50; //It will change the value of first index (48) to 50.

        //To print the total values of array, we use loop.

        for (int marks : studentMarks) {
            System.out.println(marks);
        }

        //using loop for taking values into array.
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
        
            marks[i] = sc.nextInt();
        }

        sc.close();
        


    }


}
