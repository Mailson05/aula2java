import enums.Cargo;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Professor();
        Pessoa a = new Aluno();

        System.out.println("-------------------------");
        System.out.println("CADASTRO DE PROFESSOR: ");
        System.out.println("Digite seu nome: ");
        p.setNome(sc.next());
        System.out.println("Digite sua idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Digite seu salário: ");
        ((Professor) p).setSalario(sc.nextDouble());
        System.out.println(p);

        System.out.println("------------------------");
        System.out.println("CADASTRO DE ALUNO: ");
        System.out.println("Digite seu nome: ");
        a.setNome(sc.next());
        System.out.println("Digite sua idade: ");
        a.setIdade(sc.nextInt());
        System.out.println("Digite sua matrícula: ");
        ((Aluno) a).setMat(sc.nextInt());
        System.out.println(a);
        System.out.println("------------------------");

        Disciplina d = new Disciplina();

        System.out.println("Digite o nome da disciplina: ");
        d.setNome(sc.next());

        d.cadastrarAluno((Aluno) a);
        d.ministrarDisciplina((Professor) p);

        System.out.println("Informações da disciplina: ");
        System.out.println(d);

        ((Professor) p).setCargo(Cargo.Professor);
        System.out.println(((Professor) p).getCargo());
        ((Professor) p).calcularSalario();
        ((Professor) p).aplicarBonus();
        System.out.println(p);

        sc.close();
    }
}