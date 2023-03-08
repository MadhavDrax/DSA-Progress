public class ReversNumPiramid {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int count=1;
            for (int j = 4; j >=i ; j--) {
                System.out.print(count+" ");
            count++;
            }
            System.out.println();
        }
    }
}
