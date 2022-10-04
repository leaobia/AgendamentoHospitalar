package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {
    
    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc.
    */
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade e){ //CREATE
        especialidades.add(e);
    }
    
    public static ArrayList<Especialidade> getEspecialidades(){ //READ
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo){ //READ
        for (Especialidade e : especialidades){
            if(e.getCodigo() == codigo){
                return e;
            }
        }
        
        return null;
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada){ //UPDATE
        for (Especialidade e : especialidades){
            if(e.getCodigo() == especialidadeAtualizada.getCodigo()){
//               e = especialidadeAtualizada;
                //especialidades.remove(e);
                //especialidades.add(especialidadeAtualizada);
               especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
        
        
    }
    
    
    
    
    //instancia de um objeto
    public static void excluir(Integer codigo){ //DELETE
        for (Especialidade e : especialidades){
            if(e.getCodigo() == codigo){
                especialidades.remove(e);
                break;
            }
        }
    }
    
    
    
    
    
}
