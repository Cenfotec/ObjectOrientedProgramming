package org.bonilla.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.apache.commons.lang3.StringUtils;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        int numero;
        out.println("Digite el número: ");
        numero = Integer.parseInt(br.readLine());
        out.println("El número digitado es " + numero);
        int[] arreglo = new int[2];
        // arreglo[2] = numero;
        try {
            arreglo[2] = numero;
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        // Using Apache Commons Library
        boolean isNumber = StringUtils.isNumeric(String.valueOf(numero));
        out.println(numero + ": " + isNumber);
    }
}
