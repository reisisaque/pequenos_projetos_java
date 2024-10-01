/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaac
 */
public class Veiculo {
    //Atributos
    String nome;
    String placa;
    String fabricante;
    String modelo;
    String acessorios;
    int anoModelo;
    int qtdPortas;
    
    public Veiculo(String nome, String placa,
                    String fabricante, String modelo,
                    String acessorios, int anoModelo,
                    int qtdPortas){
        
        this.nome = nome;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.acessorios = acessorios;
        this.anoModelo = anoModelo;
        this.qtdPortas = qtdPortas;
    }
    
    //Metodos de acesso
    public String getNomeVeiculo(){
        return this.nome;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public String getFabricante(){
        return this.fabricante;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getAcessorios(){
        return this.acessorios;
    }
    
    public int getAnoModelo(){
        return this.anoModelo;
    } 
    
    public int qtdPortas(){
        return this.qtdPortas;
    }
    
}
