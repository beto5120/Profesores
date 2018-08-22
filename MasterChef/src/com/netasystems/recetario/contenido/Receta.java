package com.netasystems.recetario.contenido;

import java.util.ArrayList;
import java.util.List;

public class Receta {
	
	private List<String> ingredientes;
	private String nombrechef;
	private String nombreReceta;
	private String pasosReceta;
	
	
	public Receta(String nombrechef, String nombreReceta, List<String> ingredientes, String pasosReceta) {
		super();
		this.nombrechef = nombrechef;
		this.nombreReceta = nombreReceta;
		this.ingredientes = ingredientes;
		this.pasosReceta = pasosReceta;
	}

	public void MostrarIn () {
		
		for(String i : ingredientes) {
			
			System.out.println(i);
		}
		
	}
	
	public String getNombrechef() {
		return nombrechef;
	}
	public void setNombrechef(String nombrechef) {
		this.nombrechef = nombrechef;
	}
	public String getNombreReceta() {
		return nombreReceta;
	}
	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getPasosReceta() {
		return pasosReceta;
	}
	public void setPasosReceta(String pasosReceta) {
		this.pasosReceta = pasosReceta;
	}

	
	@Override
	public String toString() {
		return "Receta [nombrechef=" + nombrechef + ", nombreReceta=" + nombreReceta + ", ingredientes=" + ingredientes
				+ ", pasosReceta=" + pasosReceta + "]";
	}

	public static void add(Receta r1) {
		// TODO Auto-generated method stub
		
	}
	
	

}