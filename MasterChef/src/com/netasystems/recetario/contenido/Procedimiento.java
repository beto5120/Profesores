package com.netasystems.recetario.contenido;

import java.util.ArrayList;
import java.util.List;

public class Procedimiento {
	
	public void Pasos(){
		
		List<String> p1 = new ArrayList<String>();
		p1.add("\n\tPaso 1\n");
		p1.add("\t---------------\n");
		p1.add("\tPasos\n");
		p1.add("\t-pasos\n");
		p1.add("\t-Pasos\n");
		
		List<String> p2 = new ArrayList<String>();
		p2.add("\n\t-Pasos\n");
		p2.add("\t-------------------\n");
		p2.add("\t-1 PAsos\n");
		p2.add("\t-2 PAsos\n");
		p2.add("\t-PAsos \n");
		p2.add("\t-PAsos\n");
		p2.add("\t-PAsos\n");
		
		List<Receta> pasos = new ArrayList<>();
		
		Receta r1 = new Receta ("","", p1 ,"\nPasos a seguir: ");
		Receta r2 = new Receta ("","", p2 ,"\nPasos a seguir: ");
		
		Receta.add(r1);
		Receta.add(r2);
		
		for(Object o : Receta) {
			
			System.out.println(o);
		}
		
	}

}
