package structural.composite;

import java.util.ArrayList;
import java.util.Collection;

class MyList extends ArrayList<ValueContainer> {
	// please leave this constructor as-is
	public MyList(Collection<? extends ValueContainer> c) {
		super(c);
	}

	public int sum() {
		// todo
		int sum = 0;
		for (ValueContainer container : this) {
			for (Integer val : container) {
				sum += val;
			}
		}
		return sum;
	}
}