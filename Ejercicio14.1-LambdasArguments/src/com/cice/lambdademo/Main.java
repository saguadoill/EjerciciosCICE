package com.cice.lambdademo;

public class Main {

	public static void main(String[] args) {

		String cadena = "Esto Es Una Cadena De Caracteres";
		StringUtil str = new StringUtil();
		String output = "";

		System.out.println("ORIGINAL:");
		System.out.println(cadena);
		System.out.println();

		// Invertir la cadena----------------------------------
		System.out.println("INVERTIDA");
		output = str.changeStr(s -> {
			char[] cadenaChar = cadena.toCharArray();
			StringBuilder cadenaAlreves = new StringBuilder();
			for (int i = cadenaChar.length - 1; i >= 0; i--) {
				cadenaAlreves.append(cadenaChar[i]);
			}
			return cadenaAlreves.toString();
		}, cadena);
		System.out.println(output);
		System.out.println();

		// Invertir matyusculas y minusculas------------------------
		System.out.println("CAMBIO MAY/MIN");
		output = str.changeStr(s -> {
			StringBuilder minMay = new StringBuilder();
			for (char c : cadena.toCharArray()) {
				if (Character.toString(c).equals(Character.toString(c).toUpperCase())) {
					minMay.append(Character.toString(c).toLowerCase());
				} else {
					minMay.append(Character.toString(c).toUpperCase());
				}
			}
			return minMay.toString();
		}, cadena);
		System.out.println(output);
		System.out.println();

		// Sustituir espacios en blanco por "_" --------------------
		System.out.println("SUSTITUCION \" \" por \"_\" ");
		output = str.changeStr(s -> s.replace(" ", "_"), cadena);																																																
		System.out.println(output);

	}

}
