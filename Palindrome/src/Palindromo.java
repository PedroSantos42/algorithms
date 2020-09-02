
public class Palindromo implements InterfacePalindromo {

	@Override
	public boolean isPalindromo(String param) throws Exception
	{
		if (param == null)
			throw new TextoNuloException();
		
		String texto = param.toLowerCase();
		boolean retorno = false;
		int a = 0, b = texto.length() - 1;
		
		while (a <= texto.length() && b >= 0)
		{
			char c = texto.charAt(a), d = texto.charAt(b);
			
			if (c == d)
				retorno = true;
			else
				retorno = false;
			b--;
			a++;
		}
		return retorno;
	}
}
