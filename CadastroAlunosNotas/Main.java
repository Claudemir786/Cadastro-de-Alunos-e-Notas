package POO.exercicios.ArrayList.CadastroAlunosNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Aluno> alunos=new ArrayList<>();
        int escolha=0;

        do{
            System.out.println("------------MENU------------");
            System.out.println("digite 1 para cadastrar um aluno");
            System.out.println("2 para exibir as medias dos alunos");
            System.out.println("3 para identificar os alunos aprovados");
            System.out.println("4 para sair");
            while(!scanner.hasNextInt()){
                System.out.println("digite um NUMERO por favor");
                scanner.next();
            }
            escolha= scanner.nextInt();
            scanner.nextLine();
            switch (escolha){

                case 1:
                    Aluno cadastro=new Aluno();
                    System.out.println("digite o nome do aluno: ");
                    cadastro.setNome(scanner.nextLine());
                    System.out.println("digite a matricula deste aluno:");
                    cadastro.setMatricula(scanner.nextLine());
                    System.out.println("digite as notas deste aluno");
                    ArrayList<Double> notas=new ArrayList<>();
                    for(int i=0;i<3;i++){
                        System.out.println("nota: "+(i+1));
                        notas.add(scanner.nextDouble());
                        cadastro.setListaNotas((notas));
                    }
                    alunos.add(cadastro);
                    break;

                case 2:
                    for(Aluno tipo: alunos){
                        tipo.exibirMedia();
                    }
                    break;

                case 3:
                    for(Aluno tipo: alunos){
                        tipo.alunosAprovados();
                    }
                    break;
                case 4:
                    System.out.println("saindo...........");
                    break;

                default:
                    System.out.println("número não encontrado no menu");
                    System.out.println("----------------------------------------");


            }

        }while(escolha!=4);

    }
}
