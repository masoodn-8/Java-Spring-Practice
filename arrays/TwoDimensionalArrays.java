import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
     
        //2D arrays are easy to store values in row and column format.
        

        //Declaration of 2D arrays.
        int[][] nums = new int[3][3];

        //Insert values using indexes..
        // nums[0][0] = 1;
        // nums[0][1] = 2;
        //indexes first will get over for rows.. then columns like [0][0] - [0][2] -- [1][0] -- [1][2]

        //Insert the values using loop
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        //Print using loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
