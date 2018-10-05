package src;

import java.util.ArrayList;

public class Empresa {
	private String nome_;
	private ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	private ArrayList<Projeto> listaProjetos = new ArrayList<Projeto>();
	
	public Empresa(String nome) {
		nome_ = nome;
	}

	public Object getNome() {
		return nome_;
	}

	public boolean temFuncionario(Funcionario funcionario) {
		return listaFuncionarios.contains(funcionario);
	}

	public void adicionaFuncionario(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);		
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void adicionaProjeto(Projeto projeto) {
		listaProjetos.add(projeto);
	}

	public boolean temProjeto(Projeto projeto) {
		return listaProjetos.contains(projeto);
	}

	public Object getListaProjetos() {
		return listaProjetos;
	}

}
