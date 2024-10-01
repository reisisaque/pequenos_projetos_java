
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaac

Não pode alugar um veículo que já foi alugado e não entregue
O sistema deve acusar se um veículo foi alugado
O cliente e o veiculo deve existir para gravar o aluguel
O usuário poderá :
Cadastrar, consultar e excluir as Cliente
Cadastrar, consultar e excluir os Veículos 
Cadastrar, consultar e excluir as Alugueis
Cada arquivo será identificado pelo identificador de cada instancia
Para o caso do aluguel será criada uma lista para que possa ser verificado
* se um veículo está 
alugado.
Deve existir uma tela para consultar o faturamento dado um período específico.
Deve existir uma tela para consultar os Veículos alugados e não entregues 
* no prazo.
 
 */
public class Usuario {
    //Atributos
    private String nome;
    private String cargo;
    private String login;
    private String senha;
    private String email;
    
    
    //Listas para armazenar clientes, veículos e aluguéis
    private List<Cliente> clientes;
    private List<Veiculo> veiculos;
    private List<Aluguel> alugueis;
    
    //construtor da classe
    public Usuario(String nome, String cargo, 
                   String login, String senha, 
                   String email){
        
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.email = email;
        
        //inicializando as listas
        this.clientes = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.alugueis = new ArrayList<>();
    }
    
    //Metodos para clientes
    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente); //adiciona cliente do parametro na lista
        System.out.println("Cliente cadastrado com sucesso: "
                            + cliente.getNomeCliente()+ " " + cliente.getCpf());
    }
    
    public Cliente consultarCliente(String cpf){
        for(Cliente cliente : clientes){ /*percorre a lista para identificar 
            o cpf inserido no parametro*/
            if(cliente.getCpf().equals(cpf)){
                System.out.println("Nome: "      + cliente.getNomeCliente()+
                                   "\nEndereco: "+ cliente.getEndereco()+
                                   "\nUF: "      + cliente.getUf()+
                                   "\nTelefone: "+ cliente.getTelefone()+
                                   "\nCPF: "     + cliente.getCpf()+
                                   "\nEmail: "   + cliente.getEmail());
                return cliente;
            }
        }
        System.out.println("Cliente nao encontrado.");
        return null;
    } 
    
    public void excluirCliente(String cpf){
        Cliente cliente = consultarCliente(cpf);/*verifica se o cpf esta 
        inserido na lista*/
        
        if(cliente != null){
            clientes.remove(cliente);
            System.out.println("Cliente removido: "+ cliente.getNomeCliente()
                                + " " + cliente.getCpf());
        }
    }
    
    //Metodos para veiculos
    public void cadastrarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        System.out.println("Veiculo cadastrado com sucesso: " 
                            + veiculo.getNomeVeiculo());
    }
    
    public Veiculo consultarVeiculo(String placa){
        for (Veiculo veiculo: veiculos){
            if(veiculo.getPlaca().equals(placa)){
                System.out.println("Nome: "         + veiculo.getNomeVeiculo() +
                                  "\nPlaca: "         + veiculo.getPlaca() + 
                                  "\nFabricante: "    + veiculo.getFabricante() +
                                  "\nModelo: "        + veiculo.getModelo() + 
                                  "\nAcessorios: "    + veiculo.getAcessorios() + 
                                  "\nAno do Modelo: " + veiculo.getModelo() + 
                                  "\nQuantidade de portas: " + veiculo.qtdPortas()
                                );
                return veiculo;
            }
        }
        System.out.println("Veiculo nao encontrado");
        return null;
    }
    
    public void excluirVeiculo(String placa){
        Veiculo veiculo = consultarVeiculo(placa);
        if(veiculo != null){
            veiculos.remove(veiculo);
            System.out.println("Foi excluido o veiculo: "
                                + veiculo.getNomeVeiculo());
        }
    }
    
    //Metodos para alugueis
    public void cadastrarAluguel(Aluguel aluguel){
        alugueis.add(aluguel);
        System.out.println("Aluguel cadastrado com sucesso: "
                            + "" + aluguel.getIdAluguel());
    }
    
    public Aluguel consultarAluguel(String idaluguel){
        for(Aluguel aluguel: alugueis){
            if(aluguel.getIdAluguel().equals(idaluguel)){
                System.out.println("\nAluguel(id): " + aluguel.getIdAluguel() +
                                   "\nEntregue (E/N): " + aluguel.getEntregue() +
                                   "\nValor pago: R$"+ aluguel.getValorPago() +
                                   "\nData do aluguel: "+ aluguel.getDataAluguel() +
                                   "\nData da Entrega: "+ aluguel.getDataEntrega());
                return aluguel;
            }
        }
        System.out.println("Aluguel nao encontrado");
        return null;
    }
    
    public void excluirAluguel(String idaluguel){
        Aluguel aluguel = consultarAluguel(idaluguel);
        if(aluguel != null){
            alugueis.remove(aluguel);
            System.out.println("Foi excluido o aluguel: "
                                + aluguel.getIdAluguel());
        }
    }
    
}
