package entities;

import Application.AlunoClass;

import java.util.Locale;
import java.util.Scanner;

public class nota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AlunoClass aluno = new AlunoClass();

        System.out.print("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.print("Nota1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota3: ");
        aluno.nota3 = sc.nextDouble();

        if (aluno.media() < 60) {
            double faltaPass = 60 - aluno.media();
            System.out.printf("Final grade = %.2f%n", aluno.media());
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points", faltaPass);
        } else {
            System.out.printf("Final grade = %.2f%n", aluno.media());
            System.out.println("Pass");
        }

        sc.close();
        }
    }

