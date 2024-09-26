package org.ada.dataframework.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation implements FileHandling{
    @Override
    public void createFile() {
        String pastaRaizDoProjeto = new File("").getAbsolutePath();

        File pastaBD = new File(pastaRaizDoProjeto + File.separator + "BD_Locadora");

        if (!pastaBD.exists()) {
            pastaBD.mkdir();
        }

        File arquivoBD = new File(pastaBD, "BD_Locadora.txt");

        try {
            arquivoBD.createNewFile();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
