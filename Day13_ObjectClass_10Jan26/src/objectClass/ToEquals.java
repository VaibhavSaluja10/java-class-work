package objectClass;


public class ToEquals {
	String name;
	int id;

	ToEquals(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public boolean equals(Object o) {
		ToEquals s = (ToEquals) o;
		return this.name.equals(s.name) && this.id == s.id;
			
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
}
