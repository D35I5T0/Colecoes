package colecoes;
import java.util.Scanner;
import java.util.HashMap;
public class TesteMapaAluno {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String matricula;

        HashMap<String, Aluno> listaAlunos = new HashMap<String, Aluno>();
        
        matricula = "1";
        Aluno a1 = new Aluno("A", matricula, 20, "Adm");
        listaAlunos.put(matricula, a1);

        matricula = "2";
        Aluno a2 = new Aluno("B", matricula, 30, "CC");
        listaAlunos.put(matricula, a2);

        matricula = "3";
        Aluno a3 = new Aluno("C", matricula, 49, "Med");
        listaAlunos.put(matricula, a3);

        matricula = "4";
        Aluno a4 = new Aluno("D", matricula, 15, "Eng");
        listaAlunos.put(matricula, a4);

        matricula = "5";
        Aluno a5 = new Aluno("E", matricula, 10, "Fundamental");
        listaAlunos.put(matricula, a5);

        System.out.println("Informe a matrícula do aluno: ");
        matricula = sc.nextLine();

        if (listaAlunos.containsKey(matricula)) {
            System.out.println(listaAlunos.get(matricula));
        }
        else {
            System.out.println("Aluno não encontrado");
        }
        sc.close();
    }
}
