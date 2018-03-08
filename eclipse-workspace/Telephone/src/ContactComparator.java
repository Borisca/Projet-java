import java.util.Comparator;

public class ContactComparator implements Comparator<Contact>{

	public int compare(Contact contact1, Contact contact2) {
		if(!contact1.getNom().equals(contact2.getNom()))
			return contact1.getNom().compareTo(contact2.getNom());
		if(!contact1.getPrenom().equals(contact2.getPrenom()))
			return contact1.getNom().compareTo(contact2.getNom());
		return 0;
	}


}
