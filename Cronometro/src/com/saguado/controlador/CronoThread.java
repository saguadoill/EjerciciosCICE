package com.saguado.controlador;

import com.saguado.vista.CronoView;

/**
 * Clase que gestiona la ejecucion del hilo
 * @author Sergio
 *
 */
public class CronoThread extends Thread {

	private CronoView main;
	private volatile boolean activo;
	private int milisegundos;
	private int segundos;
	private int minutos;
	private int horas;
		
	public CronoThread(CronoView main) {
		this.activo = true;
		this.main  = main;
	}


	/**
	 * Metodo que genera la cuenta del tiempo.
	 */
	@Override
	public void run() {

		while(true) {			
			while(activo) {
				try {
					Thread.sleep(10L);
					++milisegundos;
					if(milisegundos == 100) {
						++segundos;
						milisegundos = 0;
					}
					if(segundos == 60) {
						++minutos;
						segundos = 0;
					}
					if(minutos == 60) {
						++horas;
						minutos = 0;
					}
					if(horas == 24) {
						horas = 0;
					}
					
					main.setTiempo(tiempoFormateado());
					
				} catch (InterruptedException e) {
					System.out.println("Hilo finalizazo");
				} 
				
				
			}		
		}
		
	}
	
	/**
	 * Metodo que controla el inicio o pausa del hilo
	 * @param activo
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	/**
	 * Clase que formata el timpo para que salga en formato String. EN este caso lo he realizado con StringBuilder,
	 * pero igualmente se puede hacer con la clase String.
	 * @return un String con el texto formateado para encajar en el campo de texto.
	 */
	private String tiempoFormateado() {

		StringBuilder mili = new StringBuilder();
		StringBuilder seg = new StringBuilder();
		StringBuilder min = new StringBuilder();
		StringBuilder h = new StringBuilder();
		StringBuilder tiempo = new StringBuilder();

	
		if(milisegundos<10) {
			mili.append("+").append(milisegundos);
		}else {
			mili.append(milisegundos);
		}
		if(segundos<10) {
			seg.append("0").append(segundos);
		}else {
			seg.append(segundos);
		}
		if(minutos<10) {
			min.append("0").append(minutos);
		}else {
			min.append(minutos);
		}
		if(horas<10) {
			h.append("0").append(horas);
		}else {
			h.append(horas);
		}
		
		tiempo.append(h).append(":").append(min).append(":").append(seg).append(":").append(mili);
		
		return tiempo.toString();
	}	

}
