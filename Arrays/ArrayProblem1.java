package Arrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayProblem1 {

	public static void removeBadPairs(ArrayList<Integer> list) {
		if (list.size() % 2 != 0) {
			list.remove(list.size() - 1);
		}
		for (int i = 0; i < list.size(); i += 2) {
			if (list.get(i) > list.get(i + 1)) {
				list.remove(i);
				list.remove(i);
				i -= 2;
			}
		}
		JOptionPane.showMessageDialog(null, "Lista" + list);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(11);
		list.add(20);
		list.add(2);
		list.add(12);
		list.add(23);
		list.add(24);

		ArrayProblem1.removeBadPairs(list);
	}

}
