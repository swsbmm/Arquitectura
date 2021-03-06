import java.security.DomainCombiner;

import javax.swing.JOptionPane;

import api.org.cableado.IBusqueda;
import api.org.cableado.IComunicacion;
import api.org.cableado.IEntrada;
import api.org.cableado.IGestionObjeto;
import api.org.cableado.IGestionUsuario;
import api.org.cableado.IModerador;
import api.org.cableado.IRecomendacion;
import api.org.cableado.ISalida;
import api.org.utilidades.Cargador;

public class AppErdu implements IModerador {

	@Override
	public void moderar() {
		// CARGADOR DE COMPONENTES FRONT
		Cargador crgFront = new Cargador("front");

		// MONTANDO LOS COMPONENTES

		// COMPONENTE GUI SALIDA DE INFORMACION
		try {
			Class cls = crgFront.getClase(IEntrada.class.getName());
			ISalida inv = (ISalida) cls.newInstance();
			inv.desplegarInformacion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// CARGANDO COMPONENTES BACK
		Cargador crgBack = new Cargador("back");

		// COMPONENTE USUARIO

		try {
			Class cls = crgBack.getClase(IGestionUsuario.class.getName());
			IGestionUsuario inv = (IGestionUsuario) cls.newInstance();
			inv.registrarUsuario();
			inv.validarUsuario();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE DE GUI
		try {
			Class cls = crgFront.getClase(IEntrada.class.getName());
			IEntrada inv = (IEntrada) cls.newInstance();
			inv.recibirInformacion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE RECOMENDACION.
		try {
			Class cls = crgBack.getClase(IRecomendacion.class.getName());
			IRecomendacion inv = (IRecomendacion) cls.newInstance();
			inv.listarObjeto();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE BUSQUEDA
		try {
			Class cls = crgBack.getClase(IBusqueda.class.getName());
			IBusqueda inv = (IBusqueda) cls.newInstance();
			inv.buscarObjeto();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE DE GUI
		try {
			Class cls = crgFront.getClase(IEntrada.class.getName());
			IEntrada inv = (IEntrada) cls.newInstance();
			inv.recibirInformacion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE OBJETO

		try {
			Class cls = crgBack.getClase(IGestionObjeto.class.getName());
			IGestionObjeto inv = (IGestionObjeto) cls.newInstance();
			inv.reportarObjetoPerdido();
			inv.reportarObjetoEncontrado();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE DE CHAT

		try {
			Class cls = crgBack.getClase(IComunicacion.class.getName());
			IComunicacion inv = (IComunicacion) cls.newInstance();
			inv.crearChatP2P();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

		// COMPONENTE DE GUI
		try {
			Class cls = crgFront.getClase(IEntrada.class.getName());
			IEntrada inv = (IEntrada) cls.newInstance();
			inv.recibirInformacion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}
		// COMPONENTE GUI SALIDA DE INFORMACION
		try {
			Class cls = crgFront.getClase(IEntrada.class.getName());
			ISalida inv = (ISalida) cls.newInstance();
			inv.desplegarInformacion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se encuentra el componente SALIDA.");
		}

	}

	public static void main(String[] args) {
		new AppErdu().moderar();
	}

}
