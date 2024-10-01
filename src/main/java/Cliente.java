/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaac
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String uf;
    private String telefone;
    private String cpf;
    private String email;
    
    //construtor da classe
    public Cliente(String nome, String endereco, 
                String uf, String telefone, 
                String cpf, String email){
               
    this.nome = nome;
    this.endereco = endereco;
    this.uf = uf;
    this.telefone = telefone;
    this.cpf = cpf;
    this.email = email;
    }
    
    //Metodos que vao retornar os atributos
    public String getNomeCliente(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getUf(){
        return this.uf;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getEmail(){
        return this.email;
    }
}


