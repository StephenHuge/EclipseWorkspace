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
 * //һ�������ļ������Զ��������д�ӡ
 * public int[][] printTree(BinaryNode root) {
		// write code here
		if (root == null) {
			return null;
		}
		ArrayList res = new ArrayList<Integer>();
		// ��¼��������ֵ
		ArrayList<Integer> list = new ArrayList<Integer>();
		// �������
		LinkedList<BinaryNode> queue = new LinkedList<>();
		// ����last(��¼��ǰ��ӡ�е����ҽ��),nlast(��¼��һ�е����ҽ��)�������
		BinaryNode last = root;
		BinaryNode nLast = root;
		// ��ʼͷ�����ӵ�������
		queue.add(root);
		// ���浯���Ľ��
		BinaryNode node = null;
		while (!queue.isEmpty()) {
			// �������
			node = queue.removeFirst();
			// ��ӵ�������
			list.add(node.data);
			// �������󽫽������Һ������μ�������У�����nLast
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
			// ��������Ľ��ǡ���ǵ�ǰ�е����ҽ��,��lastָ��nLast
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