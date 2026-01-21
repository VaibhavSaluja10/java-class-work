package array;

public class Two2DArray2 {
    public static void main(String[] arg) {
        
        int[][] array = {{1,2,3},{4,5,6},{7,9}};

        // Output
        System.out.println("2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
