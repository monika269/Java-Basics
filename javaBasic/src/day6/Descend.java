package day6;

import java.util.Comparator;

public class Descend implements Comparator<Integer> {

	public int compare(Integer i1,Integer i2) {
		return i2.compareTo(i1);
	}
}
