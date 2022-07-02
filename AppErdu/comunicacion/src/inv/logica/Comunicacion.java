package inv.logica;

import javax.swing.JOptionPane;

import api.org.cableado.IComunicacion;

public class Comunicacion implements IComunicacion{

	@Override
	public void crearChatP2P() {
		JOptionPane.showMessageDialog(null, "Creando chat entre 2 personas.");
		
	}

}
