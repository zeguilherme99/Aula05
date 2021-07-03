import java.util.Random;
import java.util.Scanner;

public class TeacherHelper {

//	public static final double horaAula = 17.50;
	public static void main(String[] args) {
		int opcao=0, numeroAulas, qtdeAlunos, i;
		double salarioBase, horaAtividade, descansoSemanalRemunerado, salario, notaAluno, mediaAlunos, horaAula;
		
		Random gerador = new Random();
		
		Scanner leitor = new Scanner(System.in);
		
		
		while(opcao!=4) {
			System.out.println("FERRAMENTA DE AUX�LIO AO PROFESSOR!");
			System.out.println("Selecione a op��o desejada:");
			System.out.println("1 - Calcular sal�rio");
			System.out.println("2 - Calcular m�dia de notas dos alunos");
			System.out.println("3 - Exibir a motiva��o do dia!");
			System.out.println("4 - Sair do menu");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				/*O sal�rio dos professores de escolas particulares em
				 * S�o Paulo � composto da seguinte forma 
				 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8*/
				
				System.out.println("Por favor, informe o valor da hora-aula praticado na institui��o.");
				horaAula = leitor.nextDouble();
				
				System.out.println("Para calcular seu sal�rio base precisamos saber quantas aulas semanais o professor tem na institui��o");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4.5 * horaAula;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O sal�rio do professor est� composto da seguinte forma:");
				System.out.println("Sal�rio base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Sal�rio total R$" + salario);
				
				break;
			case 2:
				System.out.println("Para calcularmos a m�dia das notas dos alunos � preciso saber, primeiramente, quantos alunos est�o na turma:");
				qtdeAlunos = leitor.nextInt();
				i = 0;
				mediaAlunos=0;
				while (i<qtdeAlunos) {
					System.out.println("Digite a nota do " + (i+1) + "� aluno:");
					notaAluno = leitor.nextDouble();
					mediaAlunos = mediaAlunos + notaAluno;
					i++;
				}
				mediaAlunos = mediaAlunos / qtdeAlunos;
				System.out.println("A m�dia de notas dos alunos dessa turma � " + mediaAlunos);
				
				break;
			case 3:
				
				switch(gerador.nextInt(7)) {
				case 0: 
					System.out.println("Mesmo de sexta-feira, voc� est� no g�s.");
					break;
				case 1:
					System.out.println("Voc� � um professor incr�vel!");
					break;
				case 2:
					System.out.println("Que o seu dia seja produtivo!");
					break;
				case 3:
					System.out.println("Que os seus alunos notem a paix�o com que voc� ensina!");
					break;
				case 4:
					System.out.println("Seu trabalho ajuda a fazer do mundo um lugar melhor!");
					break;
				case 5:
					System.out.println("Quem ensina com o cora��o cria um tesouro para a vida toda!");
					break;
				case 6:
					System.out.println("Obrigado por se colocar � disposi��o do saber!");
					break;
					
				}
				
				break;
			case 4:
				System.out.println("Encerrando o sistema...");
				break;
				
			}
		}
	
		leitor.close();

	}

}
