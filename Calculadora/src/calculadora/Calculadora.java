package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField display;
    private String input = "";
    private double num1 = 0, num2 = 0;
    private char operator = ' ';

    public Calculadora() {
        setTitle("Calculadora");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Campo de texto para mostrar los números y resultados
        display = new JTextField();
        display.setPreferredSize(new Dimension(300, 50));
        display.setEditable(false); // Evita que el usuario escriba directamente
        add(display, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // 4 filas, 4 columnas, espacio entre botones

        // Texto de los botones
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Crear y agregar botones al panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this); // Asignar el ActionListener
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER); // Agregar el panel de botones a la ventana
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // Obtener el texto del botón presionado

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') { // Si es un número
            input += command; // Concatenar el número
            display.setText(input); // Mostrar en el campo de texto
        } else if (command.equals("C")) { // Si es el botón de limpiar
            input = ""; // Reiniciar la entrada
            display.setText(""); // Limpiar el campo de texto
            num1 = num2 = 0; // Reiniciar las variables
            operator = ' '; // Reiniciar el operador
        } else if (command.equals("=")) { // Si es el botón de igual
            num2 = Double.parseDouble(input); // Obtener el segundo número
            double result = calcular(num1, num2, operator); // Calcular el resultado
            display.setText(String.valueOf(result)); // Mostrar el resultado
            input = ""; // Reiniciar la entrada
            num1 = result; // Guardar el resultado para operaciones posteriores
        } else { // Si es un operador (+, -, *, /)
            if (!input.isEmpty()) {
                num1 = Double.parseDouble(input); // Obtener el primer número
                operator = command.charAt(0); // Guardar el operador
                input = ""; // Reiniciar la entrada
                display.setText(String.valueOf(num1) + " " + operator); // Mostrar el operador
            }
        }
    }

    // Método para realizar las operaciones
    private double calcular(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calculadora = new Calculadora();
            calculadora.setVisible(true); // Mostrar la ventana
        });
    }
}
