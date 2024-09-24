package org.ada.util;

import org.ada.cliente.models.Cliente;

public class ValidadorCliente {

    public void validarCliente(Cliente cliente) throws Exception {
        //logica de validacao
        if (cliente.getUuid() == null) {
            throw new Exception("Uuid nulo");
        }
    }
}
