package br.univille.poo.programacaoestruturada.registro;

public class HoraMinutoUtil {	

	public static void acrescentaMinutos(HoraMinuto h, int minutos) {
		
		h.minuto = h.minuto + minutos;
		
		if (h.minuto >= 60) {
			while (h.minuto >=60) {
				h.hora+= 1;
				h.minuto-= 60;	
			}
						
			
		}
		
	}

}

