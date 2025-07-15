public class PrintPattern {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            for(int counter = 1; counter <= count; counter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
