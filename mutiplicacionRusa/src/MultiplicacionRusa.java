/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MultiplicacionRusa implements IEstrategia {
    public float resolverProblema(int multiplicador, int multiplicando) {
		
		float resultado = 0f;
		
		while((multiplicador != 0)) {
			
			if(multiplicador % 2 != 0) 
				resultado += multiplicando;
			
			multiplicador /= 2;
			multiplicando *= 2;
			
		}
		
		return resultado;
		
	}
	
}
