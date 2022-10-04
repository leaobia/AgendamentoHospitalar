package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

    public static void main(String[] args) {

//	Especialidade especialidade = new Especialidade();
//	especialidade.setNome("Cardilogia");
//	especialidade.setDescricao("Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças"
//			+ " \nque acometem o coração bem como os outros componentes do sistema circulatório.");
//		
//	Especialidade especialidade2 = new Especialidade();
//	especialidade2.setNome("Otorrinolaringologia");
//	especialidade2.setDescricao("é o médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos \nouvidos, nariz, "
//			+ "garganta, laringe e pescoço.");
//		
//	JOptionPane.showMessageDialog(null, especialidade2.getNome());
//	System.out.println(especialidade.getNome());
//	System.out.println(especialidade.getDescricao());
//	System.out.println("");
//	System.out.println(especialidade2.getNome());
//	System.out.println(especialidade2.getDescricao());
        //Criar um objeto plano de saúde
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora("Unimed");
        planoDeSaude.setCategoria("Bronze");
        planoDeSaude.setNumero("651-257-845-78");
        planoDeSaude.setValidade(LocalDate.of(2023, 8, 20));  //    20/08/2023

        //Criar um objeto endereço
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Correia Gomes");
        endereco.setNumero("189");
        endereco.setCidade("Cotia");
        endereco.setBairro("Vila Mariana");
        endereco.setComplemento("casa 44");
        endereco.setEstado(Estados.SAO_PAULO);
        endereco.setCep("06902-180");

        //criar um objeto paciente
        Paciente paciente = new Paciente();
        paciente.setNome("Millena Ferreira");
        paciente.setDataNascimento(LocalDate.of(2003, 10, 29));
        paciente.setTelefone("96251-7902");
        paciente.setEndereco(endereco);
        paciente.setRg("48.151.623.42");
        paciente.setCpf("531-456-098-40");
        paciente.setPlanoDeSaude(planoDeSaude);

        //criar especialidades
        Especialidade especialidade1 = new Especialidade();
        especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("cuida do coração");

        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Pediatra");
        especialidade2.setDescricao("cuida das crianças");

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Clinico geral");
        especialidade3.setDescricao("cuida de tudo um pouquinho");

        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Fisioterapeuta");
        especialidade4.setDescricao("cuida dos musculos e ossos");

        //criar o Medico
        Medico medico1 = new Medico();
        medico1.setNome("Ana");
        medico1.setEmail("ana@gmail.com");
        medico1.setTelefone("11 9555-5555");
        medico1.setCrm("32154-463");
        Especialidade[] especialidade11 = {especialidade1, especialidade2, especialidade3};
        medico1.setEspecialidade(especialidade11);

        //exibir as Especialidades de cada Médico
        //nome do medico
        System.out.println("Nome do médico: " + medico1.getNome());
        //especialidade 1
        int contador = 0;
        while (contador < especialidade11.length) {
            System.out.println("Especialidade : " + (contador + 1) + " - " + medico1.getEspecialidade()[contador].getNome());
            contador++;
        }

//	System.out.println("Especialidade 1: " + medico1.getEspecialidade());
        //especialidade 2
//	System.out.println("Especialidade 2: " );
        //especialidade 3
//	System.out.println("Especialidade 3: " );
        System.out.println("==================================");

        //exibir os dados do Paciente
        //nome do paciente
        System.out.println("Nome do Paciente: " + paciente.getNome());
        //telefone do paciente
        System.out.println("Telefone do Paciente: " + paciente.getTelefone());
        //operadoura do plano de saúde
        System.out.println("Operadora do Plano de saúde: " + paciente.getPlanoDeSaude().getOperadora());
        //categoria do plano de saúde
        System.out.println("Categoria do Plano de saúde: " + paciente.getPlanoDeSaude().getCategoria());
        //cidade do paciente
        System.out.println("Cidade do Paciente: " + paciente.getEndereco().getCidade());
        //estado do paciente
        System.out.println("Estado do Paciente: " + paciente.getEndereco().getEstado());

        //fazer o agendamento do primeiro paciente 
        //com Cardiologista para o dia 27/09/2022
        //as 14h15
        Agenda agenda = new Agenda();
        agenda.setDataDaConsulta(LocalDate.of(2022, 9, 27));
        agenda.setHoraDaConsulta(LocalTime.of(14, 15));
        agenda.setPaciente(paciente);
        agenda.setMedico(medico1);
        agenda.setEspecialidade(especialidade1);

        //exibir os dados da agenda, com o nome do paciente,
        //nome do médico, nome da especialidade, data e hora
        // do agendamento e plano de saúde
        System.out.println("==============================");
        System.out.println("Agenda do(a) paciente: " + agenda.getPaciente().getNome());
        System.out.println("Especialidade: " + agenda.getEspecialidade().getNome());
        System.out.println("Médico: " + agenda.getMedico().getNome());
        System.out.println("Data: " + agenda.getDataDaConsulta());
        System.out.println("Hora: " + agenda.getHoraDaConsulta());

    }

}
