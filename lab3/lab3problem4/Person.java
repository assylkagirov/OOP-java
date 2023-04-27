package lab3problem4;

public abstract class Person {
	
	public String name;
	
	public Person(){
	}

	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Name of person is " + getName();
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		Person p = (Person)o;
		return this.name.equals(p.name);
	}
}
