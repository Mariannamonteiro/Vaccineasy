package com.usjt.projeto.vaccineasy.GUI;

public class TelaAdministrador extends javax.swing.JFrame {

    public TelaAdministrador() {

        initComponents();
        setLocationRelativeTo(null);
    }

    String nome;

    public TelaAdministrador(String nomeUser) {

        initComponents();
        lblNomeUser.setText("Seja Bem Vindo(a) " + nomeUser);
        nome = nomeUser;
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblNomeUser = new javax.swing.JLabel();
        lblOpcao = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnCadastrarPaciente = new javax.swing.JButton();
        btnRemoverUser = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(152, 220, 196));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\re041629\\Documents\\NetBeansProjects\\Vaccineasy\\src\\main\\java\\com\\usjt\\projeto\\vaccineasy\\GUI\\Java_logo_icon.png")); // NOI18N

        lblNomeUser.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNomeUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUser.setText("Seja bem-vindo(a) Marianna Monteiro!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(logo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblNomeUser)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(lblNomeUser)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        lblOpcao.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblOpcao.setForeground(new java.awt.Color(102, 102, 102));
        lblOpcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpcao.setText("Selecione a opção desejada:");

        btnCadastrarUsuario.setBackground(new java.awt.Color(152, 220, 196));
        btnCadastrarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarUsuario.setText("Cadastrar Usuários");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarPaciente.setBackground(new java.awt.Color(152, 220, 196));
        btnCadastrarPaciente.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnCadastrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarPaciente.setText("Cadastrar Paciente");
        btnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacienteActionPerformed(evt);
            }
        });

        btnRemoverUser.setBackground(new java.awt.Color(152, 220, 196));
        btnRemoverUser.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRemoverUser.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverUser.setText("Remover Usuários");
        btnRemoverUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUserActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setBackground(new java.awt.Color(152, 220, 196));
        btnGerarRelatorio.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarRelatorio.setText("Gerar Relatórios");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        btnsair.setBackground(new java.awt.Color(152, 220, 196));
        btnsair.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("Logoff");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRemoverUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCadastrarPaciente))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblOpcao)))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblOpcao)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacienteActionPerformed

        //chamar tela que cadastra paciente
        this.setVisible(false);
        TelaCadastroPaciente telaPaciente = new TelaCadastroPaciente(nome);
        telaPaciente.setVisible(true);


    }//GEN-LAST:event_btnCadastrarPacienteActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed

        //Cadastrar usuários, chamar tela 
        this.setVisible(false);
        TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
        telaCadastroUsuario.setVisible(true);

    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed

        this.dispose();
        TelaGeraRelatorio telaRelatorio = new TelaGeraRelatorio();
        telaRelatorio.setVisible(true);

    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void btnRemoverUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUserActionPerformed

        // remover usuário, puxar uma lista de todos os usuarios no sistema 
        // (Atendente ou Adm), colocar um botão para exlui-lo.
        this.dispose();
        TelaRemoverUsers telaRemover = new TelaRemoverUsers();
        telaRemover.setVisible(true);


    }//GEN-LAST:event_btnRemoverUserActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed

        this.dispose();
        Index index = new Index();
        index.setVisible(true);


    }//GEN-LAST:event_btnsairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPaciente;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnRemoverUser;
    private javax.swing.JButton btnsair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JLabel lblOpcao;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
