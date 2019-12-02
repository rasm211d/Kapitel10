public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int x = 0; x < 10; x++) {
            array[x] = x;
        }
        for (int arrayNumber = 0; arrayNumber < 10; arrayNumber++) {
            System.out.println(array[arrayNumber]);
        }
    }
}
