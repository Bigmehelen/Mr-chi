public class SumOfASeries {
    public static void main(String[] args) {

        for (long count = 1; count <= 100; count++) {
            
            long sum = count * (count + 1) / 2;
            System.out.printf("%-5d | %-10d%n", count , sum );
        }
    }
}