package objeto;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class RasgoObjeto {
	
	static NumberFormat numbertFormat = new DecimalFormat();
	
	private Long id;

	private Rasgo rasgo;
	
	private Double valor;
	
	/**
	 * Objeto al que pertenece
	 */
	private Objeto objeto;

	public RasgoObjeto() {
		super();
	}

	public RasgoObjeto(Rasgo rasgo, Double valor) {
		super();
		this.rasgo = rasgo;
		this.valor = valor;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}
	
	public Rasgo getRasgo() {
		return rasgo;
	}

	public void setRasgo(Rasgo rasgo) {
		this.rasgo = rasgo;
	}

	public boolean equals(Object obj){
		if (obj == null)
			return false;
		if (!(obj instanceof RasgoObjeto))
			return false;
		RasgoObjeto r = (RasgoObjeto) obj;
		
		if (this.getRasgo() != null)
			return this.getRasgo().equals(r.getRasgo());
		return false;
	}
	
	public String toString(){
		if (getRasgo() != null)
			return getRasgo().getNombre() + " : " + numbertFormat.format(getValor());
		return "";
	}
	
}