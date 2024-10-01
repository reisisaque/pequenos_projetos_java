/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaac
 */
import java.time.LocalDate;

public class Aluguel {
    String idaluguel;
    char entregue; // (V/N)
    Double valorPago;
    String veiculo;
    String cliente;
    String observacao;
    LocalDate dataAluguel; //atribuindo uma data: dataAluguel = LocalDate.of(2024, 9, 22);
    LocalDate dataEntrega;
    
    public Aluguel(String idaluguel, char entregue, 
                   double valorPago, String veiculo,
                   String cliente, String observacao,
                   LocalDate dataAluguel, LocalDate dataEntrega){
        
        this.idaluguel = idaluguel;
        this.entregue = entregue;
        this.valorPago = valorPago;
        this.dataAluguel = dataAluguel;
        this.dataEntrega = dataEntrega;
    }
    
    public String getIdAluguel(){
        return this.idaluguel;
    }
    
    public char getEntregue(){
        return this.entregue;
    }
    
    public double getValorPago(){
        return this.valorPago;
    }
    
    public LocalDate getDataAluguel(){
        return dataAluguel;
    }
    
    public LocalDate getDataEntrega(){
        return dataEntrega;
    }
}
