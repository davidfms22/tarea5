/**
 * 
 */
package dm.uniandes.ASE;

/**
 * Esta clase contiene diferntes metetodos para realizar un integral con el
 * metodo numerico llamado regla de Simpson
 * 
 * @author David Martinez
 *
 */
public class Integral {

	// Atributos

	private Double lowerLimit;

	private Double upperLimit;

	private Double dof;

	// Contructor
	public Integral(Double upperLimit, Double dof) {
		this.lowerLimit = 0.0;
		this.upperLimit = upperLimit;
		this.dof = dof;
	}

	// Metodos
	/**
	 * Metodo para acceder al valor de la propiedad lowerLimit.
	 * 
	 * @return valor que tiene la porpiedad lowerLimit.
	 */
	public Double getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * Metodo para modificar el valor de la porpiedad lowerLimit.
	 * 
	 * @param lowerLimit:
	 *            El valor que que se desea asignar.
	 */
	public void setLowerLimit(Double lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	/**
	 * Metodo para acceder al valor de la propiedad upperLimit.
	 * 
	 * @return valor que tiene la porpiedad upperLimit.
	 */
	public Double getUpperLimit() {
		return upperLimit;
	}

	/**
	 * Metodo para modificar el valor de la porpiedad upperLimit.
	 * 
	 * @param upperLimit:
	 *            El valor que que se desea asignar.
	 */
	public void setUpperLimit(Double upperLimit) {
		this.upperLimit = upperLimit;
	}

	/**
	 * Metodo para acceder al valor de la propiedad dof.
	 * 
	 * @return valor que tiene la porpiedad dof.
	 */
	public Double getDof() {
		return dof;
	}

	/**
	 * Metodo para modificar el valor de la porpiedad dof.
	 * 
	 * @param dof:
	 *            El valor que que se desea asignar.
	 */
	public void setDof(Double dof) {
		this.dof = dof;
	}

	/**
	 * Metodo que calcula el valor de la integral.
	 * 
	 * @return valor de la integral.
	 */
	public Double calculate() {
		Double result = 0.0;
		return result;
	}

}
