package com.ralejo.datos;

import java.util.ArrayList;

public class Persona {

	public static void main(String[] args) {
		
		
		String[] arreglo = {"ronald","alejo"};
				
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("-----");
		
		for(String elemento : arreglo) {
			
			System.out.println(elemento);
		}
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("ronald");
		lista.add("alejo");
		lista.add("tuanama");
		
		lista.forEach(x -> System.out.println(x));
		
		
	}
}

//correo_pagweb@ micasita.com.pe
//web.correo.2020.






