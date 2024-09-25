package org.ada.app;

import org.ada.agencia.repository.AgenciaRepository;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.service.AgenciaService;
import org.ada.agencia.service.AgenciaServiceImpl;
import org.ada.aluguel.AluguelRepository;
import org.ada.aluguel.AluguelRepositoryImpl;
import org.ada.aluguel.AluguelService;
import org.ada.aluguel.AluguelServiceImpl;
import org.ada.cliente.models.ClientePessoaFisica;
import org.ada.cliente.repository.ClienteRepository;
import org.ada.cliente.repository.ClienteRepositoryInMemoryImpl;
import org.ada.cliente.service.ClienteService;
import org.ada.cliente.service.ClienteServiceImpl;
import org.ada.devolucao.repository.*;
import org.ada.devolucao.service.DevolucaoServiceImplBase;
import org.ada.devolucao.service.DevolucaoServicePF;
import org.ada.devolucao.service.DevolucaoServicePJ;
import org.ada.veiculo.repository.VeiculoRepository;
import org.ada.veiculo.repository.VeiculoRepositoryInMemoryImpl;
import org.ada.veiculo.service.VeiculoService;
import org.ada.veiculo.service.VeiculoServiceImpl;

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



        ClientePessoaFisica nathan = new ClientePessoaFisica("adalberto","123");


    }
}
