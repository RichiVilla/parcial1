package edu.eci.cvds.tdd;

public class validarEdad {
	public boolean menorEdad(int edad) throws Exception {
		if (edad < 0){
			throw new Exception("Edad Inválida!");
		}
		if (edad < 18){
			return true;
		}
		if (edad >= 18){
			return false;
		}
		return true;
	}	
}
