package test;

import org.junit.Test;

import br.univates.QuickSort;
import br.univates.SimpleReader;
import br.univates.SimpleWriter;

public class TestMergeFile 
{
	@Test
	public void mergeToFile()
	{
		/**
		 * Generated sorted partials
		 */
		String file1 = "files/numbers-1.txt";
		String out1 = "files/partial-1.txt";

		String file2 = "files/numbers-2.txt";
		String out2 = "files/partial-2.txt";
		
		generatedSorteFile(file1, out1);
		generatedSorteFile(file2, out2);
	}

	public void generatedSorteFile(String path, String output)
	{
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
		
		/**
		 * Gravar arquivo
		 */
		SimpleWriter writer = new SimpleWriter(output);
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
