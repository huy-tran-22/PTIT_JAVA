
import java.util.Scanner;


public class J01026_So_Chinh_Phuong_2 {
    public static boolean snt(double n){
        if (n < 2) return false;
        else if (n == 2 || n ==3 ) return true;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            double check = Math.sqrt(n);
            if (snt(check)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
