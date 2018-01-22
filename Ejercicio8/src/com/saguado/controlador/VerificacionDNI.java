package com.saguado.controlador;

public class VerificacionDNI {
	
	
	public String verificarLonguitudDNI(String dni) {
		
		StringBuilder dniEntero = new StringBuilder(dni);
		
		//Comprobamos tamaño maximo del DNI
		if(dniEntero.length()< 10) {
			//En caso de no ser 9, rellenar con ceros a la izquierda
			if(dniEntero.length() != 9) {
				while(dniEntero.length()<9) {
					dniEntero.insert(0, '0');
				}
				return dniEntero.toString();
			}			
			return dniEntero.toString();
		}else {
			return dniEntero.toString();
		}
		
	}
	
	//Sacado de la propia Wikipedia al buscar DNI
	public boolean isNifNumValid(String nif){
		String [] arrayLetrasNIF ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		nif = nif.toUpperCase();
        //Si el largo del NIF es diferente a 9, acaba el método.
        if (nif.length()!=9){
            return false;
        }
            //Posición inicial: 0 (primero en la cadena de texto). Longitud: cadena de texto menos última posición. Así obtenemos solo el número.
        String numeroNIF = nif.substring(0, nif.length()-1);
            //Para obtener la letra, nos situamos en la penúltima posición y contamos 1 de largo
        String letraNIF= nif.substring(nif.length()-1);
		try {
			int i = Integer.parseInt(numeroNIF) % 23;
//			int i = n % 23;
			if (letraNIF.equals(arrayLetrasNIF[i])) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
