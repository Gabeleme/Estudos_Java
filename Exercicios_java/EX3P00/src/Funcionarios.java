
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class Funcionarios {
    private ArrayList<Funcionario> funcionarios;
    
    public Funcionarios() {
        funcionarios = new ArrayList<>();
    }
    
    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }
    
    public String listar() {
        String resultado = "";
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            resultado += f.imprimir() + "\n\n";
        }
        return resultado;
    }
    
    public Funcionario buscar(int codigo) {
        Funcionario resultado = new Funcionario();
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getCodigo() == codigo) {
                resultado = f;
                break;
            }
        }
        return resultado;
    }
}
