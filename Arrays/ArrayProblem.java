package Arrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayProblem {

	public static void removeBadPairs(ArrayList<Integer> list) {
		if (list.size() % 2 != 0) {
			list.remove(list.size() - 1);
		}
		for (int i = list.size() - 1; i > 0; i--) {
			if (i % 2 != 0 && list.get(i - 1) > list.get(i)) {
				list.remove(i);
				list.remove(i - 1);
				
			}
		}JOptionPane.showMessageDialog(null,"Lista"+list);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(12);
		list.add(6);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(2);
		
		ArrayProblem.removeBadPairs(list);
	}

}
