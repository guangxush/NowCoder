package strings;

import java.util.Scanner;

/**
 *  题目描述
	设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
	如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
	如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
	输入描述:
	有多组测试样例，每组测试样例包含两行，第一行为一个整数N（N<=100），第二行包含N个数(每个数不超过1000，空格分开)。
	输出描述:
	每组数据输出一个表示最大的整数。
	示例1
	输入
	2
	12 123
	4
	7 13 4 246
	输出
	12312
	7424613
 */
public class NumberofStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.valueOf(in.nextLine().trim());
		if(count>100) return;
		String inStr = in.nextLine().trim();
		String[] dataStr = inStr.split(" ");
		int data[] = new int[dataStr.length];
		for(int i =0;i<dataStr.length;i++) {
			data[i] = Integer.valueOf(dataStr[i]);
		}
		for(int j= data.length-1;j>=0;j--) {
			for(int i=0;i<j;i++) {
				if(!is1stBiggerThan2nd(data[i], data[i+1])) {
					int temp = data[i+1];
					data[i+1] = data[i];
					data[i] = temp;
				}
			}
		}
		String result = "";
		for(int each :data) {
			result+=String.valueOf(each);
		}
		System.out.println(result);
	}
	static boolean is1stBiggerThan2nd(Integer a, Integer b) {
		if(Integer.valueOf(String.valueOf(a)+String.valueOf(b))>
		Integer.valueOf(String.valueOf(b)+String.valueOf(a))){
			return true;
		}else {
			return false;
		}
	}
}
