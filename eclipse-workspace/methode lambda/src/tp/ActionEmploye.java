package tp;

public class ActionEmploye implements IActionEmploye{

	public void action(Employe employe) {

		employe.setSolde(employe.getSolde() / 2);

	}

}
