package questao2;

import java.util.Scanner;

public class ContaDeBanco {
    private String nome, sobrenome, numeroConta;
    private int tipoConta;
    private float saldoCP,saldoCC, deposito, saque; //CP = Conta Poupança and CC = Conta Corrente
    
    
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
    
    public void setTipoConta(int tipoConta){
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
    
   
   //Opções principais
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
       System.out.println("Informe seu sobrenome: ");
       setSobrenome(input.next());
       layout();
       System.out.println("Para facilitarmos seu acesso, usamos o sistema em que o seu CPF é seu numero da conta.");
       space();
       System.out.println("Informe seu cpf: ");
       setNumeroConta(input.next());
       space();
       layout();
       System.out.println("Bem vindo a familia JAVA Bank, sua conta foi gerada com as seguintes informações:\nNome: "+ getNome()+ " " + getSobrenome() + "\nConta: "+ getNumeroConta());
       space();
       setSaldoCC(100.00f);
       setSaldoCP(50.00f);
       System.out.println("Seu saldo inicial na:\nConta Corrente: R$"+ getSaldoCC() +"\nConta Poupança: R$"+ getSaldoCP());
       space();
       space();
   }
   
   
   
   public void saque(){
       space();
       layout();
       System.out.println("Contas disponiveis:\n1 - Conta Corrente\n2 - Conta Poupança\nEscolha de qual conta quer fazer o saque:");
       setTipoConta(input.nextInt());
       space();
       

       switch(getTipoConta()){
           case 1:
               System.out.println("Informe o valor do saque: R$");
               saque = input.nextFloat();
               space();
               if(getSaldoCC() > saque){

                   setSaldoCC(getSaldoCC() - saque);
                   System.out.println("Saque realizado com sucesso!");
                   System.out.println("Seu saldo na Conta Corrente é de R$"+getSaldoCC());
               }
               
               else{
                   System.out.println("Você não pode realizar o saque de R$"+ saque+"\n Não permitimos saldo negativo em conta");
                   
               }
               break;
               
           case 2:
               System.out.println("Informe o valor do saque: R$");
               saque = input.nextFloat();
               space();
               if(getSaldoCP() > saque){
                   setSaldoCC(getSaldoCP() - saque);
                   System.out.println("Saque realizado com sucesso!");
                   System.out.println("Seu saldo na Conta Poupança é de R$"+getSaldoCP());
               }
               
               else{
                   System.out.println("Você não pode realizar o saque de R$"+ saque+"\n Não permitimos saldo negativo em conta");
               }
               break;
       }
       space();
       space();
   }
   
   
   public void deposito(){
       space();
       layout();
       System.out.println("Contas disponiveis:\n1 - Conta Corrente\n2 - Conta Poupança\nEscolha em qual conta quer fazer o deposito:");
       setTipoConta(input.nextInt());
       space();
       
       switch(getTipoConta()){
           case 1:
               System.out.println("Informe o valor do deposito: R$");
               deposito = input.nextFloat();
               space();
               setSaldoCC(getSaldoCC() + deposito);
               System.out.println("Seu saldo agora é de R$" + getSaldoCC());
               break;
               
           case 2:
               System.out.println("Informe o valor do deposito: R$");
               deposito = input.nextFloat();
               space();
               setSaldoCP(getSaldoCP() + deposito);
               System.out.println("Seu saldo agora é de R$" + getSaldoCP());
               break;
       }
       
       space();
       space();
   }
   
   public void consultaS(){ //Consulta de Saldo
       space();
       layout();
       System.out.println("Contas disponiveis:\n1 - Conta Corrente\n2 - Conta Poupança\n3 - Todas as contas\nEscolha de qual conta você quer o saldo: ");
       setTipoConta(input.nextInt());
       space();
       layout();
       
       switch(getTipoConta()){
           case 1:
               System.out.println("Seu saldo atual é de: R$"+ getSaldoCC());
               break;
               
           case 2:
               System.out.println("Seu saldo atual é de: R$"+ getSaldoCP());
               break;
               
           case 3:
               System.out.println("Seu saldo atual na Conta Corrente é de: "+getSaldoCC());
               System.out.println("Seu saldo atual na Conta Corrente é de: "+getSaldoCP());
               break;
       }
       space();
       space();
   }
   
   public void consultaD(){ //Consulta de Dados
       layout();
       System.out.println("Olá "+ getNome() + "" + getSobrenome());
       System.out.println("Esses são seus dados bancários: ");
       System.out.println("Conta de número: "+ getNumeroConta());
       System.out.println("Você possui duas contas:\nConta Corrente com saldo de: R$"+ getSaldoCC() + "\nConta Corrente com saldo de: R$"+ getSaldoCP());
   }
}
