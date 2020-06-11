package clases;

import java.awt.Graphics;
import java.sql.Date;

import javax.swing.JFrame;

/**
 * 
 * Esta clase contiene la informaci�n de las citas
 *
 */
public class Citas {

	/**
	 * Motivo de la cita
	 */
	private String motivo;

	/**
	 * Hora y fecha a la que COMIENZA la cita
	 */
	private Date horaComienzo;

	/**
	 * Hora y fecha a la que TERMINA la cita
	 */
	private Date horaFin;

	/**
	 * D�a hora y a�o en la que se solicita la cita
	 */
	private Date fecha;

	/**
	 * C�digo identificador de la cita
	 */
	private String codigo;

	/**
	 * Personas implicadas en la cita
	 */
	private Persona[] persona;

	/**
	 * Constructor vac�o
	 */
	public Citas() {

	}

	/**
	 * 
	 * @param motivo
	 * @param horaComienzo
	 * @param horaFin
	 * @param codigo
	 * @param fecha
	 * @param persona
	 * @param myfecha      Constructor al cual se le pasan todos los par�metros
	 */
	public Citas(String motivo, Date horaComienzo, Date horaFin, Date fecha, String codigo, Persona[] persona) {
		this.motivo = motivo;
		this.horaComienzo = horaComienzo;
		this.horaFin = horaFin;
		this.fecha = fecha;
		this.codigo = codigo;
		this.persona = persona;
	}

	/**
	 * 
	 * @param copia Constructor de copia
	 */
	public Citas(Citas copia) {
		this.motivo = copia.motivo;
		this.horaComienzo = copia.horaComienzo;
		this.horaFin = copia.horaFin;
		this.fecha = copia.fecha;
		this.codigo = copia.codigo;
		this.persona = copia.persona;
	}

	// M�todos de la clase

	/**
	 * 
	 * M�todo para crear la frase (no est� terminado)
	 */
	public void crearCita(Citas citaACrear) {
//			citas cita = new citas(citaACrear);
	}

	/**
	 * 
	 * @param horaComienzo
	 * @param horaFin      Cambia la hora de comienzo y final de la cita por las
	 *                     pasadas por par�metro
	 */
	public void modificarCita(Date horaComienzo, Date horaFin) {
		this.setHoraComienzo(horaComienzo);
		this.setHoraFin(horaFin);
	}

	/**
	 * M�todo para ver la fecha en la que comienza la cita
	 * 
	 * @return String
	 */
	public String verFicha() {
		return this.getHoraComienzo().toString();
	}

	/**
	 * M�todo para ver el array de las personas (no est� terminado)
	 */
	public void verPersonas() {
//			for (personas personas : f.)
	}

	/**
	 * Devuelve el motivo de la cita
	 * 
	 * @return String
	 */
	public String verInformacion() {
		return this.getMotivo().toString();
	}

	/**
	 * Cambia las personas de la cita por las pasadas por par�metro
	 * 
	 * @param personaNueva
	 */
	public void cambiarPersonas(Persona[] personasNueva) {
		this.setPersona(personasNueva);
	}

	/**
	 * Cambia los datos (el motivo) de la cita por los pasados por par�metro
	 * 
	 * @param nuevoMotivo
	 */
	public void cambiarDatos(String nuevoMotivo) {
		this.setMotivo(nuevoMotivo);
	}

//		public void cambiarFecha(fecha fecha) {
//			this.setFecha(fecha);
//		}

	/**
	 * Borra las personas de la cita
	 */
	public void borrarPersonas() {
		this.setPersona(null);
	}

	// Getters y Setters
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Date getHoraComienzo() {
		return horaComienzo;
	}

	public void setHoraComienzo(Date horaComienzo) {
		this.horaComienzo = horaComienzo;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Persona getPersona() {
		return getPersona();
	}

	public void setPersona(Persona[] persona) {
		this.persona = persona;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFechas(Date fecha) {
		this.fecha = fecha;
	}

	
}