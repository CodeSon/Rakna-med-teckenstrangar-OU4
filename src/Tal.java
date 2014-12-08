public class Tal {
	// Instans variabler
	int talInt;

	Tal(String talStr) 
	{

		talInt = new Integer(talStr);

	}

	public Tal(int i) 
	{
		this.talInt = i;
		
	}

	public Tal add(Tal tal2) 
	{

		Tal summa = new Tal(this.talInt + tal2.talInt);

		return summa;

	}
	
	public Tal differens(Tal tal2) 
	{

		Tal differens = new Tal(this.talInt - tal2.talInt);

		return differens;

	}

	public String toString() {
		return Integer.toString(this.talInt);

	}

}
