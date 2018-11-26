package framework;

import java.util.Comparator;

public class Compare implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.weight > p2.weight) {
			return 1;
		}
		else if(p1.weight < p2.weight){
			return -1;
		}

		else if (p1.weight == p2.weight) {
			if (p1.height > p2.height) {
				return 1;
			} else  {
				return -1;
			}

		}
		return 1;

	}
}
