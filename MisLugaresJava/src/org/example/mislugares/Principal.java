package org.example.mislugares;

public class Principal {
	public static void main(String[] args){
	/**	TipoLugar tipo = TipoLugar.BAR;
		Lugar z;
		z = new Lugar("Escuela Politécnica Superior de Gandía",
	             "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
	             tipo, 962849300, "http://www.epsg.upv.es",
	             "Uno de los mejores lugares para formarse.", 3);
		
		System.out.println(z);
		*/
		 for(Lugar l : Lugares.vectorLugares) {
             System.out.println(l);
       }
	}

}
