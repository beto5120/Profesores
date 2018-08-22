
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Pruebas con obetos tipo profeso1r");
		Profesor ap = new ProfesorArtesPlasticas();
		Profesor ed = new ProfesorEduFisica();
		Profesor mat = new ProfesorMate();
		pruebaProfesor(ap);
		pruebaProfesor(ed);
		pruebaProfesor(mat);
		
		ProfesorArtesPlasticas ap01 = new ProfesorArtesPlasticas();
		pruebaProfesor(ap01);
		
		
	}
	 
	public static void pruebaProfesor(Profesor p) {
		String exposicion = p.exponer();
		double calificacion = p.evaluar();
		System.out.println("Expsicion: "+exposicion);
		System.out.println("Calificacion: "+calificacion);
	}

}
