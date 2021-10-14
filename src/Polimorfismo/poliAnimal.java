package Polimorfismo;

public abstract class poliAnimal 
{
	private String tipo;
	
	abstract public void som();
	
	public poliAnimal(String tipo)
	
	{
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}