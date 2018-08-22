package com.netasystems.recetario.main;

import com.netasystems.recetario.contenido.Receta;
import java.util.ArrayList;
import java.util.List;


public class Recetario{

	public static void main(String[] args) {
		
		
		List<String> i1 = new ArrayList<String>();
		i1.add("\n\t-Ingredientes\n");
		i1.add("\t----------------\n");
		i1.add("\t-350 gr de Cereal 3\n");
		i1.add("\t-250 ml de leche\n");
		i1.add("\t-3 Fresas\n");
		
		List<String> i2 = new ArrayList<String>();
		i2.add("\n\t-Ingrediente 1\n");
		i2.add("\t-------------------\n");
		i2.add("\t-1 Huevo\n");
		i2.add("\t-2 pz de PAn Blanco\n");
		i2.add("\t-10 gr de azucar\n");
		i2.add("\t-2 pz de Pan Blanco\n");
		i2.add("\t-5 gr de Canela\n");
		
		List<Receta> recetas = new ArrayList<>();
		
		Receta r1 = new Receta ("Alberto Loredo","Cereal Supremo",i1,"\nPasos a seguir: ");
		Receta r2 = new Receta ("Jose Fuentes","Pan Frances",i2,"\nPasos a seguir: ");
		
		recetas.add(r1);
		recetas.add(r2);
		
		for(Object o : recetas) {
			
			System.out.println(o);
		}
		
		
		
		

	}

}