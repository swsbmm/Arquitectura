package inv.logica;

import javax.swing.JOptionPane;

import api.org.cableado.IGestionObjeto;

public class GestionObjeto implements IGestionObjeto{

	@Override
	public void reportarObjetoEncontrado() {
		JOptionPane.showMessageDialog(null, "Recibe datos y guarda un que he perdido un objeto perdido");
		
	}

	@Override
	public void reportarObjetoPerdido() {
		JOptionPane.showMessageDialog(null, "Recibiendo datos y guardando que encontre un objeto.");
		
	}

}
