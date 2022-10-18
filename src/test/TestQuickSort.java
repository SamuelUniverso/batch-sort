package test;

import org.junit.Test;

import br.univates.QuickSort;

public class TestQuickSort {
	
	@Test
	public void testQuick()
	{
		int vetor[] = {
		24, 66, 87, 43, 11, 27, 4, 2, 7, 8, 4, 5, 12, 53,
		42, 22, 1, 5, 9, 13, 16, 23, 13, 7, 55, 67, 92,
		22, 33, 27, 19
		};

		QuickSort sort = new QuickSort();
		sort.ordenarVetorDeInteiros(vetor);
		imprimirVetor(vetor);
	}

	private static void imprimirVetor(int[] vetor) {
		System.out.println("Vetor...\n");
		for(int num : vetor) {
			System.out.print(num + ", ");
		}
	}
}
