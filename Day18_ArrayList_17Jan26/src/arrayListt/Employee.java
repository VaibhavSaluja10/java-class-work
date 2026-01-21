package arrayListt;

import arrayListt.Employee;

public class Employee {
	String name;
	int id;
	
	Employee(){

}
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	// public boolean equals(Object o){
	// 	Student s = (Student)o;
	// 	return this.id == s.id && this.name.equals(s.name);
	// }
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student s = (Student)obj;
		return this.id == s.id && this.name.equals(s.name);
		
	}

	
}
