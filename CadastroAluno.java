package colecoes;
import java.util.ArrayList;
public class CadastroAluno {
    private ArrayList <Aluno> listaAlunos = new ArrayList <Aluno>();

    public void adicionarAluno (Aluno a) {
        listaAlunos.add(a);
    }

    public void lerLista () {
        int tam = listaAlunos.size();
        for (int i = 0; i < tam; i++) {
            Aluno info = listaAlunos.get(i);
            String nome = info.getNome();
            String matricula = info.getMatricula();
            int idade = info.getIdade();
            String curso = info.getCurso();
            System.out.println(nome + " " + matricula + " " + idade + " " + curso);
        }
    }

}
