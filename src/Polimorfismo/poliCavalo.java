package Polimorfismo;

public class poliCavalo extends poliAnimal
{
	public poliCavalo()
	{
		super("Cavalo");
	}
	
	@Override
	public void som()
	{
		System.out.println("\nCavalo: POCOTOPOCOTO");
	}

}