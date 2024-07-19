package les_03.ArrayExample;

public class ArraysExample
{
    public static void main(String[] args)
    {
        int [] array = new int [15];

        for (int i : array)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("-----");
        int[] arrays = {
                1, 2, 3, 4
        };
        for (int i = 0; i < arrays.length; i++)
        {
            System.out.print(arrays[i]);
        }

        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 1;
        array[9] = 1;
        array[10] = 1;
        array[11] = 1;
        array[12] = 1;
        array[13] = 1;
        array[14] = 1;
        System.out.println();
        System.out.println("-----");

        for (int i : array){
            System.out.print(i);
        }

        int [] array2 = new int [10];

        for (int i = 0; i < array2.length; i++){
            array2[i] = array[i];
        }
        System.out.println();
        for (int i : array2){
            System.out.print(i);
        }

    }
}
