package tree;
import java.util.Scanner;
/**
 *  题目描述
	现在有一棵合法的二叉树，树的节点都是用数字表示，现在给定这棵树上所有的父子关系，求这棵树的高度
	输入描述:
	输入的第一行表示节点的个数n（1 ≤ n ≤ 1000，节点的编号为0到n-1）组成，
	下面是n-1行，每行有两个整数，第一个数表示父节点的编号，第二个数表示子节点的编号
	输出描述:
	输出树的高度，为一个整数
	示例1
	输入
	5
	0 1
	0 2
	1 3
	1 4
	输出
	3
 */
public class TheMaxHeightofBinaryTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n<3) {
			System.out.println(n);
		}else {
			int[] height = new int[n];//用于存储深度
			int[] binary = new int[n];//用于存储节点的子节点数量
			height[0] = 1;
			int max = 0;
			for(int i=0;i<n-1;i++) {
				int parent = in.nextInt();
				int child = in.nextInt();
				binary[parent] += 1;
				if(binary[parent]<3) {//子节点数量大于3不做判断，因为题目是二叉树
					height[child]  = height[parent]+1;//child的深度为parent的深度+1
				}
				max = Math.max(max, height[child]);
			}
			System.out.println(max);
		}
	}
}
