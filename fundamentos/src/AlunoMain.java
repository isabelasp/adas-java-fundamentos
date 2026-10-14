import modelos.Aluno;

public class AlunoMain {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.exibirDados();

        Aluno aluno2 = new Aluno("Harry");
        aluno2.exibirDados();

        Aluno aluno3 = new Aluno("Hermione",18);
        aluno3.exibirDados();
    }
    }
}
