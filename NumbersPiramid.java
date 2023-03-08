public class NumbersPiramid {
    public static void main(String[] args) {
    
        for (int i = 0; i <5; i++) {
            int count =1;
            for (int j = 0; j < i+1; j++) {
                
                System.out.print(count);
                count++;
            }
            
            System.out.println();
        }

        // new logic by apna clg
        int n=5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
