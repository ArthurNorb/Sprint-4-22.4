package br.com.terralab.ps.sig.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testSig {
	
	private InicialPage paginaDeInicio;
	
	@BeforeEach
	public void beforeEach() {
		this.paginaDeInicio = new InicialPage();
	}
	
	@AfterEach
	public void afterAll() {
		paginaDeInicio.fechar();
	}
	
	@Test
	public void deveria_AcharPontoNoMapa_SemBuscaAutomatica() {
		paginaDeInicio.preencheBuscaDeCidade("Ipatinga");
		paginaDeInicio.clicaBotaoPesquisar();
	}

}
