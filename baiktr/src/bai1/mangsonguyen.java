package bai1;

import java.util.Arrays;

public class mangsonguyen {
	//a
	public static int giatrichan(int[] arr) {
		int count = 0;
		for (int num :arr) {
			if (num % 2 == 0);{
				count++;
			}
		}
		return count;
	}
	//b
	public static boolean tangdan(int[] arr) {
		for (int i = 0; i< arr.length -1; i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	//c
	public static int demsoluongphantu(int[] arr, int start,int end){
		int count = 0;
		for (int num : arr) {
			if(num >= start && num <= end) {
				count++;
			}
		}
		return count;
	}
	//d
	public static int tinhtongphantumang(int[]arr) {
		int sum = 0;
		for (int num : arr) {
			sum += sum;
		}
		return sum;
	}
	//e
	public static int tinhtongphantule(int [] arr) {
		int sum = 0;
		for(int num : arr) {
			if(sum % 2 != 0) {
				sum += num;
			}
		}
		return sum;
	}
	//f
	public static void sapxepmangtangdan(int [] arr) {
		int n = arr.length;
		for (int i = 0 ; i < n - 1; i++) {
			for (int j = 0; j< n-i-1; j++ ) {
				if (arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	//g
	public static int timgiatrilonnhatmang(int[] arr) {
		int max = arr[0];
		for (int i= 1; i < arr.length;i++) {
			if (arr[i] > max);{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,23,5,7,9,50,100};
		
		System.out.println(" A. so luong phan tu chan trong mang la:" + giatrichan(arr));
		System.out.println(" B. mang co duoc sap xep tang dan khong:" + tangdan(arr));
		System.out.println(" C. co bao nhieu phan tu gia tri tu 4 den 12 la:" + demsoluongphantu(arr, 4, 12));
		System.out.println(" D. tong cac phan tu cua mang la:" + tinhtongphantumang(arr));
		System.out.println(" E. tong cac phan tu co gia tri le la:" + tinhtongphantule(arr));
		System.out.println(" F. sap xep tang dan theo giai thuat noi bot la:" + Arrays.toString(arr));
		System.out.println(" G. gia tri lon nhat cua mang la:" + timgiatrilonnhatmang(arr));
	}

}
