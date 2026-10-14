package modelos;

public class Aluno {

    //Declarar os atributos (ou propriedades)

    public String nome;
    public int idade;
    public String cpf;
    public String matricula;
    public boolean status;

    //Declarar os Contrutorres
    public Aluno(){

    }

    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Declarar método especifico da classe
    public void exibirDados(){
        System.out.println("************************************");
        System.out.println("            DADOS DO ALUNO          ");
        System.out.println("************************************");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matricula: " + this.matricula);

    }
}
