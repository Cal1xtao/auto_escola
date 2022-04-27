package auto_escola;
import java.util.Scanner;
public class auto_escola 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		//Colocando variáveis
		int psico, p1, exame,soma;
		//Perguntando se passou no teste psicologico
		System.out.printf("Se voce passou no teste psicologico digite 0, se nao passou digite 9:\n");
		psico=ler.nextInt(); 
		//Perguntando se passou na prova de legislação
		System.out.printf("Se voce passou na prova de legislação digite 1, se nao passou digite 9:\n");
		p1=ler.nextInt();
		//Perguntando se passou no exame prático
		System.out.printf("Se voce for deficiente fisico(a) digite 2, se nao for digite 9:\n");
		exame=ler.nextInt();
		soma=psico+p1+exame;
		if (soma==3)
			System.out.printf("Voce esta apto(a)");
		else
			System.out.printf("Voce nao esta apto(a)");
	}	
		
	}	

