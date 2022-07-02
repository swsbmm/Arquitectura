package inv.logica;

import javax.swing.JOptionPane;

import api.org.cableado.IRecomendacion;

public class Recomendacion implements IRecomendacion{

	@Override
	public void listarObjeto() {
		JOptionPane.showMessageDialog(null,"Recomendando ultimos objetos perdidos");
		
	}

}
