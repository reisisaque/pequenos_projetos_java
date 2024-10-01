
import java.time.LocalDate;
import java.time.Month;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaac
 */ 
public class Main {
    public static void main(String[] args) {
        //parametros: nome, cargo, login, senha, email
       //criando usuario
       Usuario usuario = new Usuario(   "Gustavo Lima dos santos",
                                        "empresario", 
                                        "Gustavo Lima", 
                                        "666888",  
                                        "gugu123@gmail.com");
       
       //criando clientes
       //parametros: nome, endereco, uf, telefone, cpf, email
       Cliente cliente1 = new Cliente(  "Henrique", 
                                        "bairro Lagoa Verde, Palmas", 
                                        "(TO)", 
                                        "(63) 99034-8949", 
                                        "877.233.475-11", 
                                        "riquinho2323@gmail.com");
       
       Cliente cliente2 = new Cliente(  "Juliano",  
                                        "bairro Lagoa Verde, Palmas", 
                                        "(TO)", 
                                        "(63) 99084-0934", 
                                        "274.132.305-01", 
                                        "julinho244@gmail.com");
       
       Cliente cliente3 = new Cliente(  "Simone",
                                        "bairro do Morumbi, Sao Paulo",
                                        "(SP)",
                                        "(19) 98806-0203",
                                        "670.029.123-78",
                                        "mone89@gmail.com");
                                       
       
       //cadastrar clientes
       usuario.cadastrarCliente(cliente1);
       usuario.cadastrarCliente(cliente2);
       usuario.cadastrarCliente(cliente3);
       //consultar clientes
        System.out.println("\n");
       usuario.consultarCliente(cliente1.getCpf());
        System.out.println("\n");
       usuario.consultarCliente(cliente2.getCpf());
        System.out.println("\n");
       usuario.consultarCliente(cliente3.getCpf());
       
       //excluir cliente
        System.out.println("\n");
        usuario.excluirCliente(cliente1.getCpf());
        System.out.println("\n");
      
       //criando veiculo
       //parametros: nome, placa, fabricante, modelo, acessorios, anoModelo, qtdPortas
       Veiculo fiatUno = new Veiculo("Fiat Uno", "apk2i90", 
                                     "Fiat", "Uno premiere", 
                                     "Sem acessorios", 2003, 4);
       
       Veiculo sportage = new Veiculo("Sportage", "ffi2r34", 
                                      "Hyundai", "Sportage SUV hybrid", 
                                      "capa externa", 2020, 4);
       
       Veiculo sw4 = new Veiculo("SW4", "ads0l56",
                                "Toyota", "Toyota SW4 Diamond",
                                "Sem acessorios", 2024, 4);
       
       //cadastrar veiculo
        System.out.println("\n");
       usuario.cadastrarVeiculo(fiatUno);
       usuario.cadastrarVeiculo(sportage);
              
       //consultar veiculo
        System.out.println("\n");
       usuario.consultarVeiculo(sportage.getPlaca());
       usuario.consultarVeiculo(fiatUno.getPlaca());
       
        //excluir veiculo
        System.out.println("\n");
        usuario.excluirVeiculo(fiatUno.getPlaca());
        
       //criando aluguel 
       Aluguel aluguel1 = new Aluguel("12345", 'E', 239.90, 
                                    sportage.getNomeVeiculo(),
                                    cliente2.getNomeCliente(),
                                    "2 dias restantes para uso",
                                    LocalDate.of(2024, 5, 21),
                                    LocalDate.of(2024, 5, 23));
       
       Aluguel aluguel2 = new Aluguel("67891", 'E', 990.90,
                                      sw4.getNomeVeiculo(),
                                      cliente3.getNomeCliente(),
                                      "4 dias restantes para uso",
                                      LocalDate.of(2024, 8, 12),
                                      LocalDate.of(2024, 8, 16));
       
       //cadastrar aluguel
        System.out.println("\n");
       usuario.cadastrarAluguel(aluguel1);
       usuario.cadastrarAluguel(aluguel2);
       
        //consultar aluguel 
       usuario.consultarAluguel(aluguel1.getIdAluguel());
       usuario.consultarAluguel(aluguel2.getIdAluguel());
        
       //excluir aluguel
       usuario.excluirAluguel(aluguel1.getIdAluguel());
    }
}
