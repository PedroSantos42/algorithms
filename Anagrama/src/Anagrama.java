
public class Anagrama implements InterfaceAnagrama {
/**
	@Override
	public boolean isAnagrama(String param1, String param2) throws Exception {
		
		boolean sair = true;
		int i = 0;
		
		while (i < param1.length() & sair == true) {
			char aux = param1.charAt(i);
			int c1 = 0;
			if (param1.length() != param2.length()) {
				sair = true;
			}
			for (int j = 0; j < param1.length(); j++) {
				if (param1.charAt(j) == aux)
					c1++;
			}
			int c2 = 0;
			for (int j = 0; j < param2.length(); j++) {
				if (param2.charAt(j) == aux)
					c2++;
			}
			if (c1 != c2)
				sair = false;
			i++;
		}
		return sair;
	}
*/
	@Override 
	public boolean isAnagrama(String param1, String param2) throws Exception
	{
		if (param1.trim().equals("") || param2.trim().equals("")) 
			throw new SemPalavraException();

		boolean sair = false, retorno = true; 
		int i = 0;

		while (i < param1.length() && sair == false) 
		{
			if (param1.length() != param2.length()) 
				throw new TamanhoDiferenteException();
			
			String s1 = param1.toLowerCase();
			String s2 = param2.toLowerCase();
			
			char aux = s1.charAt(i);
			int c1 = 0, c2 = 0;

			for (int j = 0; j < s1.length(); j++) 
				if (s1.charAt(j) == aux)
					c1++;

			for (int j = 0; j < s2.length(); j++) 
				if (s2.charAt(j) == aux)
					c2++;

			if (c1 != c2) 
			{
				retorno = false;
				sair = true;
			}
			i++;
		}
		
		return retorno;
	}
}