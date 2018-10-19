package src;

import java.util.UUID;

public class Ocorrencia {
	public enum Prioridades {
		Alta, Media, Baixa;
	}
	
	public enum Tipos {
		Tarefa, Bug, Melhoria;
	}
	
	public enum Status {
		Aberta, Concluida;
	}
	
	private String nome_;
	private UUID id_;
	private String resumo_;
	private Funcionario responsavel_;
	private Prioridades prioridade_;
	private Tipos tipo_;
	private Status status_;
	private Projeto projeto_;

	public Ocorrencia(String nome, Tipos tipo) {
		nome_ = nome;
		id_ = UUID.randomUUID();
		prioridade_ = Prioridades.Media;
		tipo_ = tipo;
	}

	public String getNome() {
		return nome_;
	}

	public UUID getID() {
		return id_;
	}

	public String getResumo() {
		return resumo_;
	}

	public void adicionaResumo(String resumo) {
		resumo_ = resumo;
	}

	public Funcionario getResposavel() {
		return responsavel_;
	}

	public void setResponsavel(Funcionario responsavel) {	
		if (responsavel.temOcorrencia(this)) {
			responsavel_ = responsavel;
		} else {
			responsavel_.removeOcorrencia(this);
			responsavel.transfereOcorrencia(this);
		}
	}
	
	public void setProjeto(Projeto projeto) {
		projeto_ = projeto;		
	}

	public void setPrioridade(Prioridades prioridade) {
		prioridade_ = prioridade;
	}

	public Prioridades getPrioridade() {
		return prioridade_;
	}
	
	public Tipos getTipo() {
		return tipo_;
	}
	
	public void Conlui() {
		status_ = Status.Concluida;
	}

	public Projeto getProject() {
		return projeto_;
	}
}
