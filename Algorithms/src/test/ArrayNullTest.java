package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import swordOffer.BinaryNode;

public class ArrayNullTest {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = Arrays.copyOfRange(a, 0, 0);
		System.out.println(b == null);
	}

/*
 * //一个试验文件，测试二叉树按行打印
 * public int[][] printTree(BinaryNode root) {
		// write code here
		if (root == null) {
			return null;
		}
		ArrayList res = new ArrayList<Integer>();
		// 记录弹出结点的值
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 申请队列
		LinkedList<BinaryNode> queue = new LinkedList<>();
		// 申请last(记录当前打印行的最右结点),nlast(记录下一行的最右结点)两个结点
		BinaryNode last = root;
		BinaryNode nLast = root;
		// 初始头结点添加到队列中
		queue.add(root);
		// 缓存弹出的结点
		BinaryNode node = null;
		while (!queue.isEmpty()) {
			// 弹出结点
			node = queue.removeFirst();
			// 添加到集合中
			list.add(node.data);
			// 弹出结点后将结点的左右孩子依次加入队列中，更新nLast
			if (node.lChild != null) {
				queue.add(node.lChild);
				if(node.rChild == null) {
					nLast = node.lChild;
					break;
				}
			}else{
//			if (node.rChild != null) {
				queue.add(node.rChild);
				nLast = node.rChild;
			}
			// 如果弹出的结点恰好是当前行的最右结点,把last指向nLast
			if (node == last) {
				last = nLast;
				res.add((ArrayList<Integer>) list.clone());
				list.clear();
			}
		}
		int[][] arr = new int[res.size()][];
		for (int i = 0; i < res.size(); i++) {
			arr[i] = new int[res.get(i).size()];
			for (int j = 0; j < res.get(i).size(); j++) {
				arr[i][j] = res.get(i).get(j);
			}
		}
		return arr;
		}*/
}