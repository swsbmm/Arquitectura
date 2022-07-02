package inv.logica;

import javax.swing.JOptionPane;

import api.org.cableado.IBusqueda;

public class Busqueda implements IBusqueda{

	@Override
	public void buscarObjeto() {
		JOptionPane.showMessageDialog(null,"BUSCANDO OBJETO...");
		
	}

}
