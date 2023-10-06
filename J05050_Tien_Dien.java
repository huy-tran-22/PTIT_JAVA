import java.util.Scanner;

public class J05050_Tien_Dien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String ma = sc.nextLine();
			int cu = Integer.parseInt(sc.nextLine());
			int moi = Integer.parseInt(sc.nextLine());
			System.out.println(new TienDien(ma,cu,moi));
		}
	}
}

//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700