package org.bonilla.laboratoriouno;

public class CL {
    private static String[][] Inquilinos = new String[100][7];
    private static String[][] Propiedades = new String[100][8];

    public static String[][] getInquilinos() {
        return Inquilinos;
    }

    public static String[][] getPropiedades() {
        return Propiedades;
    }



    public static void registrarInquilino(String[] inquilino) {
        for (int i = 0; i < Inquilinos.length; i++) {
            if (Inquilinos[i][0] == null) {
                for (int j = 0; j < Inquilinos[0].length; j++) {
                    Inquilinos[i][j] = inquilino[j];
                }
                break;
            }
        }
    }

    public static void registrarPropiedad(String[] propiedad) {
        for (int i = 0; i < Propiedades.length; i++) {
            if (Propiedades[i][0] == null) {
                for (int j = 0; j < Propiedades[0].length; j++) {
                    Propiedades[i][j] = propiedad[j];
                }
                break;
            }
        }
    }

    public static String[][] listarInquilinos() {
        return Inquilinos;
    }

    public static String[][] listarPropiedades() {
        return Propiedades;
    }
}
