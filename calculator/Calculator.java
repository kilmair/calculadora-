package calculator;

import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {

        Double num1;
        Double num2;
        Double soma;
        String op;

        String numero1
                = JOptionPane.showInputDialog("digite o Primeiro número");
        String numero2
                = JOptionPane.showInputDialog("digite o Segundo número");

        for (int i = 0; i < 2; i++) {

            String operacao
                    = JOptionPane.showInputDialog("digite qual a operação ( + , - , / , *)");

            if (operacao.equals("+")) {
                num1 = Double.parseDouble(numero1);
                num2 = Double.parseDouble(numero2);
                soma = num1 + num2;
                JOptionPane.showMessageDialog(null, "o resultado da soma é: " + soma);
            }

            if (operacao.equals("-")) {
                num1 = Double.parseDouble(numero1);
                num2 = Double.parseDouble(numero2);
                Double subtracao = num1 - num2;
                JOptionPane.showMessageDialog(null, "o resultado da subtração é: " + subtracao);
            }

            if (operacao.equals("/")) {
                num1 = Double.parseDouble(numero1);
                num2 = Double.parseDouble(numero2);
                Double divisao = num1 / num2;
                JOptionPane.showMessageDialog(null, "o resultado da divisão é: " + divisao);
            }

            if (operacao.equals("*")) {
                num1 = Double.parseDouble(numero1);
                num2 = Double.parseDouble(numero2);
                Double multiplicacao = num1 * num2;
                JOptionPane.showMessageDialog(null, "o resultado da multiplicação é: " + multiplicacao);
            }

            if (operacao.equals("+")) {
            } else {
                if (operacao.equals("-")) {
                } else {
                    if (operacao.equals("/")) {
                    } else {
                        if (operacao.equals("*")) {
                        } else {
                            System.out.println("digite uma opção válida");
                            i = 0;
                        }
                    }
                }
            }
        }
    }
}
