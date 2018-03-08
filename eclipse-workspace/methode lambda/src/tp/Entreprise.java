package tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Entreprise {

	private String nom;
	private List<Employe> employes = new ArrayList<>();

	public Entreprise(String nom) {
		super();
		this.nom = nom;
	}

	public void addEmploye(Employe... emp) {
		Collections.addAll(employes, emp);
	}

	public void doublerSolde() {

		for (Employe employe : employes) {
			employe.setSolde(employe.getSolde() * 2);
		}
	}
	
	public void parcourir(IActionEmploye t) {
		for (Employe employe : employes) {
			t.action(employe);
		}
	}
	
	public static void doubleSalaire(Employe e) {
		e.setSolde(e.getSolde()*2);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", employes=" + employes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Entreprise other = (Entreprise) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

}
