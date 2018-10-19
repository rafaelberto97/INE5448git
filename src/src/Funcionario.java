package src;

import java.util.ArrayList;

public class Funcionario {
	private String nome_;
	private ArrayList<Projeto> listaProjetos = new ArrayList<Projeto>();
	private ArrayList<Ocorrencia> listaOcorrencias = new ArrayList<Ocorrencia>();

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
	
	public boolean adicionaOcorrencia(Ocorrencia ocorrencia, Projeto projeto) {
		if (listaOcorrencias.size() < 10) {
			listaOcorrencias.add(ocorrencia);
			projeto.adicionaOcorrencia(ocorrencia);
			ocorrencia.setResponsavel(this);
			ocorrencia.setProjeto(projeto);
			return true;
		} 
		return false;
	}

	public boolean temOcorrencia(Ocorrencia ocorrencia) {
		return listaOcorrencias.contains(ocorrencia);
	}

	public ArrayList<Ocorrencia> getListaOcorrencias() {
		return listaOcorrencias;
	}

	public void concluiOcorrencia(Ocorrencia ocorrencia) {
		listaOcorrencias.remove(ocorrencia);
		ocorrencia.getProject().concluiOcorrencia(ocorrencia);
		ocorrencia.Conlui();
	}

	public void removeOcorrencia(Ocorrencia ocorrencia) {
		listaOcorrencias.remove(ocorrencia);
	}

	public void transfereOcorrencia(Ocorrencia ocorrencia) {
		listaOcorrencias.add(ocorrencia);
		ocorrencia.setResponsavel(this);
	}

}
