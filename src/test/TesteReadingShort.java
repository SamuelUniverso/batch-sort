package test;

import org.junit.Test;

import br.univates.SimpleReader;

public class TesteReadingShort 
{
	@Test
	public void readFileAndSort()
	{
		String path = "files/numbers.txt";
		int lines = countLines(path);

		String[] vector = new String[lines];

		SimpleReader reader = new SimpleReader(path);
		String line = reader.readLine();
		int count = 0;
		while(line != null && count < vector.length)
		{
			vector[count] = line;
			line = reader.readLine();
			count++;
		}
		reader.close();
	}
	
	private int countLines(String path) 
	{
		SimpleReader reader = new SimpleReader(path);

		String line = reader.readLine();
		int count = 0;
		while(line != null) {
			line = reader.readLine();
			count++;
		}
		reader.close();
		
		return count;
	}
}
