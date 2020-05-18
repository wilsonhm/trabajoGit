/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
		
		Ejercicio ejercio = new Ejercicio( new MultiplicacionRusa() );
		
		System.out.println(ejercio.resolverMultiplicacion(3, 35));
	}

}
