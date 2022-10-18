package test;

import org.junit.Test;

import br.univates.SimpleReader;

public class TestReading 
{
	@Test
	public void loadFile()
	{
		SimpleReader reader = new SimpleReader("files/numbers-1.txt");
		String line = reader.readLine();
		while(line != null) {
			line = reader.readLine();
			System.out.println(line);
		}
	}
}
