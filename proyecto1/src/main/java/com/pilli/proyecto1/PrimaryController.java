package com.pilli.proyecto1;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextArea txtSalida;

    @FXML
    private void ejecutarPrueba() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Se crea Alumno...\n");
        
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008000);
        
        sb.append(a.toString()).append("\n");
        sb.append(p.toString()).append("\n");

        txtSalida.setText(sb.toString());
    }
}