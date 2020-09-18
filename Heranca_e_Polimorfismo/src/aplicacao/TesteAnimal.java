package aplicacao;

import java.util.Scanner;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		Cachorro cachorro = new Cachorro("Belinha" , 7 , "Latido", "Corre");
		Cavalo cavalo = new Cavalo ("Pé de Pano", 5 , "cavalga", "Trota");
		Preguica preguica = new Preguica ("Sid" , 15 , "shshshs", "Sobe me Árvore");
		
	cachorro.exibir();
	cavalo.exibir();
	preguica.exibir();
	
	leia.close();
		
	}

}
