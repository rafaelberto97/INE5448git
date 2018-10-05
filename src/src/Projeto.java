package src;

import java.util.ArrayList;

public class Projeto {
	private String nome_;
	private ArrayList<Ocorrencia> listaOcorrencias = new ArrayList<Ocorrencia>();

	public Projeto(String nome) {
		nome_ = nome;
	}

	public String getNome() {
		return nome_;
	}

	public void adicionaOcorrencia(Ocorrencia ocorrencia) {
		listaOcorrencias.add(ocorrencia);
	}

	public boolean temOcorrencia(Ocorrencia ocorrencia) {
		return listaOcorrencias.contains(ocorrencia);
	}

	public ArrayList<Ocorrencia> getListaOcorrencias() {
		return listaOcorrencias;
	}

}
