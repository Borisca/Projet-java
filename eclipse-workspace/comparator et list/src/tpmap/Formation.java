package tpmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Formation {

	private String intitule;
	private ArrayList<Stagiaire>liste =new ArrayList<>();
	
	

	public Formation() {
		super();
	}

	public Formation(String intitule) {
		super();
		this.intitule = intitule;
	}

	
	public void add(Stagiaire ...stag) {
		
		for (Stagiaire stagiaire : stag) {
			liste.add(stagiaire);
		}
		
	}
	
	
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intitule == null) ? 0 : intitule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formation other = (Formation) obj;
		if (intitule == null) {
			if (other.intitule != null)
				return false;
		} else if (!intitule.equals(other.intitule))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return intitule + ": \n";
	}
	
	
	
	public ArrayList<Stagiaire> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Stagiaire> liste) {
		this.liste = liste;
	}
	
	public String display() {
		StringBuilder builder=new StringBuilder();
		
		builder.append(this);
		for (Stagiaire stagiaire : liste) {
			builder.append(stagiaire);
		}
		
		return builder.toString();
	}
}
