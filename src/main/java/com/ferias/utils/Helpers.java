package com.ferias.utils;

public class Helpers {

	public void esperaSelenium(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void carguesAutoIT(String ruta) {
		try {
			Runtime.getRuntime().exec(ruta);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
