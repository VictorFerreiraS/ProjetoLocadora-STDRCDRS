package org.ada.app;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepository;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.service.AgenciaService;
import org.ada.agencia.service.AgenciaServiceImpl;
import org.ada.aluguel.*;
import org.ada.cliente.models.Cliente;
import org.ada.cliente.models.ClientePessoaFisica;
import org.ada.cliente.models.TipoCliente;
import org.ada.cliente.repository.ClienteRepository;
import org.ada.cliente.repository.ClienteRepositoryInMemoryImpl;
import org.ada.cliente.service.ClienteService;
import org.ada.cliente.service.ClienteServiceImpl;
import org.ada.devolucao.models.Devolucao;
import org.ada.devolucao.repository.*;
import org.ada.devolucao.service.DevolucaoServiceImplBase;
import org.ada.devolucao.service.DevolucaoServicePF;
import org.ada.devolucao.service.DevolucaoServicePJ;
import org.ada.veiculo.models.TipoVeiculo;
import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;
import org.ada.veiculo.repository.VeiculoRepositoryInMemoryImpl;
import org.ada.veiculo.service.VeiculoService;
import org.ada.veiculo.service.VeiculoServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {

        //instanciando o reposotorio de cliente e seu servico
        ClienteRepository clienteRepository = new ClienteRepositoryInMemoryImpl();
        ClienteService clienteService = new ClienteServiceImpl(clienteRepository);

        //instanciando o reposotorio de agencia e seu servico
        AgenciaRepository agenciaRepository = new AgenciaRepositoryInMemoryImpl();
        AgenciaService agenciaService = new AgenciaServiceImpl(agenciaRepository);

        //instanciando o reposotorio de veiculo e seu servico
        VeiculoRepository veiculoRepository = new VeiculoRepositoryInMemoryImpl();
        VeiculoService veiculoService = new VeiculoServiceImpl(veiculoRepository);

        //instanciando o reposotorio de aluguel e seu servico
        AluguelRepository aluguelRepository = new AluguelRepositoryImpl();
        AluguelService aluguelService = new AluguelServiceImpl(aluguelRepository);

        //instanciando os repositorios dos descontos
        DescontosPJRepository descontosPJRepository = new DescontosPJRepositoryImpl();
        DescontosPFRepository descontosPFRepository = new DescontosPFRepositoryImpl();

        //instanciando o depositorio de devolucao e seus servicos para cada tipo cliente
        DevolucaoRepository devolucaoRepository = new DevolucaoRepositoryImpl();
        DevolucaoServiceImplBase devolucaoServicePF = new DevolucaoServicePF(devolucaoRepository,descontosPFRepository);
        DevolucaoServiceImplBase devolucaoServicePJ = new DevolucaoServicePJ(devolucaoRepository,descontosPJRepository);



        Cliente cliente1 = new ClientePessoaFisica("adalberto","123");
        clienteService.criarCliente(cliente1);

        Veiculo veiculo1 = new Veiculo("1234ABCD","sla","nsei","2024", TipoVeiculo.CARRO);
        veiculoService.salvarVeiculo(veiculo1);

        Agencia agencia1 = new Agencia("CarrosNovos","Rua do caos, 000");
        agenciaService.criarAgencia(agencia1);
        agencia1.cadastrarVeiculo(veiculo1);

        Aluguel aluguel1 = new Aluguel(cliente1,veiculo1,agencia1,10);
        aluguelService.criarAluguel(aluguel1);

//        for (int i=0 ;i<1000000;i++){
//            System.out.print("1 ");
//        }
//        System.out.println();

        Agencia agencia2 = new Agencia("CarrosVelhos","Rua do terror, 000");

        Devolucao devolucao1 = devolucaoServicePF.realizarDevolucao(aluguel1);
        devolucaoServicePF.salvarDevolucao(devolucao1);

        System.out.println(devolucao1);

        //aluguel1.setAgenciaDeDevolucao(agencia2);

        //System.out.println(devolucaoServicePF.buscarDevolucaoPorCliente(cliente1));

        //Devolucao devolucao = devolucaoServicePF.realizarDevolucao(aluguel);

        //devolucaoServicePF.salvarDevolucao(devolucaoServicePF.realizarDevolucao(aluguel));



    }
}
