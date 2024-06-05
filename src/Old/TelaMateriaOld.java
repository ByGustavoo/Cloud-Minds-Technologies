/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Old;

import Visual.TelaInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class TelaMateriaOld extends javax.swing.JFrame {

  
    public TelaMateriaOld() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoSalvar4 = new javax.swing.JButton();
        PainelPrincipal = new javax.swing.JPanel();
        PainelTela = new javax.swing.JPanel();
        CampoUsuarioTelaLogin3 = new javax.swing.JTextField();
        PainelTela1 = new javax.swing.JPanel();
        PainelRoxoParteCima1 = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JLabel();
        imagemLogoBrancaTelaInicial = new javax.swing.JLabel();
        textoNomeEmpresaTelaInicial = new javax.swing.JLabel();
        subtituloEmpresaTelaInicial = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JLabel();
        TituloCurso = new javax.swing.JLabel();
        CampoCurso = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        TituloMateria = new javax.swing.JLabel();
        CampoMateria = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TituloPeriodo = new javax.swing.JLabel();
        CampoPeriodo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        TituloCargaHoraria = new javax.swing.JLabel();
        CampoCargaHoraria = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        CampoSemestre = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        TituloSemestre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        BotaoSalvar = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();

        BotaoSalvar4.setBackground(new java.awt.Color(153, 51, 255));
        BotaoSalvar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoSalvar4.setForeground(new java.awt.Color(153, 51, 255));
        BotaoSalvar4.setText("Salvar");
        BotaoSalvar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        BotaoSalvar4.setContentAreaFilled(false);
        BotaoSalvar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelTela.setBackground(new java.awt.Color(255, 255, 255));

        CampoUsuarioTelaLogin3.setBackground(new java.awt.Color(255, 255, 255));
        CampoUsuarioTelaLogin3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoUsuarioTelaLogin3.setForeground(new java.awt.Color(0, 0, 0));
        CampoUsuarioTelaLogin3.setBorder(null);

        PainelTela1.setBackground(new java.awt.Color(255, 255, 255));

        PainelRoxoParteCima1.setBackground(new java.awt.Color(153, 51, 255));

        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BotaoVoltarBranco.png"))); // NOI18N
        BotaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseClicked(evt);
            }
        });

        imagemLogoBrancaTelaInicial.setBackground(new java.awt.Color(255, 255, 255));
        imagemLogoBrancaTelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        imagemLogoBrancaTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagemLogoBranca.png"))); // NOI18N

        textoNomeEmpresaTelaInicial.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoNomeEmpresaTelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        textoNomeEmpresaTelaInicial.setText("Cloud Minds Technologies");

        subtituloEmpresaTelaInicial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subtituloEmpresaTelaInicial.setForeground(new java.awt.Color(204, 204, 204));
        subtituloEmpresaTelaInicial.setText("Construindo pontes para o futuro digital");

        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImagemBotaoFechar.png"))); // NOI18N
        BotaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelRoxoParteCima1Layout = new javax.swing.GroupLayout(PainelRoxoParteCima1);
        PainelRoxoParteCima1.setLayout(PainelRoxoParteCima1Layout);
        PainelRoxoParteCima1Layout.setHorizontalGroup(
            PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRoxoParteCima1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoVoltar)
                .addGap(27, 27, 27)
                .addComponent(imagemLogoBrancaTelaInicial)
                .addGroup(PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRoxoParteCima1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSair)
                        .addGap(14, 14, 14))
                    .addGroup(PainelRoxoParteCima1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtituloEmpresaTelaInicial)
                            .addComponent(textoNomeEmpresaTelaInicial))
                        .addContainerGap(468, Short.MAX_VALUE))))
        );
        PainelRoxoParteCima1Layout.setVerticalGroup(
            PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRoxoParteCima1Layout.createSequentialGroup()
                .addGroup(PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelRoxoParteCima1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelRoxoParteCima1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(textoNomeEmpresaTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtituloEmpresaTelaInicial))
                            .addComponent(imagemLogoBrancaTelaInicial)))
                    .addGroup(PainelRoxoParteCima1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelRoxoParteCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoVoltar)
                            .addComponent(BotaoSair))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TituloCurso.setBackground(new java.awt.Color(153, 51, 255));
        TituloCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloCurso.setForeground(new java.awt.Color(153, 51, 255));
        TituloCurso.setText("Curso");

        CampoCurso.setBackground(new java.awt.Color(255, 255, 255));
        CampoCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoCurso.setForeground(new java.awt.Color(153, 51, 255));
        CampoCurso.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator5.setForeground(new java.awt.Color(153, 51, 255));

        TituloMateria.setBackground(new java.awt.Color(153, 51, 255));
        TituloMateria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloMateria.setForeground(new java.awt.Color(153, 51, 255));
        TituloMateria.setText("Matéria");

        CampoMateria.setBackground(new java.awt.Color(255, 255, 255));
        CampoMateria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoMateria.setForeground(new java.awt.Color(153, 51, 255));
        CampoMateria.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator6.setForeground(new java.awt.Color(153, 51, 255));

        TituloPeriodo.setBackground(new java.awt.Color(153, 51, 255));
        TituloPeriodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloPeriodo.setForeground(new java.awt.Color(153, 51, 255));
        TituloPeriodo.setText("Período");

        CampoPeriodo.setBackground(new java.awt.Color(255, 255, 255));
        CampoPeriodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoPeriodo.setForeground(new java.awt.Color(153, 51, 255));
        CampoPeriodo.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator7.setForeground(new java.awt.Color(153, 51, 255));

        TituloCargaHoraria.setBackground(new java.awt.Color(153, 51, 255));
        TituloCargaHoraria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloCargaHoraria.setForeground(new java.awt.Color(153, 51, 255));
        TituloCargaHoraria.setText("Carga Horária");

        CampoCargaHoraria.setBackground(new java.awt.Color(255, 255, 255));
        CampoCargaHoraria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoCargaHoraria.setForeground(new java.awt.Color(153, 51, 255));
        CampoCargaHoraria.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator8.setForeground(new java.awt.Color(153, 51, 255));

        CampoSemestre.setBackground(new java.awt.Color(255, 255, 255));
        CampoSemestre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoSemestre.setForeground(new java.awt.Color(153, 51, 255));
        CampoSemestre.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator9.setForeground(new java.awt.Color(153, 51, 255));

        TituloSemestre.setBackground(new java.awt.Color(153, 51, 255));
        TituloSemestre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloSemestre.setForeground(new java.awt.Color(153, 51, 255));
        TituloSemestre.setText("Semestre");

        Tabela.setBackground(new java.awt.Color(255, 255, 255));
        Tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        Tabela.setForeground(new java.awt.Color(255, 255, 255));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Curso", "Matéria", "Período"
            }
        ));
        jScrollPane1.setViewportView(Tabela);
        if (Tabela.getColumnModel().getColumnCount() > 0) {
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        BotaoSalvar.setBackground(new java.awt.Color(153, 51, 255));
        BotaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoSalvar.setForeground(new java.awt.Color(153, 51, 255));
        BotaoSalvar.setText("Salvar");
        BotaoSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        BotaoSalvar.setContentAreaFilled(false);
        BotaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoEditar.setBackground(new java.awt.Color(153, 51, 255));
        BotaoEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoEditar.setForeground(new java.awt.Color(153, 51, 255));
        BotaoEditar.setText("Editar");
        BotaoEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        BotaoEditar.setContentAreaFilled(false);
        BotaoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoExcluir.setBackground(new java.awt.Color(153, 51, 255));
        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(153, 51, 255));
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        BotaoExcluir.setContentAreaFilled(false);
        BotaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoLimpar.setBackground(new java.awt.Color(153, 51, 255));
        BotaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoLimpar.setForeground(new java.awt.Color(153, 51, 255));
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        BotaoLimpar.setContentAreaFilled(false);
        BotaoLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PainelTela1Layout = new javax.swing.GroupLayout(PainelTela1);
        PainelTela1.setLayout(PainelTela1Layout);
        PainelTela1Layout.setHorizontalGroup(
            PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTela1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(TituloPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelTela1Layout.createSequentialGroup()
                        .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CampoCargaHoraria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloCargaHoraria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloSemestre)
                            .addComponent(CampoSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                    .addGroup(PainelTela1Layout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator9))
                    .addComponent(jSeparator5)
                    .addComponent(CampoMateria)
                    .addComponent(CampoPeriodo)
                    .addComponent(BotaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelTela1Layout.createSequentialGroup()
                        .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(PainelTela1Layout.createSequentialGroup()
                .addComponent(PainelRoxoParteCima1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        PainelTela1Layout.setVerticalGroup(
            PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTela1Layout.createSequentialGroup()
                .addComponent(PainelRoxoParteCima1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelTela1Layout.createSequentialGroup()
                        .addComponent(TituloCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(TituloMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(TituloPeriodo)
                        .addGap(12, 12, 12)
                        .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TituloCargaHoraria)
                            .addComponent(TituloSemestre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(PainelTela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelTelaLayout = new javax.swing.GroupLayout(PainelTela);
        PainelTela.setLayout(PainelTelaLayout);
        PainelTelaLayout.setHorizontalGroup(
            PainelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTelaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(CampoUsuarioTelaLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelTelaLayout.createSequentialGroup()
                .addComponent(PainelTela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelTelaLayout.setVerticalGroup(
            PainelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTelaLayout.createSequentialGroup()
                .addComponent(PainelTela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoUsuarioTelaLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelPrincipal.add(PainelTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        if (CampoCurso.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o nome do Curso!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else if (CampoMateria.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o nome da Matéria!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else if (CampoPeriodo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o Período!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else if (CampoCargaHoraria.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite a Carga Horária!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else if (CampoSemestre.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o Semestre!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Informações salvas com sucesso!", "Dados Enviados!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotaoSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMateriaOld().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JLabel BotaoSair;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoSalvar4;
    private javax.swing.JLabel BotaoVoltar;
    private javax.swing.JTextField CampoCargaHoraria;
    private javax.swing.JTextField CampoCurso;
    private javax.swing.JTextField CampoMateria;
    private javax.swing.JTextField CampoPeriodo;
    private javax.swing.JTextField CampoSemestre;
    private javax.swing.JTextField CampoUsuarioTelaLogin3;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelRoxoParteCima1;
    private javax.swing.JPanel PainelTela;
    private javax.swing.JPanel PainelTela1;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel TituloCargaHoraria;
    private javax.swing.JLabel TituloCurso;
    private javax.swing.JLabel TituloMateria;
    private javax.swing.JLabel TituloPeriodo;
    private javax.swing.JLabel TituloSemestre;
    private javax.swing.JLabel imagemLogoBrancaTelaInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel subtituloEmpresaTelaInicial;
    private javax.swing.JLabel textoNomeEmpresaTelaInicial;
    // End of variables declaration//GEN-END:variables
}
