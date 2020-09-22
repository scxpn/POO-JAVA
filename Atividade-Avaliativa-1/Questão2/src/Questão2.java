
import java.util.Scanner;
import questão2.Alunos;


public class Questão2 {

    public static void main(String[] args) {
        Alunos aluno = new Alunos();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua matricula: ");
        aluno.matricula = input.next();
        
        System.out.println("Digite seu primeiro nome: ");
        aluno.nome = input.next();
        
        System.out.println("A nota da AP1: ");
        aluno.ap1 = input.nextFloat();
        
        System.out.println("A nota da AP1: ");
        aluno.ap2 = input.nextFloat();
        
        System.out.println("A nota do seu trabalho: ");
        aluno.trabalho = input.nextFloat();
        
        aluno.exibir();
        aluno.media();
        aluno.passou();
        
        
        
    }
    
}
