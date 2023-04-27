package lab3problem4;

import java.util.Comparator;

public class HireComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDatehire().compareTo(o2.getDatehire());
	}

}
