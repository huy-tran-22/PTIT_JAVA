package code_ptit;

import java.util.Scanner;

public class J02005_Giao_2_Day_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int res[] = new int[1001];
        for (int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            res[a[i]] = 1;
        }
        for (int i = 0 ; i < m ; i++){
            b[i] = sc.nextInt();
            if (res[b[i]] == 1){
                System.out.printf("%d ",b[i]);
                res[b[i]] = 0;
            }
        }
    }
}
