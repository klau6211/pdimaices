package procesamiento;

/**
 * Clase que contiene valores m�nimos y m�ximos de los componentes de un color HSV 
 * @author oscar
 *
 */
public class HSVRange {
	/**
	 * Valor H m�nimo
	 */
	private Float hMin;
	
	/**
	 * Valor H m�ximo
	 */
	private Float hMax;
	
	/**
	 * Valor S m�nimo
	 */
	private Float sMin;
	
	/**
	 * Valor S m�ximo
	 */
	private Float sMax;
	
	/**
	 * Valor V m�nimo
	 */
	private Float vMin;
	
	/**
	 * Valor V m�ximo
	 */
	private Float vMax;

	public Float getHMin() {
		return hMin;
	}

	public void setHMin(Float min) {
		hMin = min;
	}

	public Float getHMax() {
		return hMax;
	}

	public void setHMax(Float max) {
		hMax = max;
	}

	public Float getSMin() {
		return sMin;
	}

	public void setSMin(Float min) {
		sMin = min;
	}

	public Float getSMax() {
		return sMax;
	}

	public void setSMax(Float max) {
		sMax = max;
	}

	public Float getVMin() {
		return vMin;
	}

	public void setVMin(Float min) {
		vMin = min;
	}

	public Float getVMax() {
		return vMax;
	}

	public void setVMax(Float max) {
		vMax = max;
	}
	
	public boolean isEnRango(float h, float s, float v){
		if (((this.getHMin() != null && this.getHMin() <= h) || this.getHMin() == null)
				&& ((this.getHMax() != null && this.getHMax() >= h) || this.getHMax() == null)
				&& ((this.getSMin() != null && this.getSMin() <= s) || this.getSMin() == null)
				&& ((this.getSMax() != null && this.getSMax() >= s) || this.getSMax() == null)
				&& ((this.getVMin() != null && this.getVMin() <= v) || this.getVMin() == null)
				&& ((this.getVMax() != null && this.getVMax() >= v) || this.getVMax() == null)) {

			return true;
		} 
		return false;
	}
	
	public boolean isNulo(){
		if (getHMin() == null && getHMax() == null && getSMin() == null && getSMax() == null && getVMin() == null && getVMax() == null)
			return true;
		return false;
	}

}