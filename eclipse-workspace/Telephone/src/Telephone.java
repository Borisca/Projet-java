import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Telephone implements InterfaceTel {

	private List<Contact> contacts = new ArrayList<>();
	private String marque, nomProprio, prenomProprio;
	private String numProprio;
	private Scanner scan = new Scanner(System.in);

	public Telephone(String marque, String nomProprio, String prenomProprio, String numProprio) {
		this.marque = marque;
		this.nomProprio = nomProprio;
		this.prenomProprio = prenomProprio;
		this.numProprio = numProprio;

	}

	public void affichageMenu() {
		int test;
		System.out.println(String.format(
				"Taper 1 pour ajouter un contact\n2 pour supprimer un contact\n3 pour afficher un contact\n4 pour afficher tous les contacts\n5 pour modifier un contact\npour quitter taper 6",
				this.nomProprio, this.prenomProprio));

		do {
			test = scan.nextInt();
		} while (test < 0 || (test) > 6);

		choixMenu(test);

	}

	private void choixMenu(int test) {
		String nom, prenom, numero, nouveauPrenom, nouveauNom;

		switch (test) {
		case 1:
			System.out.println("Entre un nom");
			nom = scan.next();
			System.out.println("Entre un prenom");
			prenom = scan.next();
			System.out.println("Entre un numero de telephone");
			numero = scan.next();
			this.stocker(nom, prenom, numero);
			break;
		case 2:
			System.out.println("Entre un nom");
			nom = scan.next();
			System.out.println("Entre un prenom");
			prenom = scan.next();
			this.supprimer(nom, prenom);
			break;
		case 3:
			System.out.println("Entre un nom");
			nom = scan.next();
			System.out.println("Entre un prenom");
			prenom = scan.next();
			this.interroger(nom, prenom);
			break;
		case 5:
			System.out.println("Entre un nom");
			nom = scan.next();
			System.out.println("Entre un prenom");
			prenom = scan.next();
			System.out.println("Entre un nouveau nom");
			nouveauNom = scan.next();
			System.out.println("Entre un nouveau prenom");
			nouveauPrenom = scan.next();
			System.out.println("Entre un numero de telephone");
			numero = scan.next();
			this.modifier(nom, prenom, nouveauNom, nouveauPrenom, numero);
			break;
		case 4:
			this.affichageContacts();
			break;

		case 6:
			System.exit(0);
			break;
		}

		affichageMenu();
	}

	@Override
	public boolean stocker(String nom, String prenom, String numero) {

		Iterator<Contact> it = contacts.iterator();
		while (it.hasNext()) {
			Contact c = it.next();
			if (c.getNom().equalsIgnoreCase(nom) && c.getPrenom().equalsIgnoreCase(prenom)) {
				System.out.println("Contact deja existant");
				return false;
			}
		}
		contacts.add(new Contact(nom, prenom, numero));
		return true;
	}

	@Override
	public boolean modifier(String ancienNom, String ancienPrenom, String nouveauNom, String nouveauPrenom,
			String nouveauNumero) {
		// TEST SI NOM EXISTE DEJA
		Iterator<Contact> it = contacts.iterator();
		while (it.hasNext()) {
			Contact c = it.next();
			if (c.getNom().equalsIgnoreCase(nouveauNom) && c.getPrenom().equalsIgnoreCase(nouveauPrenom)) {
				System.out.println("Contact deja existant");
				return false;
			}
		}

		// RECUPERATION DU CONTACT A CHANGER
		Iterator<Contact> it2 = contacts.iterator();

		while (it2.hasNext()) {
			Contact c = it2.next();
			if (c.getNom().equalsIgnoreCase(ancienNom) && c.getPrenom().equalsIgnoreCase(ancienPrenom)) {
				c.setNom(nouveauNom);
				c.setPrenom(nouveauPrenom);
				c.setNumeroTel(nouveauNumero);
				return true;

			}
		}

		return false;
	}

	@Override
	public boolean supprimer(String nom, String prenom) {

		Iterator<Contact> it = contacts.iterator();

		while (it.hasNext()) {
			Contact c = it.next();
			if (c.getNom().equalsIgnoreCase(nom) && c.getPrenom().equalsIgnoreCase(prenom)) {
				it.remove();
				return true;
			}
		}
		System.out.println("Contact non trouv�");
		return false;
	}

	@Override
	public Contact interroger(String nom, String prenom) {
		Iterator<Contact> it = contacts.iterator();

		while (it.hasNext()) {
			Contact c = it.next();
			if (c.getNom().equalsIgnoreCase(nom) && c.getNom().equalsIgnoreCase(prenom)) {
				return c;
			}
		}
		System.out.println("Contact non trouv�");
		return null;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getNomProprio() {
		return nomProprio;
	}

	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}

	public String getPrenomProprio() {
		return prenomProprio;
	}

	public void setPrenomProprio(String prenomProprio) {
		this.prenomProprio = prenomProprio;
	}

	public String getNumProprio() {
		return numProprio;
	}

	public void setNumProprio(String numProprio) {
		this.numProprio = numProprio;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public void affichageContacts() {
		Comparator<Contact> comparator = new ContactComparator();
		Collections.sort(this.contacts, comparator);

		for (Contact contact : contacts) {
			System.out.println(contact);
		}
		System.out.println("_________________________________");
	}

}
