package colecoes;
import java.util.Scanner;
public class TesteAlunos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        CadastroAluno lista = new CadastroAluno();

        Aluno a1 = new Aluno("A", "1", 0, null);
        Aluno a2 = new Aluno("B", "2", 0, null);
        Aluno a3 = new Aluno("C", "3", 0, null);
        Aluno a4 = new Aluno("D", "4", 0, null);
        Aluno a5 = new Aluno("E", "5", 0, null);
        Aluno a6 = new Aluno("F", "6", 0, null);
        Aluno a7 = new Aluno("G", "7", 0, null);
        Aluno a8 = new Aluno("H", "8", 0, null);
        Aluno a9 = new Aluno("I", "9", 0, null);
        Aluno a10 = new Aluno("J", "10", 0, null);

        lista.adicionarAluno(a1);
        lista.adicionarAluno(a2);
        lista.adicionarAluno(a3);
        lista.adicionarAluno(a4);
        lista.adicionarAluno(a5);
        lista.adicionarAluno(a6);
        lista.adicionarAluno(a7);
        lista.adicionarAluno(a8);
        lista.adicionarAluno(a9);
        lista.adicionarAluno(a10);

        lista.lerLista();
        sc.close();
    }
}
