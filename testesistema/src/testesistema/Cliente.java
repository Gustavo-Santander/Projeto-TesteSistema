package testesistema;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	private boolean ativo;
	private int idContaCorrente;
	
	
	public Cliente() {
		super();
	}


	public Cliente(int id, String nome, String email, boolean ativo, int idContaCorrente) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ativo = ativo;
		this.idContaCorrente = idContaCorrente;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public int getIdContaCorrente() {
		return idContaCorrente;
	}


	public void setIdContaCorrente(int idContaCorrente) {
		this.idContaCorrente = idContaCorrente;
	}
	
	
	

}
