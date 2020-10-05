package questao2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        int loop = 0;
        
        ContaDeBanco conta = new ContaDeBanco();
        
        Scanner input = new Scanner(System.in);
        
        while (loop != 6) {
            conta.menu();
            loop = input.nextInt();
            
            switch (loop) {
                case 1:
                    conta.cadastro();
                case 2:
                    
                case 3:
                    
                case 4:
                    
                case 5:
                    
                default:
                    
            }
        }
    }
    
}
