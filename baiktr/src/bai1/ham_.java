package bai1;

public class ham_ {
	public static int hamdequy(int n) {
		if (n<= 2) {
			return 1;
		}else {
			return hamdequy(n-1) + hamdequy(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = hamdequy(8);
		System.out.println("gia tri cua f(8) la:" + result);
		
	}
}
