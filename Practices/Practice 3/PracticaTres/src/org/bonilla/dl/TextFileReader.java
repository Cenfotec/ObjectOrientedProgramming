package org.bonilla.dl;

import org.bonilla.bl.Inquilino;
import org.bonilla.bl.Propiedad;

import java.io.*;

public class TextFileReader {
    private static final File INQUILINOS_FILE = new File("src/org/bonilla/Inquilinos.txt");
    private static final File PROPIEDADES_FILE = new File("src/org/bonilla/Propiedades.txt");
    private static final String CHARSET = "UTF-8";
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static OutputStreamWriter osw;

    public TextFileReader() {}

    // Escribir datos en el archivo de texto
    public void escribirDatos(String text, File file) {
        FileWriter fw;
        BufferedWriter br;
        try {
            fw = new FileWriter(file, true);
            br = new BufferedWriter(fw);
            br.write(text);
            br.newLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Escribir inquilino
    public void escribirInquilino(Inquilino i) {
        escribirDatos(i.toString(), INQUILINOS_FILE);
    }

    // Escribir propiedad
    public void escribirPropiedad(Propiedad p) {
        escribirDatos(p.toString(), PROPIEDADES_FILE);
    }

    // Buscar datos en el archivo de texto
    public boolean buscarDatos(String text, File file) {
        FileReader fr;
        BufferedReader br;
        String data, lista = "";
        String[] allData;
        boolean existe = false;
        int i = (file.toString().contains("Inquilino") ? 4 : 0);
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((data = br.readLine()) != null) {
                lista = "\n" + data;
                allData = lista.split(",");
                if (allData[i].trim().equalsIgnoreCase(text)) {
                    existe = true;
                }
            }
            fr.close();
            return existe;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return existe;
    }

    // Listar
    public String listarDatos(File file) {
        FileReader fr;
        BufferedReader br;
        String data, lista = "";
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((data = br.readLine()) != null) {
                lista += "\n" + data;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Listar inquilinos
    public String listarInquilinos() {
        return listarDatos(INQUILINOS_FILE);
    }

    // Listar propiedades
    public String listarPropiedades() { return listarDatos(PROPIEDADES_FILE); }

    // Buscar inquilinos
    public boolean buscarInquilino(String identificacion) {
        return buscarDatos(identificacion, INQUILINOS_FILE);
    }

    // Buscar propiedades
    public boolean buscarPropiedad(int codigo) {
        return buscarDatos(String.valueOf(codigo), PROPIEDADES_FILE);
    }
}
