package tp.formation;

import java.util.ArrayList;
import java.util.List;

public class Formation {

	private String intitule;

	private List<Stagiaire> stagiaire=new ArrayList<>();
	
	
	public Formation(String intitule) {
		super();
		this.intitule = intitule;
	}

	public Formation() {
		super();
	}
	
	public void addStagiaire(Stagiaire stagiaire) {
		
		this.stagiaire.add(stagiaire);
		
		
	}
	
	public void removeStagiaire(Stagiaire stagiaire) {
		
		this.stagiaire.remove(stagiaire);
		
	}
	
	public String displayStagiaire() {
		StringBuilder builder=new StringBuilder();
		for (Stagiaire stagiaire : this.stagiaire) {
			builder.append(stagiaire);
			builder.append("\n");
		}
	
		return builder.toString();
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@Override
	public String toString() {
		return "Formation [intitule=" + intitule + "]";
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
	
	
}
