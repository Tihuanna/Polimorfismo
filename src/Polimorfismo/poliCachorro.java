package Polimorfismo;

public class poliCachorro extends poliAnimal 
{
	public poliCachorro()
	{
		super("Cachorro");
	}
	@Override
	public void som()
	{
		System.out.println("Cachorro: AU AU AU");
	}

}