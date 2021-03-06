/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;


public class TelaCadastro extends javax.swing.JInternalFrame {
    UsuarioController usuarioController;
    ArrayList<Usuario> listaUsuario;
    Usuario usuario;
  
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        setModelo();
        limpaCampos();
        
        usuarioController = new UsuarioController();  
        listaUsuario();
        this.setSize(595,680);
        this.setLocation(80,320);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtNumeroCarteira = new javax.swing.JTextField();
        txtTipoCarteira = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastro = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Usuarios");
        setVisible(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBairroKeyTyped(evt);
            }
        });

        txtNumeroCarteira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCarteiraKeyTyped(evt);
            }
        });

        txtTipoCarteira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoCarteiraKeyTyped(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");

        tblCadastro.setFont(new java.awt.Font("Rockwell", 2, 12)); // NOI18N
        tblCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCadastro);

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
        jLabel11.setText("     Cadastro");
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 24))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Número Carteira:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("TipoCarteira:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });

        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyTyped(evt);
            }
        });

        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCidadeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(81, 81, 81)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNumeroCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addComponent(txtTipoCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCadastrar))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNumeroCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipoCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyTyped
        if (evt.getKeyChar() == 10) {
            txtNumeroCarteira.grabFocus();
        }
    }//GEN-LAST:event_txtBairroKeyTyped

    private void txtNumeroCarteiraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCarteiraKeyTyped
        if (evt.getKeyChar() == 10) {
            txtTipoCarteira.grabFocus();
        }
    }//GEN-LAST:event_txtNumeroCarteiraKeyTyped

    private void txtTipoCarteiraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoCarteiraKeyTyped
        if (evt.getKeyChar() == 10) {
            btnCadastrar.grabFocus();
        }
    }//GEN-LAST:event_txtTipoCarteiraKeyTyped

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        addUsuario();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastroMouseClicked
        carregaUsuario();
    }//GEN-LAST:event_tblCadastroMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deleteUsuario();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (evt.getKeyChar() == 10) {
            txtCpf.grabFocus();
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        if (evt.getKeyChar() == 10) {
            txtTelefone.grabFocus();
        }
    }//GEN-LAST:event_txtCpfKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        if (evt.getKeyChar() == 10) {
            txtEstado.grabFocus();
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyTyped
        if (evt.getKeyChar() == 10) {
            txtBairro.grabFocus();
        }
    }//GEN-LAST:event_txtEnderecoKeyTyped

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
 
        
    
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyTyped
       if (evt.getKeyChar() == 10) {
            txtEndereco.grabFocus();
       }
    }//GEN-LAST:event_txtCidadeKeyTyped

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        if (evt.getKeyChar() == 10) {
             txtCidade.grabFocus();
        }
    }//GEN-LAST:event_txtEstadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCadastro;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCarteira;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTipoCarteira;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo;

    private void setModelo() {

        modelo = new DefaultTableModel();
        modelo.addColumn("idusuario");
        modelo.addColumn("nome");
        modelo.addColumn("cpf");
        modelo.addColumn("telefone");
        modelo.addColumn("estado");
        modelo.addColumn("cidade");
        modelo.addColumn("endereco");
        modelo.addColumn("bairro");
        modelo.addColumn("numerocarteira");
        modelo.addColumn("tipocarteira");
        tblCadastro.setModel(modelo);

    }

    private void addUsuario() {

        /* if (txtIdUsuario.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "Campo idusuario Invalido");
         txtIdUsuario.grabFocus();
         return;
         } else*/ 
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo nome Invalido");
            txtNome.grabFocus();
            return;
        } else if (txtCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo cpf Invalido");
            txtCpf.grabFocus();
            return;
        } else if (txtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo telefone Invalido");
            txtTelefone.grabFocus();
            return;
        }else if (txtEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo estado Invalido");
            txtEstado.grabFocus();
            return;
        } else if (txtCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo cidade Invalido");
            txtEstado.grabFocus();
            return;
        } else if (txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo endereco Invalido");
            txtEndereco.grabFocus();
            return;
        } else if (txtBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo bairro Invalido");
            txtBairro.grabFocus();
            return;
        } else if (txtNumeroCarteira.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo numerocarteira Invalido");
            txtNumeroCarteira.grabFocus();
            return;
        } else if (txtTipoCarteira.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo tipocarteira Invalido");
            txtTipoCarteira.grabFocus();
            return;
        }
        if (usuario == null) {
            usuario = new Usuario();
        }

        //usuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        usuario.setNome(txtNome.getText());
        usuario.setCpf(txtCpf.getText());
        usuario.setTelefone(txtTelefone.getText());
        usuario.setEstado(txtEstado.getText());
        usuario.setCidade(txtCidade.getText());
        usuario.setEndereco(txtEndereco.getText());
        usuario.setBairro(txtBairro.getText());
        usuario.setNumeroCarteira(txtNumeroCarteira.getText());
        usuario.setTipoCarteira(txtTipoCarteira.getText());

        if (usuarioController.insereUsuario(usuario)) {
            insereTabela(usuario);
            limpaCampos();
            listaUsuario();

        }
    }

    public void insereTabela(Usuario usuario) {
        Object[] linha = new Object[10];
        linha[0] = usuario.getIdUsuario();
        linha[1] = usuario.getNome();
        linha[2] = usuario.getCpf();
        linha[3] = usuario.getTelefone();
        linha[4] = usuario.getEstado();
        linha[5] = usuario.getCidade();
        linha[6] = usuario.getEndereco();
        linha[7] = usuario.getBairro();
        linha[8] = usuario.getNumeroCarteira();
        linha[9] = usuario.getTipoCarteira();
        modelo.addRow(linha);
    }

    public void listaUsuario() {
        setModelo();
        ArrayList<Usuario> lista;
        lista = usuarioController.getUsuarios();
        for (int x = 0; x < lista.size(); x++) {
            Usuario us = lista.get(x);
            insereTabela(us);
        }
        listaUsuario = lista;
    }

    private void limpaCampos() {
        usuario = null;

        
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEstado.setText("");
        txtCidade.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtNumeroCarteira.setText("");
        txtTipoCarteira.setText("");
        txtNome.grabFocus();
    }

    private int pegaIdSelecionado() {
        int linha = tblCadastro.getSelectedRow();
        return Integer.parseInt(modelo.getValueAt(linha, 0).toString());
    }

    private void deleteUsuario() {
        int numero = pegaIdSelecionado();
        String id = null;
        JOptionPane.showMessageDialog(null, "Deletando usuario de nome: " + id);
        usuarioController.deleteUsuario(numero);
        listaUsuario();
    }

    private void carregaUsuario() {
        int id = pegaIdSelecionado();
        for (int x = 0; x < listaUsuario.size(); x++) {
            Usuario us = listaUsuario.get(x);
            if (id == us.getIdUsuario()) {

                
                txtNome.setText(us.getNome());
                txtCpf.setText(us.getCpf() + "");
                txtTelefone.setText(us.getTelefone() + "");
                txtEstado.setText(us.getEstado());
                txtCidade.setText(us.getCidade());
                txtEndereco.setText(us.getEndereco());
                txtBairro.setText(us.getBairro());
                txtNumeroCarteira.setText(us.getNumeroCarteira() + "");
                txtTipoCarteira.setText(us.getTipoCarteira());
                usuario = us;
                break;
            }
        }
    }

}

