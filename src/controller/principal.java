package controller;

public class principal {

	public static void main(String[] args) {
		int vet[]= {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78};
		int ini= 0;
		int fim= vet.length-1;
		String mostra="";
		
		controlador.quickSort(vet, ini, fim);
		
		for (int i=0;i<vet.length;i++) {
			mostra += vet[i]+" ";
		}
		
		System.out.println(mostra);
	}

}
