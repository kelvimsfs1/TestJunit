package br.univille.poo.programacaoestruturada.registro;

public class HoraMinutoUtil {

	public static void acrescentaMinutos(HoraMinuto h, int minutos, int dia) {

		h.minuto = h.minuto + minutos;

		if (h.minuto >= 60) {
			while (h.minuto >= 60) {
				h.hora += 1;
				h.minuto -= 60;
				
				
				if (h.hora >= 24) {
					h.dia += 1;
					h.hora -= 24;

					if (h.dia >= 30) {
						h.mes += 1;
						h.dia -= 30;

						if (h.mes >= 12) {
							h.ano += 1;
							h.mes -= 30;

						}

					}

				}
			}

		}

	}

}
