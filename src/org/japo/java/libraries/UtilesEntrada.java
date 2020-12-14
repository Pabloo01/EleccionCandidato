/*
 * Copyright 2020 Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José A. Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final double obtenerDouble(String msgUsr, String msgErr) {
        double numero = 0;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return numero;
    }

    public static final int obtenerEntero(String msgUsr, String msgErr) {
        int numero = 0;
        boolean entradaOk = false;

        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextInt();
                entradaOk = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOk);

        return numero;
    }

    public static final boolean obtenerLogico(String msgUsr, String msgErr) {
        boolean valor = true;
        boolean valorOk = false;

        do {
            try {
                System.out.print(msgUsr);
                valor = SCN.nextBoolean();
                valorOk = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!valorOk);

        return valor;
    }

    public static char obtenerCaracter(String msgUsr, String msgErr) {
        char voto = '0';

        try {
            System.out.print(msgUsr);
            voto = SCN.nextLine().charAt(0);
        } catch (Exception e) {
            System.out.println(msgErr);
        }

        return voto;
    }

    public static String obtenerTexto(String msgUsr) {
        String nombre;

        System.out.print(msgUsr);
        nombre = SCN.nextLine();

        return nombre;
    }
}
