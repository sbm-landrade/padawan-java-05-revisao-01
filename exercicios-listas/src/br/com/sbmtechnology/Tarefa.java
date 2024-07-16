package br.com.sbmtechnology;


public class Tarefa {
	
	private String titulo;
	private String descricao;
	private int dataLimite;
	
	
	  public Tarefa(String titulo, String descricao, int dataLimite) {
	        this.setTitulo(titulo);
	        this.setDescricao(descricao);
	        this.setDataLimite(dataLimite);
	    }


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDataLimite() {
		return dataLimite;
	}


	public void setDataLimite(int dataLimite) {
		this.dataLimite = dataLimite;
	}

	 @Override
	 public String toString() {
		 return	   "titulo='" + titulo + '\'' +
	               ", descricao='" + descricao + '\'' +
	               ", dataLimite=" + dataLimite +
	                '}';
	    }
}
