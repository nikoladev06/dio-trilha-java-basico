package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
		String[] candidatosSelecionados = selecaoCandidatos(candidatos);
		
		imprimirSelecionados(candidatosSelecionados);
		for(String candidato : candidatosSelecionados)
		{
			entrandoEmContato(candidato);
		}
		
		
	}

	static void entrandoEmContato(String candidato)
	{
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do
		{
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso.");
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + "º tentativa.");
		else
			System.out.println("Não conseguimos contato com o candidato " + candidato + ", número máximo de tentativas (" + tentativasRealizadas + ") realizadas.");
		
	}
	
	static boolean atender()
	{
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionados(String[] candidatosSelecionados)
	{
		System.out.println("Imprimindo a lista de candidatos selecionados, informando o índice do elemento...");
		
		for(String candidato : candidatosSelecionados)
		{
			System.out.println("O candidato selecionado foi " + candidato);
		}
		
	}
	
	static String[] selecaoCandidatos(String[] candidatos)
	{
		ArrayList<String> listaSelecionados = new ArrayList<>();
		int candidatoAtual = 0;
		int candidatosSelecionados = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
		{
			String candidato =  candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou o valor de R$" + salarioPretendido);
			if(salarioBase >= salarioPretendido)
			{
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				listaSelecionados.add(candidato);
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	
		return listaSelecionados.toArray(new String[0]);
	}
	
	static double valorPretendido()
	{
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido)
	{
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido)
		{
			System.out.println("Ligar para o candidato.");
		}
		else if (salarioBase == salarioPretendido)
		{
			System.out.println("Ligar para o candidato com contra proposta.");
		}
		else
		{
			System.out.println("Aguardando resultado dos demais candidatos.");
		}
		
	}
	
}
