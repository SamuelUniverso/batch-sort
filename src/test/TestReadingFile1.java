package test;

import org.junit.Test;

import br.univates.QuickSort;
import br.univates.SimpleReader;
import br.univates.SimpleWriter;

public class TestReadingFile1 
{
	@Test
	public void readFileSortAndWrite()
	{
		String path = "files/numbers-1.txt";
		int lines = countLines(path);

		int[] vector = new int[lines];

		/**
		 * Ler arquivo
		 */
		SimpleReader reader = new SimpleReader(path);
		String line = reader.readLine();
		int count = 0;
		while(line != null && count < vector.length)
		{
			vector[count] = Integer.valueOf(line);
			line = reader.readLine();
			count++;
		}
		reader.close();
		
		/**
		 * Ordernar vetor
		 */
		QuickSort sort = new QuickSort();
		sort.ordenarVetorDeInteiros(vector);
		//imprimirVetor(vector);
		
		
		/**
		 * Gravar arquivo
		 */
		SimpleWriter writer = new SimpleWriter("files/partial-1.txt");
		for(int i = 0; i < vector.length; i++)
		{
			writer.write(String.valueOf(vector[i]));
		}
		writer.close();
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

	@SuppressWarnings("unused")
	private static void imprimirVetor(int[] vetor) {
		System.out.println("Vetor...\n");
		for(int num : vetor) {
			System.out.print(num + ", ");
		}
	}
}
