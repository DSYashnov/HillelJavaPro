package hw_11;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"u", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        try {
            int result = doCalc(array);
            System.out.println("the sum of all numbers is: " + result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
    public static int doCalc (String[][] array) {
        if (array.length != 4 ) {
            throw new ArraySizeException("Array must have 4 rows");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Row " + i + " must have 4 elements.");
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid value position [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}
