/******************************************************************************
 * 
 * Solution for bonus_assignment2 : Pascal Pyramid 
 * The below program code generates 20 level of Pascal Pyramid diagram with
 * using for loop statement like.
 * 
 ******************************************************************************/

import java.util.ArrayList;

public class Pascals_Pyramid_Builder {

	static int maxRow = 20;

	public static void main(String[] args) {

		ArrayList<Integer> currList = new ArrayList<Integer>();

		ArrayList<Integer> prevList = new ArrayList<Integer>();

		for (int n = 0; n < maxRow; n++) {

			prevList = (ArrayList<Integer>) currList.clone();

			currList.clear();

			currList.add(0, 1);

			valCalculater(n, prevList, currList);

			System.out.println("Row#" + (n + 1) + ":" + "\t" + spaceBuilder(n) + dataCollecter(currList) + "\n");
		}
	}

	private static String spaceBuilder(int n) {
		String space = "";
		for (int m = maxRow - n; m > 1; m--) {
			space += "\t";
		}
		return space;
	}

	private static String dataCollecter(ArrayList<Integer> currList) {
		String rowData = "";
		for (int k = 0; k < currList.size(); k++) {
			rowData += (currList.get(k) + "\t" + "\t");
		}
		return rowData;
	}

	private static int valCalculater(int n, ArrayList<Integer> prevList, ArrayList<Integer> currList) {

		int val = 0;

		for (int i = 0; i < n; i++) {

			if (i > 0) {
				val = Math.addExact((int) prevList.get(i - 1), (int) prevList.get(i));
			} else {
				val = 1;
			}
			currList.add(i, val);
		}
		return val;
	}

}
