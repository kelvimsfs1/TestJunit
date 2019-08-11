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
		assertEquals("Minutos devem ser", 10, h.minuto);
	}

	@Test
	public void acrescentaMinutosHora() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 70);
		assertEquals("A hora esperada é...", 11, h.hora);
		assertEquals("O minuto esperada é...", 10, h.minuto);

	}

	@Test
	public void acrescentaMinutosHora() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 24;
		h.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 26);
		assertEquals("A quantidade de dias esperados é...", 1, h.hora);
		assertEquals("As horas restantes são...", 2, h.minuto);

	}

	@Test
	public void acrescentaMinutosHora() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 26;
		h.dia = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 26);
		assertEquals("A quantidade de dias esperados...", 1, h.dia);
		assertEquals("As horas restantes são...", 2, h.minuto);

	}

	@Test
	public void acrescentaMinutosHora() {
		HoraMinuto h = new HoraMinuto();
		h.dia = 35;
		h.mes = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 26);
		assertEquals("A quantidade de meses esperados...", 1, h.mes);
		assertEquals("Os dias restantes são...", 2, h.minuto);

	}

	@Test
	public void acrescentaMinutosHora() {
		HoraMinuto h = new HoraMinuto();
		h.meses = 13;
		h.anos = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 26);
		assertEquals("A quantidade de dias esperados...", 1, h.ano);
		assertEquals("Os meses restantes são...", 2, h.meses);

	}

}