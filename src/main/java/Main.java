/*

Instructions
    The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown below.
    The Lo Shu Magic Square has the following properties:
        The grid contains the numbers 1 through 9 exactly.
        The sum of each row, each column, and each diagonal all add up to the same number.
        An example is shown below.
        | 4 | 9 | 2 |
        | 3 | 5 | 7 |
        | 8 | 1 | 6 |
In a program you can simulate a magic square using a two-dimensional array.
Write a method that accepts a two-dimensional array as an argument,
and determines whether the array is a Lo Shu Magic Square. Test the function in a program.

*/
public class Main {
    public static void main(String[] args) {

        int[][] twoDimensionalArr = {{1,3,4}, {2,4,5}, {3,4,5}};
        System.out.println("Print out the the first value at 0,0");
        System.out.println(twoDimensionalArr[0][0]);

        // Print out the 3rd row
        System.out.println("Print out the 3rd row");
        int[] thirdRowValues = twoDimensionalArr[2];
        for (int thirdRowVal : thirdRowValues) {
            System.out.println(thirdRowVal);
        }

        //Create a 2D Array with 3 rows and 3 columns and loop through all the values in the 2D Array
        System.out.println("\n Print all the values in a 2D Array");
        String[][] twoDimensionalArr2 =
                {{"Name", "Id", "Type"},{"Pikachu", "0049", "Electric"},{"Squirtle", "0007", "Water"},{"Bulbasaur", "0001", "Grass"}};

        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 3; col++) {
                System.out.print(twoDimensionalArr2[row][col]);
                if(col == 2){
                    System.out.println("\n");
                } else {
                    System.out.print("|");
                }
            }
        }

    }
}