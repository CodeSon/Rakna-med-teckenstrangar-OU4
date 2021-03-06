import java.util.*; // Scanner
import static java.lang.System.out;


public class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar {

	public static void main(String[] args) {

		out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR");
		 out.println("---------------------------------------------------------");
		int	 []  svar =	new int[5];	
		System.out.println(svar[0]);
		// mata in tv� naturliga heltal
		 Scanner in = new Scanner (System.in);
		 out.println ("tv� naturliga heltal:");
		 String tal1 = in.next ();
		 String tal2 = in.next ();
		 out.println ();
		
		 // addera heltalen och visa resultatet
		 String summa = addera (tal1, tal2);
		 visa (tal1, tal2, summa, '+');
		 
		// subtrahera heltalen och visa resultatet
		 String diferens = subtrahera (tal1, tal2);
		 visa (tal1, tal2, diferens, '-');
		 
		 // multiplicera heltalen och visa resultatet
		 String multi = multiplicera (tal1, tal2);
		 visa (tal1, tal2, multi, '*');
		 
		 
		 // dividera heltalen och visa resultatet
		 String dela = dividera (tal1, tal2);
		 visa (tal1, tal2, dela, '/');
		 
		 }
		 
	
	// addera tar emot tv� naturliga heltal givna som teckenstr�ngar, och returnerar deras
		 // summa som en teckenstr�ng.
		 public static String addera (String tal1, String tal2){
			 
			 Tal talett = new Tal (tal1);
			 Tal taltva = new Tal (tal2);
			 Tal summa = talett.add(taltva);
			  return summa.toString();
			 
		 }
		 // subtrahera tar emot tv� naturliga heltal givna som teckenstr�ngar, och returnerar
		 // deras differens som en teckenstr�ng.
		 // Det f�rsta heltalet �r inte mindre �n det andra heltalet.
		 public static String subtrahera (String tal1, String tal2)
		 {
			 
			 Tal talett = new Tal (tal1);
			 Tal taltva = new Tal (tal2);
			 Tal differens = talett.differens(taltva);
			  return differens.toString();
			 
		 }
		// multiplicera tar emot tv� naturliga heltal givna som teckenstr�ngar, och returnerar deras
				 // summa som en teckenstr�ng.
				 public static String multiplicera (String tal1, String tal2){
					 
					 Tal talett = new Tal (tal1);
					 Tal taltva = new Tal (tal2);
					 Tal multi = talett.multi(taltva);
					  return multi.toString();
				 }
				// dividera tar emot tv� naturliga heltal givna som teckenstr�ngar, och returnerar deras
				 // summa som en teckenstr�ng.
				 public static String dividera (String tal1, String tal2){
					 
					 Tal talett = new Tal (tal1);
					 Tal taltva = new Tal (tal2);
					 Tal dela = talett.dela(taltva);
					  return dela.toString();
				 }
		 
		 // visa visar tv� givna naturliga heltal, och resultatet av en aritmetisk operation
		 // utf�rd i samband med hetalen
		public static void visa (String tal1, String tal2, String resultat, char operator)
		 {
		 // s�tt en l�mplig l�ngd p� heltalen och resultatet
		 int len1 = tal1.length ();
		 int len2 = tal2.length ();
		 int len = resultat.length ();
		 int maxLen = Math.max (Math.max (len1, len2), len);
		 tal1 = sattLen (tal1, maxLen - len1);
		 tal2 = sattLen (tal2, maxLen - len2);
		 resultat = sattLen (resultat, maxLen - len);
		 // visa heltalen och resultatet
		 out.println (" " + tal1);
		 out.println ("" + operator + " " + tal2);
		 for (int i = 0; i < maxLen + 2; i++)
		 out.print ("-");
		 out.println ();
		 out.println (" " + resultat + "\n");
		}
		 // sattLen l�gger till ett angivet antal mellanslag i b�rjan av en given str�ng
		public static String sattLen (String s, int antal)
		{
		 StringBuilder sb = new StringBuilder (s);
		 for (int i = 0; i < antal; i++)
		 sb.insert (0, " ");
		 return sb.toString ();
		}
		}

	


