package questao2;

import java.util.Scanner;

public class ContaDeBanco {
    private String nome, sobrenome, numeroConta;
    private int tipoConta;
    private float saldoCP,saldoCC; //CP = Conta Poupança and CC = Conta Corrente
    
    Scanner input = new Scanner(System.in);
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getNumeroConta(){
        return numeroConta;
    }
    
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public int getTipoConta(){
        return tipoConta;
    }
    
    public void setNumeroConta(int tipoConta){
        this.tipoConta = tipoConta;
    }
    
    public float getSaldoCP(){
        return saldoCP;
    }
    
    public void setSaldoCP(float saldoCP){
        this.saldoCP = saldoCP;
    }
    
    public float getSaldoCC(){
        return saldoCC;
    }
    
    public void setSaldoCC(float saldoCC){
        this.saldoCC = saldoCC;
    }
    
    
    public void space(){
        System.out.println("");
    }
    
    public void layout(){
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
   public void menu(){
       layout();
       System.out.println("JAVA Bank");
       layout();
       System.out.println("1 - Cadastrar Cliente");
       System.out.println("2 - Saque");
       System.out.println("3 - Deposito");
       System.out.println("4 - Consulta de Saldo");
       System.out.println("5 - Consulta de Dados");
       System.out.println("6 - Sair");
       System.out.println("");
       System.out.println("Escolha a opção desejada: ");
    }
   
   public void cadastro(){
       space();
       layout();
       System.out.println("Vamos começar sua conta na JAVA Bank.");
       space();
       System.out.println("Informe seu nome: ");
       setNome(input.next());
       space();
       layout();
       System.out.println("Para facilitarmos seu acesso, usamos o sistema em que o seu CPF é seu numero da conta.");
       space();
       System.out.println("Informe seu cpf: ");
       setNumeroConta(input.next());
       space();
       layout();
       System.out.println("Bem vindo a familia JAVA Bank, sua conta foi gerada com as seguintes informações:\nNome: "+ getNome() + getSobrenome() + "\nConta: "+ getNumeroConta());
       space();
       setSaldoCC(100.00f);
       setSaldoCP(50.00f);
       System.out.println("Seu saldo inicial na:\nConta Corrente: R$"+ getSaldoCC() +"\nConta Poupança: R$"+ getSaldoCP());
       space();
       space();
   }
   
   public void saque(){
       System.out.println("Informe o valor do saque: ");
   }
}
