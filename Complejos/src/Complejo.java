 /** Clase que representa un n�mero complejo. */
 class Complejo {

  public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginario() {
		return imaginario;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

//declaraci�n de atributos
  private double real, imaginario;

  //declaraci�n de constructor
  public Complejo(double real, double imaginario) {
    this.real= real; 
    this.imaginario= imaginario;
  }

  //declaraci�n de m�todos
  /** Transcribe el complejo a String.
   * @returnun string con la parte entera y la imaginaria
   */

  public String toString() {
    return real + "+"+ imaginario + "i";
  }

  /** Suma al complejo de este objeto otro complejo.
   * @param v  el complejo que sumamos
   */

  public void suma(Complejo v) {
    real = real + v.real;
    imaginario = imaginario + v.imaginario;
  }
  public void suma(double re, double im) {
	  real = real + re;
	  imaginario = imaginario + im;
	}
	 
	public void suma(double re) {
	  real = real + re;
	}
}
