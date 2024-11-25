package view;

import javax.swing.*;

public class MainView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Gestão de Construtora - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeLoginComponents(panel, frame);

        frame.setVisible(true);
    }

    private static void placeLoginComponents(JPanel panel, JFrame frame) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(50, 50, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(150, 50, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(50, 100, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 100, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 25);
        panel.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());

            if ("admin".equals(username) && "1234".equals(password)) {
                JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                // Próxima tela
                frame.dispose();
                openMainScreen();
            } else {
                JOptionPane.showMessageDialog(frame, "Usuário ou senha inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private static void openMainScreen() {
        JFrame mainFrame = new JFrame("Sistema de Gestão de Construtora");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLocationRelativeTo(null);

        JButton button = new JButton("Abrir Funcionario");
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "A tela de funcionários será aberta aqui!");
        });

        JPanel panel = new JPanel();
        panel.add(button);

        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}