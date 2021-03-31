package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(new File("contas.csv"));

		while (scan.hasNextLine()) {
			String linha = scan.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int  valor2 = linhaScanner.nextInt();
			int  valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
//			String.format(valor4, args);
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5 );
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
	

		scan.close();

	}
}
