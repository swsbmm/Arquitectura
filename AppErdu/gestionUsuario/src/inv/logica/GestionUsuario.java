package inv.logica;

import javax.swing.JOptionPane;

import api.org.cableado.IGestionUsuario;

public class GestionUsuario implements IGestionUsuario{

	@Override
	public void registrarUsuario() {
		JOptionPane.showMessageDialog(null, "Recibiendo datos y guardando al nuevo usuario.");
		
	}

	@Override
	public void validarUsuario() {
		JOptionPane.showMessageDialog(null, "Recibiendo datos y validando usuario.");
		
	}

}
