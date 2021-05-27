package modelo;



public class EspecieAnimais {
	
	private String nome="";
	private String familia="";
	private String habitat="";
	private String alimentacao="";
    private int    tempoVida=1;
      
    
    public EspecieAnimais() {
    }

    public EspecieAnimais(String nome, String familia, String habitat, String alimentacao, int tempoVida) {
        this.nome = nome;
        this.familia = familia;
        this.habitat = habitat;
        this.alimentacao = alimentacao;
        this.tempoVida = tempoVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getTempoVida() {
        return tempoVida;
    }

    public void setTempoVida(int tempoVida) {
        this.tempoVida = tempoVida;
    }

}
