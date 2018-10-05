package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import src.Funcionario;
import src.Projeto;

public class FuncionarioTests {
	Funcionario rafael;
	
	@Before
	public void setup() {
		rafael = new Funcionario("Rafael");
	}
	
	@Test
	public void criaRafael() {
		assertEquals("Rafael", rafael.getNome());
	}
	
	@Test
	public void adicionaProjeto1() throws Exception {
		Projeto projeto1 = new Projeto("Projeto 1");
		rafael.adicionaProjeto(projeto1);
		assertTrue(rafael.temProjeto(projeto1));
	}
	
	@Test
	public void adicionaProjeto2() throws Exception {
		Projeto projeto2 = new Projeto("Projeto 2");
		rafael.adicionaProjeto(projeto2);
		assertTrue(rafael.temProjeto(projeto2));
	}
	
	@Test
	public void adicionasProjetos1e2() throws Exception {
		ArrayList<Projeto> projetos = new ArrayList<Projeto>();
		Projeto projeto1 = new Projeto("Projeto 1");
		rafael.adicionaProjeto(projeto1);
		projetos.add(projeto1);
		Projeto projeto2 = new Projeto("Projeto 2");
		rafael.adicionaProjeto(projeto2);
		projetos.add(projeto2);
		assertTrue(rafael.getListaProjetos().equals(projetos));
	}
	
	
}
