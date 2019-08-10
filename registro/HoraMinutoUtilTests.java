package br.univille.poo.programacaoestruturada.registro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HoraMinutoUtilTests {
	
	@Test
	public void acrescentaMinutos() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Minutos devem ser",10,h.minuto);
	}
	
	@Test
	public void acrescentaMinutosHora() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 70);
		assertEquals("A hora esperada é...",11,h.hora);
		assertEquals("O minuto esperada é...",10,h.minuto);
		
	}
	
}