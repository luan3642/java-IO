package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(new File("contas.csv"));

		while (scan.hasNextLine()) {
			String linha = scan.nextLine();
			System.out.println(linha);
			
			String[] valores = linha.split(",");
			System.out.println(Arrays.toString(valores));
		}
	

		scan.close();

	}
}