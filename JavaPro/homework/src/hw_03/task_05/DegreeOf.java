package hw_03.task_05;

public class DegreeOf {
    public static void main(String[] args) {
        System.out.println(degreeOf(2, 2));
    }

    public static double degreeOf (int x, int n) {
        return Math.pow(x, n);
    }
}
