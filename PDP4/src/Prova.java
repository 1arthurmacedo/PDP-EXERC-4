import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prova {
    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List<Questao> questoes;

    public Prova(String titulo, String turma, String data, String versao, List<Questao> questoes) {
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = questoes;
    }

    public Prova copiar() {
        List<Questao> questoes_copia =  new ArrayList<>();
        questoes_copia.addAll(questoes);
        return new Prova(this.titulo, this.turma, this.data, this.versao, questoes_copia);
    }

    public int totalPontos() {
        int totalDePontos = 0;
        for (Questao questao : questoes) {
            totalDePontos += questao.getPontos();
        }
        return totalDePontos;
    }

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setTurma(String turma) {this.turma = turma;}
    public void setData(String data) {this.data = data;}
    public void setVersao(String versao) {this.versao = versao;}
    public void setQuestoes(List<Questao> questoes) {this.questoes = questoes;}

    public void substituirQuestao(int id, Questao nova) {
        for (int i = 0 ; i < questoes.size() ; i++) {
            if (questoes.get(i).getId() == id) {
                questoes.set(i, nova);
            }
        }
    }

    public void printResumo() {
        System.out.println("Título: " + titulo);
        System.out.println("Turma: " + turma);
        System.out.println("Data: " + data);
        System.out.println("Versão: " + versao);
        System.out.println("Total de pontos: " + totalPontos());
        for (Questao questao : questoes) {
            System.out.println(questao);
        }
    }

}
