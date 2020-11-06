package ar.edu.unlam.proyectoprogramacion2020;

public class Usuario extends Persona{
	
	private String mail;
	private String contrase�a;
	private Integer Id=0;
	private Integer puntos=0;
	private Double saldo=0.0;
	
	public Usuario(String nombre, String apellido, String mail, String contrase�a, Integer id, Integer puntos, Double saldo) {
		super(nombre, apellido);
		this.mail = mail;
		this.contrase�a = contrase�a;
		Id = id;
		this.puntos = puntos;
		this.saldo = saldo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
