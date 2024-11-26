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
        // Usando GroupLayout para um layout mais organizado
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel userLabel = new JLabel("Usuário:");
        JTextField userText = new JTextField(20);

        JLabel passwordLabel = new JLabel("Senha:");
        JPasswordField passwordText = new JPasswordField(20);

        JButton loginButton = new JButton("Login");

        // Adiciona ação ao botão de login
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

        // Define alinhamento horizontal e vertical
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(userLabel)
                                        .addComponent(passwordLabel))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(userText)
                                        .addComponent(passwordText)))
                        .addComponent(loginButton)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(userLabel)
                                .addComponent(userText))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordLabel)
                                .addComponent(passwordText))
                        .addComponent(loginButton)
        );
    }

    private static void openMainScreen() {
        JFrame mainFrame = new JFrame("Sistema de Gestão de Construtora");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLocationRelativeTo(null);

        JButton button = new JButton("Criar Projeto");
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "A tela de projetos será aberta aqui!");
        });

        JPanel panel = new JPanel();
        panel.add(button);

        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}
