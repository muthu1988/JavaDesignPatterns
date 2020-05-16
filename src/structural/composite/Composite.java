package structural.composite;

import java.util.Arrays;

public class Composite {
	public static void main(String[] args) {
		
		SingleValue singleValue = new SingleValue(1);
		SingleValue singleValue1 = new SingleValue(2);
		SingleValue singleValue2 = new SingleValue(3);
		SingleValue singleValue3 = new SingleValue(4);
		
		MyList myList = new MyList(Arrays.asList(singleValue3));
		System.out.println(myList.sum());
		
		ManyValues manyValues = new ManyValues();
		manyValues.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
		myList = new MyList(Arrays.asList(manyValues));
		System.out.println(myList.sum());
		
	}
}