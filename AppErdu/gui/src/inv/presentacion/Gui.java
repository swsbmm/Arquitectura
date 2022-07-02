package inv.presentacion;

import javax.swing.JOptionPane;

import api.org.cableado.IEntrada;
import api.org.cableado.ISalida;

public class Gui implements IEntrada, ISalida{

	@Override
	public void desplegarInformacion() {
		JOptionPane.showMessageDialog(null, "Desplegando informacion.");
		
	}

	@Override
	public void recibirInformacion() {
		JOptionPane.showMessageDialog(null, "Recibiendo informacion.");
		
	}

}
