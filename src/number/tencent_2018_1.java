package number;
import java.util.Scanner;
/**
 *给定正整数n和m，保证n能整除2m，有关n和m的数列如下所示
  若n=8，m=2， -1 -2 +3 +4 -5 -6 +7 +8
  若n=6，m=3， -1 -2 -3 +4 +5 +6
  对于任意给出的符合要求的n和m，请输出其对应数列的和。 
  输入：第一行为正整数n和m
  输出：其对应数列的和
 */
public class tencent_2018_1 {
	public  static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int j=1,sum=0,flag=-1;
		for(int i=1;i<n;i++) {
			if(j++%m==0) {
				flag *= -1;
			}
			sum+=flag*i;
		}
		System.out.println(sum);
	}
}
