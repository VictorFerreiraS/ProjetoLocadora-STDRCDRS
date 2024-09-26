package org.ada.veiculo.repository;

import org.ada.veiculo.models.TipoVeiculo;
import org.ada.veiculo.models.Veiculo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class VeiculoRepositoryInMemoryImpl implements VeiculoRepository {
    private final Map<String, Veiculo> veiculos = new HashMap<>();

    @Override
    public Veiculo inserir(Veiculo obj) {
//        veiculos.put(obj.getUuid(), obj);
        try {
            String pastaRaizDoProjeto = new File("").getAbsolutePath();

            FileWriter fwrite = new FileWriter(pastaRaizDoProjeto + File.separator + "BD_Locadora" + File.separator + "BD_Locadora.txt", true);
            fwrite.write(obj.getUuid()+" | "+ obj);
            fwrite.write(System.lineSeparator());

            fwrite.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Veiculo alterar(Veiculo obj) {

        // INSERIR COMO PARAMETRO O ID OU PLACA DO CARRO A SER ALTERADO PARA FAZER A BUSCA DO MESMO
        // **************************************************
//        veiculos.put(obj.getUuid(), obj);
        try {
            String pastaRaizDoProjeto = new File("").getAbsolutePath();
            File arquivoParaAlterar = new File(pastaRaizDoProjeto + File.separator + "BD_Locadora" + File.separator + "BD_Locadora.txt");
            String conteudoAntigo = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoParaAlterar));
            String linha = bufferedReader.readLine();
            while (linha != null) {
                conteudoAntigo = conteudoAntigo + linha + System.lineSeparator();
                linha = bufferedReader.readLine();
            }
            String[] linhas = conteudoAntigo.split(System.lineSeparator());

            for(int i = 0; i<linhas.length; i++){
                if(linhas[i].contains("ABC1236")){
                    linhas[i] = obj.toString();
                    break;
                }
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoParaAlterar));
            for(String novaLinha: linhas){
                bufferedWriter.write(novaLinha);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

            bufferedReader.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        return obj;
    }

    @Override
    public Veiculo deletar(Veiculo obj) {
//        return veiculos.remove(obj.getUuid());
        try{
            String pastaRaizDoProjeto = new File("").getAbsolutePath();
            File arquivoParaAlterar = new File(pastaRaizDoProjeto + File.separator + "BD_Locadora" + File.separator + "BD_Locadora.txt");
            String conteudoAntigo = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoParaAlterar));
            String linha = bufferedReader.readLine();
            while (linha != null) {
                conteudoAntigo = conteudoAntigo + linha + System.lineSeparator();
                linha = bufferedReader.readLine();
            }
            String[] linhas = conteudoAntigo.split(System.lineSeparator());
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoParaAlterar));
            for (String s: linhas){
                if (!s.contains(obj.getPlaca())){
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception e){e.printStackTrace();}
        return obj;
    }

    @Override
    public Veiculo buscaPorId(String id) {
//        return veiculos.get(id);

        String placa = null;
        String marca = null;
        String modelo = null;
        String ano = null;
        String tipoVeiculo = null;
        try {
            String pastaRaizDoProjeto = new File("").getAbsolutePath();
            File arquivoParaAlterar = new File(pastaRaizDoProjeto + File.separator + "BD_Locadora" + File.separator + "BD_Locadora.txt");
            String conteudoAntigo = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoParaAlterar));
            String linha = bufferedReader.readLine();
            while (linha != null) {
                conteudoAntigo = conteudoAntigo + linha + System.lineSeparator();
                linha = bufferedReader.readLine();
            }
            String[] linhas = conteudoAntigo.split(System.lineSeparator());
            String veiculoEncontrado = "";
            for (String s : linhas) {
                if (s.contains(id)) {
                    veiculoEncontrado = s.replace("Veiculo{", "").replace("}", "");
                }
            }
            String[] atributos = veiculoEncontrado.split(", ");
            placa = atributos[0].split("=")[1].replace("'", "");
            marca = atributos[1].split("=")[1].replace("'", "");
            modelo = atributos[2].split("=")[1].replace("'", "");
            ano = atributos[3].split("=")[1].replace("'", "");
            tipoVeiculo = atributos[4].split("=")[1];
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Veiculo(placa, marca, modelo, ano, TipoVeiculo.valueOf(tipoVeiculo));
    }

    @Override
    public Veiculo deletarPorId(String id) {
//        return veiculos.remove(id);
        try{
            String pastaRaizDoProjeto = new File("").getAbsolutePath();
            File arquivoParaAlterar = new File(pastaRaizDoProjeto + File.separator + "BD_Locadora" + File.separator + "BD_Locadora.txt");
            String conteudoAntigo = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoParaAlterar));
            String linha = bufferedReader.readLine();
            while (linha != null) {
                conteudoAntigo = conteudoAntigo + linha + System.lineSeparator();
                linha = bufferedReader.readLine();
            }
            String[] linhas = conteudoAntigo.split(System.lineSeparator());
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoParaAlterar));
            for (String s: linhas){
                if (!s.contains(id)){
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception e){e.printStackTrace();}
        return new Veiculo("as", "sa", "as", "as", TipoVeiculo.CAMINHAO);
    }

    @Override
    public Veiculo buscarVeiculoPorPlaca(String placa) {
        String marca = null;
        String modelo = null;
        String ano = null;
        String tipoVeiculo = null;
        try {
            String pastaRaizDoProjeto = new File("").getAbsolutePath();
            File arquivoParaAlterar = new File(pastaRaizDoProjeto + File.separator + "BD_Locadora" + File.separator + "BD_Locadora.txt");
            StringBuilder conteudoAntigo = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoParaAlterar));
            String linha = bufferedReader.readLine();
            while (linha != null) {
                conteudoAntigo.append(linha).append(System.lineSeparator());
                linha = bufferedReader.readLine();
            }
            String[] linhas = conteudoAntigo.toString().split(System.lineSeparator());

            String veiculoEncontrado = "";
            for (String s: linhas){
                if (s.contains(placa)){
                    veiculoEncontrado = s.replace("Veiculo{", "").replace("}", "");
                }
            }
            String[] atributos = veiculoEncontrado.split(", ");
            placa = atributos[0].split("=")[1].replace("'", "");
            marca = atributos[1].split("=")[1].replace("'", "");
            modelo = atributos[2].split("=")[1].replace("'", "");
            ano = atributos[3].split("=")[1].replace("'", "");
            tipoVeiculo = atributos[4].split("=")[1];
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Veiculo(placa, marca, modelo, ano, TipoVeiculo.valueOf(tipoVeiculo));
    }
}
