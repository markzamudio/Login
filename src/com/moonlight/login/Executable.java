package com.moonlight.login;

import com.moonlight.login.forms.JFLogin;


/**
 *
 * @author Mark_Zamudio
 */
public class Executable {
    public static void main(String[] args) {
        /*
            Carga el driver a memoria
        */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            new JFLogin().setVisible(true);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se cargo correctamente el driver de la base de datos");
        }
    }
}
