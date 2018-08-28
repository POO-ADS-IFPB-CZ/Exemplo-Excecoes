package com.ifpb.exemplo.view;

import com.ifpb.exemplo.exceptions.LimiteExcedidoException;
import com.ifpb.exemplo.exceptions.ValorNegativoException;
import com.ifpb.exemplo.model.ContaCorrente;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1,
                "João");

        try {
            contaCorrente.depositar(-10);
        } catch (ValorNegativoException e) {

            ImageIcon icone = new ImageIcon("pessoa.png");

            JOptionPane.showMessageDialog(null,
                    e.getMessage(), "Mensagem de erro",
                    JOptionPane.ERROR_MESSAGE, icone);

        } catch (LimiteExcedidoException e) {
            e.printStackTrace();
        }


    }

}