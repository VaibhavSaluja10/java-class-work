package hasARelationShipWithEarlyInstantiation;

public class Car2 {
	private Tyre2[] tyres = {new Tyre2("MRF"),
			new Tyre2("CEAT"),
			new Tyre2("MRF2"),
			new Tyre2("CEAT2")};

	
	public Tyre2[] getTyres() {
		return tyres;
	}
	
	public void setTyres(Tyre2[] tyres) {
		this.tyres=tyres;
	}

}
