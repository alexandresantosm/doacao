package br.com.flf.doacao.service.exception;

public class ObjectNotFoundException  extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String mensagem) {
		super(mensagem);
	}
	
	public ObjectNotFoundException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}
}
