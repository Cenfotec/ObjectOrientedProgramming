package org.bonilla.practicauno;

public class CL {
    private static String[][] Empleados = new String[10][6];
    private static String[][] Profesores = new String[10][7];
    private static String[][] Carreras = new String[10][4];
    private static String[][] Laboratorios = new String[10][5];


    // Getters
    public static String[][] getEmpleados() {
        return Empleados;
    }

    public static String[][] getProfesores() {
        return Profesores;
    }

    public static String[][] getCarreras() {
        return Carreras;
    }

    public static String[][] getLaboratorios() {
        return Laboratorios;
    }

    // Registrar
    public static void registrarEmpleado(String[] empleado) {
        for (int i = 0; i < getEmpleados().length; i++) {
            if (getEmpleados()[i][0] == null) {
                for (int j = 0; j < getEmpleados()[0].length; j++) {
                    getEmpleados()[i][j] = empleado[j];
                }
                break;
            }
        }
    }

    public static void registrarProfesor(String[] profesor) {
        for (int i = 0; i < getProfesores().length; i++) {
            if (getProfesores()[i][0] == null) {
                for (int j = 0; j < getProfesores()[0].length; j++) {
                    getProfesores()[i][j] = profesor[j];
                }
                break;
            }
        }
    }

    public static void registrarCarrera(String[] carrera) {
        for (int i = 0; i < getCarreras().length; i++) {
            if (getCarreras()[i][0] == null) {
                for (int j = 0; j < getCarreras()[0].length; j++) {
                    getCarreras()[i][j] = carrera[j];
                }
                break;
            }
        }
    }

    public static void registrarLaboratorio(String[] laboratorio) {
        for (int i = 0; i < getLaboratorios().length; i++) {
            if (getLaboratorios()[i][0] == null) {
                for (int j = 0; j < getLaboratorios()[0].length; j++) {
                    getLaboratorios()[i][j] = laboratorio[j];
                }
                break;
            }
        }
    }

    // Buscar
    public static String[] buscarEmpleado(String cedula) {
        String[] empleado = new String[getEmpleados()[0].length];
        for (int i = 0; i < getEmpleados().length; i++) {
            if (getEmpleados()[i][0] != null) {
                for (int j = 0; j < getEmpleados()[0].length; j++) {
                    if (getEmpleados()[i][0].equals(cedula)) {
                        empleado[j] = getEmpleados()[i][j];
                    }
                }
            }
        }
        return empleado;
    }

    public static String[] buscarProfesor(String cedula) {
        String[] profesor = new String[getProfesores()[0].length];
        for (int i = 0; i < getProfesores().length; i++) {
            if (getProfesores()[i][0] != null) {
                for (int j = 0; j < getProfesores()[0].length; j++) {
                    if (getProfesores()[i][0].equals(cedula)) {
                        profesor[j] = getProfesores()[i][j];
                    }
                }
            }
        }
        return profesor;
    }

    public static String[] buscarCarrera(String codigo) {
        String[] carrera = new String[getCarreras()[0].length];
        for (int i = 0; i < getCarreras().length; i++) {
            if (getCarreras()[i][0] != null) {
                for (int j = 0; j < getCarreras()[0].length; j++) {
                    if (getCarreras()[i][0].equals(codigo)) {
                        carrera[j] = getCarreras()[i][j];
                    }
                }
            }
        }
        return carrera;
    }

    public static String[] buscarLaboratorio(String codigo) {
        String[] laboratorio = new String[getLaboratorios()[0].length];
        for (int i = 0; i < getLaboratorios().length; i++) {
            if (getLaboratorios()[i][0] != null) {
                for (int j = 0; j < getLaboratorios()[0].length; j++) {
                    if (getLaboratorios()[i][0].equals(codigo)) {
                        laboratorio[j] = getLaboratorios()[i][j];
                    }
                }
            }
        }
        return laboratorio;
    }
}
