package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {
    private boolean xTurn = true;
    private JButton[] buttons = new JButton[9];

    public Game() {
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(new ButtonListener());
            this.add(buttons[i]);
            buttons[i].setText(Integer.toString(i + 1));
        }
    }

    private class ButtonListener implements ActionListener {
        private int row;
        private int column;

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton clickedButton = (JButton) event.getSource();
            if (clickedButton.getText() != "X" && clickedButton.getText() != "O") {
                if (xTurn) {
                    clickedButton.setText("X");
                    xTurn = false;
                } else {
                    clickedButton.setText("O");
                    xTurn = true;
                }
                checkForWin();
            }
        }

        private void colorChange() {
            JFrame frame = new SetBackgroundColorInJLabel();
            JFrame.setBackground(Color.GREEN);

        }

        private void checkForWin() {
            checkThree(0, 1, 2);
            checkThree(3, 4, 5);
            checkThree(6, 7, 8);
            checkThree(0, 3, 6);
            checkThree(1, 4, 7);
            checkThree(2, 5, 8);
            checkThree(0, 4, 8);
            checkThree(2, 4, 6);
        }

        private void checkThree(int a, int b, int c) {
            if (buttons[a].getText() == buttons[b].getText() && buttons[a].getText() == buttons[c].getText()) {
                System.out.println("Win");

            }
                        if ((buttons[row][column] == 'X') && (buttons[row][column] == 'O')) {
                            System.out.println("Cats game");
                        }
                    }
                }
            }
        