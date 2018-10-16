package org.bonilla.dl;

import org.bonilla.bl.*;

import java.io.*;

public class TextFileReader {
    private static final File USUARIO_FILE = new File("src/org/bonilla/Usuario.txt");
    private static final File CLIENTE_FISICO_FILE= new File("src/org/bonilla/ClienteFisico.txt");
    private static final File CLIENTE_JURIDICO_FILE  = new File("src/org/bonilla/ClienteJuridico.txt");
    private static final File CONTACTO_FILE = new File("src/org/bonilla/Contacto.txt");
    private static final File PROYECTO_ACADEMICO_FILE = new File("src/org/bonilla/ProyectoAcademico.txt");
    private static final File PROYECTO_COMERCIAL_FILE = new File("src/org/bonilla/ProyectoComercial.txt");
    private static final File TECNOLOGIA_FILE= new File("src/org/bonilla/Tecnologia.txt");
    private static final File ACTIVIDAD_FILE= new File("src/org/bonilla/Actividad.txt");
    private static final File REGISTRO_ACTIVIDAD_FILE= new File("src/org/bonilla/RegistroActividad.txt");
    private static final File BITACORA_FILE = new File("src/org/bonilla/Bitacora.txt");

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

    // Escribir usuario
    public void escribirUsuario(Usuario u) {
        escribirDatos(u.toString(), USUARIO_FILE);
    }

    // Escribir cliente físico
    public void escribirClienteFisico(ClienteFisico cf) {
        escribirDatos(cf.toString(), CLIENTE_FISICO_FILE);
    }

    // Escribir cliente jurídico
    public void escribirClienteJuridico(ClienteJuridico cj) {
        escribirDatos(cj.toString(), CLIENTE_JURIDICO_FILE);
    }

    // Escribir contacto
    public void escribirContacto(Contacto c) {
        escribirDatos(c.toString(), CONTACTO_FILE);
    }

    // Escribir proyecto academico
    public void escribirProyectoAcademico(ProyectoAcademico pa) {
        escribirDatos(pa.toString(), PROYECTO_ACADEMICO_FILE);
    }

    // Escribir proyecto comercial
    public void escribirProyectoComercial(ProyectoComercial pc) {
        escribirDatos(pc.toString(), PROYECTO_COMERCIAL_FILE);
    }

    // Escribir tecnología
    public void escribirTecnologia(Tecnologia t) {
        escribirDatos(t.toString(), TECNOLOGIA_FILE);
    }

    // Escribir actividad
    public void escribirActividad(Actividad a) {
        escribirDatos(a.toString(), ACTIVIDAD_FILE);
    }

    // Escribir bitacora
    public void escribirBitacora(Bitacora b) {
        escribirDatos(b.toString(), BITACORA_FILE);
    }

    // Escribir registro de actividad
    public void escribirRegistroActividad(RegistroActividad ra) {
        escribirDatos(ra.toString(), REGISTRO_ACTIVIDAD_FILE);
    }

    // Buscar datos en el archivo de texto
    public boolean buscarDatos(String text, File file) {
        FileReader fr;
        BufferedReader br;
        String data, lista = "";
        String[] allData;
        boolean existe = false;
        // (PK) Primary Key index
        int i = (file.toString().contains("Usuario")) ? 4 :
                (file.toString().contains("ClienteFisico")) ? 7 :
                (file.toString().contains("ClienteJuridico")) ? 6 :
                (file.toString().contains("Contacto")) ? 3 :
                (file.toString().contains("ProyectoAcademico")) ? 0 :
                (file.toString().contains("ProyectoComercial")) ? 0 :
                (file.toString().contains("Tecnologia")) ? 0 :
                (file.toString().contains("Actividad")) ? 0 :
                (file.toString().contains("Bitacora")) ? 0 :
                (file.toString().contains("RegistroActividad")) ? 0 : 0;
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

    // Listar usuario
    public String listarUsuario() {
        return listarDatos(USUARIO_FILE);
    }

    // Listar cliente físico
    public String listarClienteFisico() {
        return listarDatos(CLIENTE_FISICO_FILE);
    }

    // Listar cliente jurídico
    public String listarClienteJuridico() {
        return listarDatos(CLIENTE_JURIDICO_FILE);
    }

    // Listar contacto
    public String listarContacto() {
        return listarDatos(CONTACTO_FILE);
    }

    // Listar proyecto académico
    public String listarProyectoAcademico() {
        return listarDatos(PROYECTO_ACADEMICO_FILE);
    }

    // Listar proyecto comercial
    public String listarProyectoComercial() {
        return listarDatos(PROYECTO_COMERCIAL_FILE);
    }

    // Listar tecnología
    public String listarTecnologia() {
        return listarDatos(TECNOLOGIA_FILE);
    }

    // Listar actividad
    public String listarActividad() {
        return listarDatos(ACTIVIDAD_FILE);
    }

    // Listar bitácora
    public String listarBitacora() {
        return listarDatos(BITACORA_FILE);
    }

    // Listar registro de actividad
    public String listarRegistroActividad() {
        return listarDatos(REGISTRO_ACTIVIDAD_FILE);
    }


    // Buscar usuario
    public boolean buscarUsuario(String cedula) {
        return buscarDatos(cedula, USUARIO_FILE);
    }

    // Buscar cliente físico
    public boolean buscarClienteFisico(String correo) {
        return buscarDatos(correo, CLIENTE_FISICO_FILE);
    }

    // Buscar cliente jurídico
    public boolean buscarClienteJuridico(String identificacion) {
        return buscarDatos(identificacion, CLIENTE_JURIDICO_FILE);
    }

    // Buscar contacto
    public boolean buscarContacto(String cedula) {
        return buscarDatos(cedula, CONTACTO_FILE);
    }

    // Buscar proyecto académico
    public boolean buscarProyectoAcademico(String codigo) {
        return buscarDatos(codigo, PROYECTO_ACADEMICO_FILE);
    }

    // Buscar proyecto comercial
    public boolean buscarProyectoComercial(String codigo) {
        return buscarDatos(codigo, PROYECTO_COMERCIAL_FILE);
    }

    // Buscar tecnología
    public boolean buscarTecnologia(String codigo) {
        return buscarDatos(codigo, TECNOLOGIA_FILE);
    }

    // Buscar actividad
    public boolean buscarActividad(String codigo) {
        return buscarDatos(codigo, ACTIVIDAD_FILE);
    }

    // Buscar bitácora
    public boolean buscarBitacora(String codigo) {
        return buscarDatos(codigo, BITACORA_FILE);
    }

    // Buscar registro de actividad
    public boolean buscarRegistroActividad(String codigo) {
        return buscarDatos(codigo, REGISTRO_ACTIVIDAD_FILE);
    }
}