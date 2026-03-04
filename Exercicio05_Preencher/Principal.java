package Exercicio05_Preencher;

public class Principal {

    public static void main(String[] args) {

        // 1) Criar o objeto (aluno real)
        Aluno aluno = new Aluno();

        // 2) Preencher os atributos usando o ponto '.'
        // O ponto significa: "acesse algo que esta dentro do objeto"
        aluno.nome = "Joao Silva";
        aluno.idade = 18;

        // 3) Imprimir os dados
        System.out.println("Exercicio 05 - Preenchendo atributos depois que o objeto nasce.");
        System.out.println("Nome do Aluno: " + aluno.nome);
        System.out.println("Idade do Aluno: " + aluno.idade);

    }

}