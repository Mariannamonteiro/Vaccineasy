package com.usjt.projeto.vaccineasy.GUI;

import com.usjt.projeto.vaccineasy.dao.EnderecoDao;
import com.usjt.projeto.vaccineasy.dao.PacienteDao;
import com.usjt.projeto.vaccineasy.dao.UsuarioDao;
import javax.swing.JOptionPane;

public class TelaCadastroPaciente extends javax.swing.JFrame {

    String nomeUser = "";

    public TelaCadastroPaciente(String nome) {
        initComponents();
        nomeUser = nome;
        setLocationRelativeTo(null);
    }

    public TelaCadastroPaciente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrarPaciente = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbbProfissaoSaude = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(152, 220, 196));

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("SEJA BEM-VINDO A NOSSA FILA!");

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Por favor, insira seus dados nos campos ao lado.");

        jLabel39.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Para continuar conectado conosco:");

        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("*Preenchimento obrigatório");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(25, 25, 25)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addGap(27, 27, 27)
                .addComponent(jLabel40)
                .addGap(257, 257, 257))
        );

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtNome.setForeground(new java.awt.Color(51, 51, 51));

        txtCpf.setBackground(new java.awt.Color(204, 204, 204));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(51, 51, 51));

        txtIdade.setBackground(new java.awt.Color(204, 204, 204));
        txtIdade.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(51, 51, 51));

        txtEndereco.setBackground(new java.awt.Color(204, 204, 204));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(51, 51, 51));

        txtComplemento.setBackground(new java.awt.Color(204, 204, 204));
        txtComplemento.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtComplemento.setForeground(new java.awt.Color(51, 51, 51));

        btnCancelar.setBackground(new java.awt.Color(152, 220, 196));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Logoff");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrarPaciente.setBackground(new java.awt.Color(152, 220, 196));
        btnCadastrarPaciente.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnCadastrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarPaciente.setText("Cadastrar");
        btnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacienteActionPerformed(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(51, 51, 51));

        jLabel43.setText("Nome:");

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\re041629\\Documents\\NetBeansProjects\\Vaccineasy\\src\\main\\java\\com\\usjt\\projeto\\vaccineasy\\GUI\\Java_logo_icon.png")); // NOI18N
        jLabel44.setText("jLabel44");

        jLabel1.setText("CPF:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Complemento:");

        jLabel5.setText("Fone:");

        txtTelefone.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setText("Senha:");

        cbbProfissaoSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        cbbProfissaoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbProfissaoSaudeActionPerformed(evt);
            }
        });

        jLabel6.setText("Profissão Saúde:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel41))
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbbProfissaoSaude, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(14, 14, 14)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbProfissaoSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbProfissaoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbProfissaoSaudeActionPerformed

    }//GEN-LAST:event_cbbProfissaoSaudeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        //se estiver logado voltar para o painel 
        // se for direto da index, voltar para index;      
        this.dispose();
        Index index = new Index();
        index.setVisible(true);


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacienteActionPerformed

        try {

            // chamar método que cadastra paciente
            //armazenar campos nas variaveis
            String nome = txtNome.getText();
            String telefone = txtTelefone.getText();
            String cpf = txtCpf.getText();
            int idade = Integer.parseInt(txtIdade.getText());
            String endereco = txtEndereco.getText();
            String complemento = txtComplemento.getText();
            String senha = txtSenha.getText();
            String profissao = cbbProfissaoSaude.getSelectedItem() + "";
            String perfil = "Paciente";
            boolean profissaoSaude;

            UsuarioDao userDao = new UsuarioDao();
            EnderecoDao enderecoDao = new EnderecoDao();
            PacienteDao pacienteDao = new PacienteDao();

            //Primeiro verificar se cpf ja existe 
            boolean existe = userDao.existe(cpf);

            if (existe == true) {
                // cpf já existe
                //limpar campos
                //redireccionar tela

                limpaCampos();
                JOptionPane.showMessageDialog(null, "CPF já cadastrado no sistema", "ALERTA", JOptionPane.ERROR_MESSAGE);

            } else {
                // cpf não existe
                //criar um paciente no sistema.

                //verificar se paciente trabalha na área da saúde
                if (profissao.equals("Não")) {
                    profissaoSaude = false;
                } else {
                    profissaoSaude = true;
                }

                int id_usuario = userDao.create(nome, cpf, senha, perfil);

                int idEndereco = enderecoDao.create(endereco, complemento);

                String retorno = pacienteDao.create(id_usuario, nome, cpf, idade, telefone, idEndereco, profissaoSaude);

                limpaCampos();
                JOptionPane.showMessageDialog(null, retorno);

                if (nomeUser.equals("")) {
                    this.dispose();
                    Index index = new Index();
                    index.setVisible(true);

                } else {
                    this.dispose();
                    TelaAdministrador tela = new TelaAdministrador();
                    tela.setVisible(true);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnCadastrarPacienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaCadastroPaciente().setVisible(true);
            }
        });
    }

    public void limpaCampos() {
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtIdade.setText("");
        txtEndereco.setText("");
        txtComplemento.setText("");
        txtSenha.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPaciente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbbProfissaoSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
