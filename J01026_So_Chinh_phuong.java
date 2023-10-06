
import java.util.Scanner;


public class J01026_So_Chinh_phuong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int N = (int)Math.sqrt(n);
            if (n == N*N) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
