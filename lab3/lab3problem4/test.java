package lab3problem4;

import java.util.Date;

public class test {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		
		
		Employee e1 = new Employee("Tolik" , 4300, new Date(2000), "1111");
		Employee e2 = new Employee("Valik" , 100, new Date(10000), "2222");
		
		Manager m1 = new Manager("Shurik" , 700, new Date(60000), "3333");
		Manager m2 = new Manager("Turik" , 700, new Date(1000), "4444");
		
		m1.addBonus(1000);
		System.out.println(m1);
		
		m1.addEmptoTe(e1);
		m1.addEmptoTe(e2);
		
		System.out.println(e1.compareTo(e2));
		
		System.out.println(e1.equals(e2));
		e2 = (Employee)e1.clone();
		System.out.println(e1.equals(e2));
		
		
		Namecomp namecomp = new Namecomp();
		HireComp hirecomp = new HireComp();
		System.out.println(namecomp.compare(m2, m1));
		System.out.println(hirecomp.compare(m1, m2));
	}
}
