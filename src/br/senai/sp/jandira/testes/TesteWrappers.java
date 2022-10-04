package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

    public static void main(String[] args) {

        int a = 5;

        Integer b = 5; //wrap = embrulhar, empacotar, envolver.

        Double x = 2.9;

        ArrayList<Especialidade> especialidades = new ArrayList<>();

        Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
        e1.setDescricao("coração bomba");

        Especialidade e2 = new Especialidade("Gastroenterologia");
//		e2.setNome("Gastroenterologia");
        e2.setDescricao("dor de barriga");

        especialidades.add(e1);
        especialidades.add(e2);

        Especialidade e3 = new Especialidade();
        e3.setNome("Fisioterapia");
        e3.setDescricao("dor nas costas");

        especialidades.add(e3);

        Especialidade e4 = new Especialidade();
        e4.setNome("Clinico Geral");
        e4.setDescricao("de tudo um pouquinho");

        //Especialidade[] especialidades = {e1, e2, e3, e4};
        Especialidade e5 = new Especialidade();
        e5.setNome("Pediatria");
        e5.setDescricao("cuida das criancinhas");

        //especialidades[4] = e5;
        especialidades.add(e4);
        especialidades.add(e5);

        System.out.println(especialidades.size());

        //ArrayList<int> notas = new ArrayList<>(); isso não funcionará porque ele é um tipo primitivo
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(50);
        notas.add(12);
        notas.add(25);
        notas.add(513);
        System.out.println(notas.size());

        notas.add(28);
        notas.add(9);
        System.out.println(notas.size());

        //queremos ver o nome da especialidade que está
        // na posição 3 do arraylist especialidades
        System.out.println(especialidades.get(3).getNome());

        //trocar o nome da especialidade que está
        // na posição 1 do arraylist especilidade
        //para "teste" , exibir logo em seguida
        especialidades.get(1).setNome("Teste");
        System.out.println(especialidades.get(1).getNome());

        Especialidade nova = especialidades.get(2);
        System.out.println(nova.getNome());

    }

}
