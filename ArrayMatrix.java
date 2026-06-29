public class ArrayMatrix {
     public static void main(String[] args) {

        int arr[] = {7, 9, 3, 7, 6, 2, 0, 4};

        int max = arr[0];

        // Find maximum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create matrix
        int matrix[][] = new int[max][arr.length];

        // Fill matrix
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j]; i++) {
                matrix[max - 1 - i][j] = 1;
            }
        }

        // Print matrix
        for (int i = 0; i < max; i++) {

            System.out.print((max - i) + " ");

            for (int j = 0; j < arr.length; j++) {

                if (matrix[i][j] == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
