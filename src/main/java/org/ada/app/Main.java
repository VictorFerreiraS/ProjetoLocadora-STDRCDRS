package org.ada.app;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.service.AgenciaServiceImpl;
import org.ada.agencia.validation.ValidarAgencia;

public class Main {
    public static void main(String[] args) {
//        testesAgencia();
    }

    public static void testesAgencia() {
        Agencia agenciaSJ = new Agencia("Agencia SJDR", "SJDR MG");
        Agencia agenciaSP = new Agencia("Agencia SP", "SP SP");

        AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory = new AgenciaRepositoryInMemoryImpl();
        ValidarAgencia validarAgencia = new ValidarAgencia(agenciaRepositoryInMemory);
        AgenciaServiceImpl agenciaServiceImpl = new AgenciaServiceImpl(agenciaRepositoryInMemory, validarAgencia);
        agenciaServiceImpl.criarAgencia(agenciaSJ);
        agenciaServiceImpl.criarAgencia(agenciaSP);



    }


}
