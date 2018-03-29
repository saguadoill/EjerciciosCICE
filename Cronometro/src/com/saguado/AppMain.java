package com.saguado;

import java.awt.EventQueue;

import com.saguado.vista.CronoView;

/**
 * Clase que acrranca la aplicacion del cronometro. Codigo generado de forma automática por Netbeans.
 * (Probado solo dejando las dos lineas de codigo(linea 20 y 21) y funciona tambien)
 * @author Sergio
 * @version 0.1
 */
public class AppMain {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CronoView frame = new CronoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
