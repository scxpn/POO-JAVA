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
                    break;
                case 2:
                    conta.saque();
                    break;
                case 3:
                    conta.deposito();
                    break;
                case 4:
                    conta.consultaS();
                    break;
                case 5:
                    conta.consultaD();
                    break;
                case 6:
                    loop = 6;
                    break;

            }
        }
    }
    
}
