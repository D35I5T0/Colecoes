package colecoes;
import java.util.HashSet;
import java.util.Scanner;
public class TesteHashSetCPF {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String cpf;
        HashSet <String> cpfs = new HashSet <String>();
        
        System.out.println("Informe os CPFs: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("CPF de n°: " + (i + 1));
            cpf = sc.nextLine();
            cpfs.add(cpf);
        }

        System.out.println("Digite mais um CPF: ");
        cpf = sc.nextLine();
        cpfs.add(cpf);
        
        System.out.println("Lista CPFs " + cpfs);
    }
}
