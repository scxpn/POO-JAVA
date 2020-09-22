package questão2;

public class Alunos {
    public String nome, resultado, matricula;
    public float ap1, ap2, trabalho, medP;
    
    
    public void media(){
        medP = ((ap1*3) + (ap2*3) + (trabalho * 4))/(10);
        System.out.println("Sua média foi de: " + medP);
    }
    
    public void passou(){
        if(medP >= 6){
            System.out.println("Você foi provado, não precisará da prova final.");
        }
        else
            System.out.println("Você vai precisar fazer a prova final.");
    }
    
    public void exibir(){
        System.out.println("");
        System.out.println("O aluno " + nome);
        System.out.println("Com a matricula Nº " + matricula);
        
    }
}


