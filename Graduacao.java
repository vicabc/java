//Declaramos uma classe 

public class Graduacao{
    //definimos as variáveis que nos informarão sobre a graduaçao da pessoa
    String nome;
    int semestre;
    String sonho;
    String progresso;
    
    //Construimos as declarações da classe
    
    public Graduacao(String nome, int semestre, String sonho, String progresso){
        this.nome = nome;
        this.semestre = semestre;
        this.sonho = sonho; //sempre ou nunca
        this.progresso = progresso; //estou ou não estou
    }
    //criamos os métodos para obter cada informação
    
    public String getNome(){
        return nome;
    }
    public int getSemestre(){
        return semestre;
    }
    public String getSonho(){
        return sonho;
    }
    public String getProgresso(){
        return progresso;
    }
    
    // interação com o console
    
    public String toString(){
        return("Olá, eu curso " + this.getNome()+"."+ "\n Estou no semestre " + this.getSemestre() +"."+ "\n Eu " + this.getSonho() + " sonhei com este curso e " + this.getProgresso() + " fazendo progresso nesta jornada.");
    
    }
    public static void main(String[] args){
        Graduacao astrofisica = new Graduacao("Astrofísica",12,"sempre","estou");
        System.out.println(astrofisica.toString());
    }
}