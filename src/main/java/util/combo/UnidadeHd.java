package util.combo;

public class UnidadeHd {
	private int id;
	private String unidade;
	
	public UnidadeHd(int id, String unidade) {
		this.id = id;
		this.unidade = unidade;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	@Override
	public String toString() {
		return getUnidade();
	}
	
	
}
