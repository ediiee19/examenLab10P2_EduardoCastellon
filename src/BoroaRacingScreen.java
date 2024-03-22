
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BoroaRacingScreen extends javax.swing.JFrame {

    public ArrayList<Carro> carros;

    public Carro j1;
    public Carro j2;
    public String j1Name, j2Name;

    //numero de silla 12 mesa 2
    public BoroaRacingScreen() {
        initComponents();
        inicializarCarros();
        escribir();

        setimageLabel(LB_track, "src/imagenes/background 1.png");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DG_carCreate = new javax.swing.JDialog();
        LB_creatPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_modelo = new javax.swing.JTextField();
        TF_marca = new javax.swing.JTextField();
        SP_velocidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        BT_crear = new javax.swing.JButton();
        Lb_valiCrear = new javax.swing.JLabel();
        BT_salirCreate = new javax.swing.JButton();
        DG_tracks = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        CB_jugador2 = new javax.swing.JComboBox<>();
        CB_jugador1 = new javax.swing.JComboBox<>();
        BT_iniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BT_salirTracks = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LB_jug1Velocidad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LB_jug2Velocidad = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LB_jug1Modelo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LB_jug1Marca = new javax.swing.JLabel();
        LB_jug2Marca = new javax.swing.JLabel();
        LB_jug2Modelo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        DG_tracksGame = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        PN_gamePanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        LB_timer = new javax.swing.JLabel();
        LB_timer1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        PB_jug2 = new javax.swing.JProgressBar();
        PB_jug1 = new javax.swing.JProgressBar();
        BT_PlayThread = new javax.swing.JButton();
        LB_jug2Name = new javax.swing.JLabel();
        BT_salirGame = new javax.swing.JButton();
        LB_jug1Name = new javax.swing.JLabel();
        PN_gameMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LB_track = new javax.swing.JLabel();
        BT_play = new javax.swing.JButton();
        BT_crearCarro1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        BT_salir = new javax.swing.JButton();

        DG_carCreate.setUndecorated(true);

        LB_creatPanel.setBackground(new java.awt.Color(255, 255, 255));
        LB_creatPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carDisp.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        LB_creatPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 180));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LB_creatPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Velovcidad:");
        LB_creatPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Marca:");
        LB_creatPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 80, -1));
        LB_creatPanel.add(TF_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 300, -1));
        LB_creatPanel.add(TF_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 300, -1));
        LB_creatPanel.add(SP_velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Modelo:");
        LB_creatPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 90, -1));

        BT_crear.setBackground(new java.awt.Color(204, 0, 0));
        BT_crear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_crear.setForeground(new java.awt.Color(255, 255, 255));
        BT_crear.setText("Crear");
        BT_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_crearMouseClicked(evt);
            }
        });
        LB_creatPanel.add(BT_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 100, -1));

        Lb_valiCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lb_valiCrear.setForeground(new java.awt.Color(204, 0, 0));
        LB_creatPanel.add(Lb_valiCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 130, 20));

        BT_salirCreate.setBackground(new java.awt.Color(204, 0, 0));
        BT_salirCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_salirCreate.setForeground(new java.awt.Color(255, 255, 255));
        BT_salirCreate.setText("Salir");
        BT_salirCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_salirCreateMouseClicked(evt);
            }
        });
        LB_creatPanel.add(BT_salirCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 100, -1));

        javax.swing.GroupLayout DG_carCreateLayout = new javax.swing.GroupLayout(DG_carCreate.getContentPane());
        DG_carCreate.getContentPane().setLayout(DG_carCreateLayout);
        DG_carCreateLayout.setHorizontalGroup(
            DG_carCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_creatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_carCreateLayout.setVerticalGroup(
            DG_carCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_creatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        DG_tracks.setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 530, -1));

        CB_jugador2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_jugador2ItemStateChanged(evt);
            }
        });
        jPanel8.add(CB_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 174, 205, -1));

        CB_jugador1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_jugador1ItemStateChanged(evt);
            }
        });
        jPanel8.add(CB_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, 205, -1));

        BT_iniciar.setBackground(new java.awt.Color(204, 0, 0));
        BT_iniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        BT_iniciar.setText("Iniciar");
        BT_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_iniciarMouseClicked(evt);
            }
        });
        jPanel8.add(BT_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("VS");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        BT_salirTracks.setBackground(new java.awt.Color(204, 0, 0));
        BT_salirTracks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_salirTracks.setForeground(new java.awt.Color(255, 255, 255));
        BT_salirTracks.setText("Salir");
        BT_salirTracks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_salirTracksMouseClicked(evt);
            }
        });
        jPanel8.add(BT_salirTracks, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Jugador 2");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Jugador 1");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Marca:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 80, -1));

        LB_jug1Velocidad.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LB_jug1Velocidad.setForeground(new java.awt.Color(0, 0, 0));
        LB_jug1Velocidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(LB_jug1Velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Modelo:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 90, -1));

        LB_jug2Velocidad.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LB_jug2Velocidad.setForeground(new java.awt.Color(0, 0, 0));
        LB_jug2Velocidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(LB_jug2Velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 200, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Velovcidad:");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        LB_jug1Modelo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LB_jug1Modelo.setForeground(new java.awt.Color(0, 0, 0));
        LB_jug1Modelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(LB_jug1Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 200, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Marca:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, -1));

        LB_jug1Marca.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LB_jug1Marca.setForeground(new java.awt.Color(0, 0, 0));
        LB_jug1Marca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(LB_jug1Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 40));

        LB_jug2Marca.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LB_jug2Marca.setForeground(new java.awt.Color(0, 0, 0));
        LB_jug2Marca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(LB_jug2Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 200, 40));

        LB_jug2Modelo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LB_jug2Modelo.setForeground(new java.awt.Color(0, 0, 0));
        LB_jug2Modelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(LB_jug2Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 200, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Modelo:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Velovcidad:");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 630));

        javax.swing.GroupLayout DG_tracksLayout = new javax.swing.GroupLayout(DG_tracks.getContentPane());
        DG_tracks.getContentPane().setLayout(DG_tracksLayout);
        DG_tracksLayout.setHorizontalGroup(
            DG_tracksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_tracksLayout.setVerticalGroup(
            DG_tracksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DG_tracksGame.setUndecorated(true);

        PN_gamePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));

        LB_timer.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        LB_timer.setText("Timer");

        LB_timer1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        LB_timer1.setText("Timer:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(LB_timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_timer)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_timer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 410, 80));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("PROGRESSO");
        jPanel14.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        jPanel14.add(PB_jug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 30));
        jPanel14.add(PB_jug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 30));

        BT_PlayThread.setBackground(new java.awt.Color(204, 0, 0));
        BT_PlayThread.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_PlayThread.setForeground(new java.awt.Color(255, 255, 255));
        BT_PlayThread.setText("Iniciar");
        BT_PlayThread.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_PlayThreadMouseClicked(evt);
            }
        });
        jPanel14.add(BT_PlayThread, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 100, -1));

        LB_jug2Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LB_jug2Name.setText("Jugador 2");
        jPanel14.add(LB_jug2Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 230, -1));

        BT_salirGame.setBackground(new java.awt.Color(204, 0, 0));
        BT_salirGame.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_salirGame.setForeground(new java.awt.Color(255, 255, 255));
        BT_salirGame.setText("Salir");
        BT_salirGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_salirGameMouseClicked(evt);
            }
        });
        jPanel14.add(BT_salirGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 100, -1));

        LB_jug1Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LB_jug1Name.setText("Jugador 1");
        jPanel14.add(LB_jug1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 230, -1));

        javax.swing.GroupLayout PN_gamePanelLayout = new javax.swing.GroupLayout(PN_gamePanel);
        PN_gamePanel.setLayout(PN_gamePanelLayout);
        PN_gamePanelLayout.setHorizontalGroup(
            PN_gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_gamePanelLayout.createSequentialGroup()
                .addGroup(PN_gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PN_gamePanelLayout.setVerticalGroup(
            PN_gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_gamePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(PN_gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DG_tracksGameLayout = new javax.swing.GroupLayout(DG_tracksGame.getContentPane());
        DG_tracksGame.getContentPane().setLayout(DG_tracksGameLayout);
        DG_tracksGameLayout.setHorizontalGroup(
            DG_tracksGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_tracksGameLayout.setVerticalGroup(
            DG_tracksGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PN_gameMenu.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 60));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Boroa Racing");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 240, 80));
        jPanel6.add(LB_track, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 190));

        BT_play.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BT_play.setForeground(new java.awt.Color(204, 0, 0));
        BT_play.setText("Competir");
        BT_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_playMouseClicked(evt);
            }
        });
        jPanel6.add(BT_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, 30));

        BT_crearCarro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BT_crearCarro1.setForeground(new java.awt.Color(204, 0, 0));
        BT_crearCarro1.setText("Craer Carro");
        BT_crearCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_crearCarro1ActionPerformed(evt);
            }
        });
        jPanel6.add(BT_crearCarro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, 30));

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 480, 10));

        BT_salir.setBackground(new java.awt.Color(204, 0, 0));
        BT_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_salir.setForeground(new java.awt.Color(255, 255, 255));
        BT_salir.setText("Salir");
        BT_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_salirMouseClicked(evt);
            }
        });
        jPanel6.add(BT_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 120, 30));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 500, 540));

        javax.swing.GroupLayout PN_gameMenuLayout = new javax.swing.GroupLayout(PN_gameMenu);
        PN_gameMenu.setLayout(PN_gameMenuLayout);
        PN_gameMenuLayout.setHorizontalGroup(
            PN_gameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PN_gameMenuLayout.setVerticalGroup(
            PN_gameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_gameMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_gameMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_crearMouseClicked
        crearCarro();
    }//GEN-LAST:event_BT_crearMouseClicked

    private void BT_crearCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_crearCarro1ActionPerformed
        this.setVisible(false);
        DG_carCreate.pack();
        DG_carCreate.setLocationRelativeTo(this);
        DG_carCreate.setModal(true);
        DG_carCreate.setVisible(true);
    }//GEN-LAST:event_BT_crearCarro1ActionPerformed

    private void BT_salirCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_salirCreateMouseClicked
        DG_carCreate.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_BT_salirCreateMouseClicked

    private void BT_salirTracksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_salirTracksMouseClicked
        DG_tracks.setVisible(false);
        this.pack();
        resetboxes();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_BT_salirTracksMouseClicked

    private void BT_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_iniciarMouseClicked
        if (CB_jugador1.getSelectedItem() != null && CB_jugador2.getSelectedItem() != null) {
            DG_tracks.setVisible(false);
            DG_tracksGame.pack();
            DG_tracksGame.setLocationRelativeTo(this);

            j1 = (Carro) CB_jugador1.getSelectedItem();
            j2 = (Carro) CB_jugador2.getSelectedItem();

            LB_jug1Name.setText(j1.toString());
            LB_jug2Name.setText(j2.toString());

            DG_tracksGame.setModal(true);
            DG_tracksGame.setVisible(true);
        }
    }//GEN-LAST:event_BT_iniciarMouseClicked

    private void BT_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_playMouseClicked
        this.setVisible(false);
        DG_tracks.pack();
        DG_tracks.setLocationRelativeTo(this);
        inicializarBoxes();
        DG_tracks.setModal(true);
        DG_tracks.setVisible(true);
    }//GEN-LAST:event_BT_playMouseClicked

    private void CB_jugador1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_jugador1ItemStateChanged
        if (CB_jugador1.getSelectedItem() != null) {
            Carro temp = (Carro) CB_jugador1.getSelectedItem();
            LB_jug1Marca.setText(temp.getMarca());
            LB_jug1Modelo.setText(temp.getModelo());
            String velocidad = "";
            int num = temp.getVelocidad();
            velocidad += num;
            LB_jug1Velocidad.setText(velocidad);
        }
    }//GEN-LAST:event_CB_jugador1ItemStateChanged

    private void CB_jugador2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_jugador2ItemStateChanged
        if (CB_jugador2.getSelectedItem() != null) {
            Carro temp = (Carro) CB_jugador2.getSelectedItem();
            LB_jug2Marca.setText(temp.getMarca());
            LB_jug2Modelo.setText(temp.getModelo());
            String velocidad = "";
            int num = temp.getVelocidad();
            velocidad += num;
            LB_jug2Velocidad.setText(velocidad);
        }
    }//GEN-LAST:event_CB_jugador2ItemStateChanged

    private void BT_PlayThreadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_PlayThreadMouseClicked
        race(j1, j2);
    }//GEN-LAST:event_BT_PlayThreadMouseClicked

    private void BT_salirGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_salirGameMouseClicked
        DG_tracksGame.setVisible(false);
        this.pack();
        resetboxes();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_BT_salirGameMouseClicked

    private void BT_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BT_salirMouseClicked

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
            java.util.logging.Logger.getLogger(BoroaRacingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoroaRacingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoroaRacingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoroaRacingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoroaRacingScreen().setVisible(true);
            }
        });
    }

    public void race(Carro j1, Carro j2) {

        RaceThread race = new RaceThread(PN_gameMenu,
                j1.getVelocidad(), j2.getVelocidad(),
                PB_jug1, PB_jug2,
                LB_timer);
        Thread r = new Thread(race);
        r.start();
        
        

    }

    public void escribir() {
        for (Carro carro : carros) {
            System.out.println(carro.toString());
        }
    }

    public void resetboxes() {
        DefaultComboBoxModel jug1Model = (DefaultComboBoxModel) CB_jugador1.getModel();
        DefaultComboBoxModel jug2Model = (DefaultComboBoxModel) CB_jugador2.getModel();

        jug1Model.removeAllElements();
        jug2Model.removeAllElements();

        CB_jugador1.setModel(jug1Model);
        CB_jugador2.setModel(jug2Model);
    }

    public void inicializarBoxes() {
        DefaultComboBoxModel jug1Model = (DefaultComboBoxModel) CB_jugador1.getModel();
        DefaultComboBoxModel jug2Model = (DefaultComboBoxModel) CB_jugador2.getModel();

        for (Carro carro : carros) {
            jug1Model.addElement(carro);
            jug2Model.addElement(carro);
        }

        CB_jugador1.setModel(jug1Model);
        CB_jugador2.setModel(jug2Model);
    }

    public void crearCarro() {

        Carro nuevoCarro = new Carro(
                TF_marca.getText(), TF_modelo.getText(), (int) SP_velocidad.getValue());

        AdminCarro administrador = new AdminCarro("./carros.cbm");
        administrador.cargarArchivo();
        administrador.addCarro(nuevoCarro);
        administrador.escribirArchivo();
        carros.add(nuevoCarro);

        Lb_valiCrear.setText("Creacion exitosa!");
        System.out.println("");
        TF_marca.setText("");
        TF_modelo.setText("");
        SP_velocidad.setValue(0);

    }

    public void inicializarCarros() {
        carros = new ArrayList();
        AdminCarro administrador = new AdminCarro("./carros.cbm");
        administrador.cargarArchivo();
        carros = administrador.getListaCarros();
    }

    public void setimageLabel(JLabel nomLabel, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nomLabel.getWidth(), nomLabel.getHeight(), Image.SCALE_DEFAULT));
        nomLabel.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_PlayThread;
    private javax.swing.JButton BT_crear;
    private javax.swing.JButton BT_crearCarro1;
    private javax.swing.JButton BT_iniciar;
    private javax.swing.JButton BT_play;
    private javax.swing.JButton BT_salir;
    private javax.swing.JButton BT_salirCreate;
    private javax.swing.JButton BT_salirGame;
    private javax.swing.JButton BT_salirTracks;
    private javax.swing.JComboBox<String> CB_jugador1;
    private javax.swing.JComboBox<String> CB_jugador2;
    private javax.swing.JDialog DG_carCreate;
    private javax.swing.JDialog DG_tracks;
    private javax.swing.JDialog DG_tracksGame;
    private javax.swing.JPanel LB_creatPanel;
    private javax.swing.JLabel LB_jug1Marca;
    private javax.swing.JLabel LB_jug1Modelo;
    private javax.swing.JLabel LB_jug1Name;
    private javax.swing.JLabel LB_jug1Velocidad;
    private javax.swing.JLabel LB_jug2Marca;
    private javax.swing.JLabel LB_jug2Modelo;
    private javax.swing.JLabel LB_jug2Name;
    private javax.swing.JLabel LB_jug2Velocidad;
    private javax.swing.JLabel LB_timer;
    private javax.swing.JLabel LB_timer1;
    private javax.swing.JLabel LB_track;
    private javax.swing.JLabel Lb_valiCrear;
    private javax.swing.JProgressBar PB_jug1;
    private javax.swing.JProgressBar PB_jug2;
    private javax.swing.JPanel PN_gameMenu;
    private javax.swing.JPanel PN_gamePanel;
    private javax.swing.JSpinner SP_velocidad;
    private javax.swing.JTextField TF_marca;
    private javax.swing.JTextField TF_modelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
