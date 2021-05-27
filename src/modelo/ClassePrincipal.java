package modelo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ClassePrincipal {
	
	
	
	private static Scanner ler_digitos;

	public static void main(String[] args) {
		 
		     //estrutura de dados em uso set
	        Set<EspecieAnimais> lista_animais = new HashSet<>();
	        
	        ler_digitos = new Scanner(System.in);
	        
	        int quantidade_Animais_Desejada=1;
	        boolean verfica_duplic = false;
	        
	        System.out.println("Quantos animais deseja inserir?");
	        quantidade_Animais_Desejada = ler_digitos.nextInt();
	        
	        for(int i = 0; i < quantidade_Animais_Desejada; i++){
	        	    
	                System.out.println("Nome do animal?");
	                String nome = ler_digitos.next();
	                   
	                System.out.println("Familia do animal?");
	                String familia = ler_digitos.next();
	                
	                System.out.println("Habitat do animal?");
	                String habitat = ler_digitos.next();
	                
	                System.out.println("Alimentação do animal?");
	                String alimentacao = ler_digitos.next();
	                
	                System.out.println("Tempo de vida do animal?");
	                int tempo_vida = ler_digitos.nextInt();
	                
	                for(EspecieAnimais ea : lista_animais){
	                    if(ea.getNome().equalsIgnoreCase(nome) ||
	                       ea.getFamilia().equalsIgnoreCase(familia) ||
	                       ea.getHabitat().equalsIgnoreCase(habitat) ||
	                       ea.getAlimentacao().equalsIgnoreCase(alimentacao) ||
	                       ea.getTempoVida() == tempo_vida
	                       ){
	                        verfica_duplic = true;
	                    }                    
	                }
	                
	                if(verfica_duplic == false){
	                    lista_animais.add(new EspecieAnimais(nome, familia, habitat, alimentacao, tempo_vida));
	                }
	        }
	        System.out.println("Nome....Familia...alimentaçaõ...Habitate...Tempo de vida ?");
	        for(EspecieAnimais ea : lista_animais){
	            System.out.println(ea.getNome() + " \t" + 
	                               ea.getFamilia() + "\t " + 
	                               ea.getAlimentacao() + "\t \t" + 
	                               ea.getHabitat() + "\t \t" + 
	                               ea.getTempoVida() + "\t ");
	        }
 

	    }

}
