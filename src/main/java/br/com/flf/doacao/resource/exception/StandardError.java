package br.com.flf.doacao.resource.exception;

import java.time.LocalDateTime;

public class StandardError {

	private Integer status;
	private String mensagem;
	private LocalDateTime dataHora;

	public StandardError(Integer status, String mensagem, LocalDateTime dataHora) {
		super();
		this.status = status;
		this.mensagem = mensagem;
		this.dataHora = dataHora;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

}
