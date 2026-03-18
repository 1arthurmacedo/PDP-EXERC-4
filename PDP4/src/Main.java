import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Questao Q1 = new Questao(1, "BlaBlaBla", 3);
        Questao Q2 = Q1.copiar();
        Q2.setId(2);
        Questao Q3 = Q1.copiar();
        Q3.setId(3);
        Q3.setPontos(4);

        List<Questao> questoes =  new ArrayList<>();
        questoes.add(Q1);
        questoes.add(Q2);
        questoes.add(Q3);

        Prova template = new Prova("Prova SQL - Template", "TEMPLATE", "2026-03-10", "BASE", questoes);
        template.printResumo();

        System.out.println("========================");

        Prova prova1 = template.copiar();
        prova1.setTitulo("Prova SQL");
        prova1.setTurma("2° INFO A");
        prova1.setData("2026-03-20");
        prova1.setVersao("V1");
        Questao Q2_versao2 = Q2.copiar();
        Q2_versao2.setEnunciado("PRAPRAPRA");
        prova1.substituirQuestao(2,Q2_versao2);
        prova1.printResumo();

        System.out.println("========================");

        Prova prova2 = template.copiar();
        prova2.setTitulo("Prova SQL");
        prova2.setTurma("2° INFO B");
        prova2.setData("2026-03-21");
        prova2.setVersao("V1");
        Questao Q3_versao2 = Q3.copiar();
        Q3_versao2.setPontos(5);
        prova2.substituirQuestao(2, Q3_versao2);
        prova2.printResumo();

        System.out.println("========================");

        Questao Q1_versao2 = Q1.copiar();
        Q1_versao2.setEnunciado("PRAPRAPRAPRA");
        prova1.substituirQuestao(1, Q1_versao2);

        template.printResumo();
        System.out.println("========================");
        prova1.printResumo();

    }
}