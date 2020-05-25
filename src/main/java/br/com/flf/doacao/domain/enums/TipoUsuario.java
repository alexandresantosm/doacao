package br.com.flf.doacao.domain.enums;

public enum TipoUsuario {

	ADMIN(1, "Administrador"),
	DOADOR(2, "Doador"),
	POSTO_DOACAO(3, "Posto de doação");

	private int codigo;
	private String descricao;

	private TipoUsuario(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoUsuario toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		
		for (TipoUsuario tipoUsuario : TipoUsuario.values()) {
			if (codigo.equals(tipoUsuario.getCodigo())) {
				return tipoUsuario;
			}
		}
		throw new IllegalArgumentException("Código para tipo de usuário inválido. Código: " + codigo);
	}
}
