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
	
	
	public Tal multi(Tal tal2) 
	{

		Tal multi= new Tal(this.talInt * tal2.talInt);

		return multi;

	}
	
	public Tal dela(Tal tal2) 
	{

		Tal dela= new Tal(this.talInt / tal2.talInt);

		return dela;

	}

	public String toString() {
		return Integer.toString(this.talInt);

	}

}
