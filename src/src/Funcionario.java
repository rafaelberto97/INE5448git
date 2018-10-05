package src;

import java.util.ArrayList;

public class Funcionario {
	private String nome_;
	private ArrayList<Projeto> listaProjetos = new ArrayList<Projeto>();

	public Funcionario(String nome) {
		nome_ = nome;
	}

	public String getNome() {
		return nome_;
	}

	public void adicionaProjeto(Projeto projeto) {
		listaProjetos.add(projeto);
	}

	public boolean temProjeto(Projeto projeto) {
		return listaProjetos.contains(projeto);
	}

	public ArrayList<Projeto> getListaProjetos() {
		return listaProjetos;
	}

}
