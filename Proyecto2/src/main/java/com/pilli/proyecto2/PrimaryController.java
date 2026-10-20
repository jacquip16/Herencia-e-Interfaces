package com.pilli.proyecto2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextArea txtTerminal;

    @FXML
    private void btnEjecutar_click() {
        StringBuilder salida = new StringBuilder();

        // Ejecución exacta del bloque Main pedido en el ejercicio
        Figura2D f = new TrianguloRect(3, 4);
        salida.append(f.imprimeFigura()).append("\n\n");

        f = new Circulo(3);
        salida.append(f.imprimeFigura());

        txtTerminal.setText(salida.toString());
    }
}