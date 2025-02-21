package POO.exercicios.ArrayList.CadastroAlunosNotas;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String matricula;
    private ArrayList<Double> listaNotas;


    public Aluno(){
        this.nome="indefinido";
        this.matricula="indefinido";
        this.listaNotas=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public void exibirMedia() {

        double soma = 0;
        System.out.println("Aluno: " + nome);
        System.out.println("matricula " + matricula);
        if (!listaNotas.isEmpty()) { // Verifica se a lista não está vazia para evitar divisão por zero
            for (Double nota : listaNotas) {
                soma += nota;
            }
            double media = soma / listaNotas.size();
            System.out.println("media " + media);
        } else {
            System.out.println("Aluno não possui notas cadastradas.");
        }
    }
    public void alunosAprovados(){
       double soma=0;
       for(Double nota: listaNotas){
           soma+=nota;
       }
       double media= soma/ listaNotas.size();

        if(media>=7.0){
            System.out.println("Aluno: "+nome);
        }
    }
}
