package gtu.g12.dao;

import java.util.List;

import gtu.g12.model.Solicitud;

public interface SolicitudDAO {
	
	//No est� claro si los par�metro tiene que coger userId
	
	//usuario a�ade solicitud:
	public void addSol (String nombre,String apellido1,String apellido2,String tipoDoc,String codDoc,
			String nacionalidad,String domicilio,String nomUniv,String centroUniv,String correoUniv,
			String password,String categoria,int expediente, boolean monedero);
	
	//lista de solicitudes para aprobar:
	public List<Solicitud> getSolUnivAprob();
	public List<Solicitud> getSolBancoAprob();
	public List<Solicitud> getSolEstampAprob();
	
	//lista de solicitudes para notificar que esta impresa:
	public List<Solicitud> getSolUnivImp();
	public List<Solicitud> getSolBancoImp();
	public List<Solicitud> getSolEstampImp();
	
	//Obtener datos de la solicitud:
	public Solicitud getSol(long id);
	
	//cambiar estado solicitud:
	public void changeEstadoSol (long id, String estado);
	//a�adir datos bancanrios solicitud:
	public void addBan (long id, int cuentaBan, int pin, int cv2);
	//a�adir datos estampacion solicitud:
	public void addEstamp (long id, int numTarjeta);
	
	//administrador:
	public List<Solicitud> listSol();
	public void removeSol (long id);
}
