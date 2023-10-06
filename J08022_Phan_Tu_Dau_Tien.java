import java.util.Scanner;
import java.util.Stack;

public class J08022_Phan_Tu_Dau_Tien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while ( t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			Stack <Integer> st = new Stack<>();
			for (int i = n-1 ; i >= 0 ; i--) {
				while (!st.empty() && a[st.peek()] <= a[i]) {
					st.pop();
				}
				if (st.isEmpty()) b[i] = -1;
				else b[i] = a[st.peek()];
				st.add(i);
			}
			for (int i : b) {
				System.out.printf("%d ",i);
			}
			System.out.println();
		}
	}
}
