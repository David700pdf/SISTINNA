package Vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 *
 */
public class Admin_GestionarNNA extends javax.swing.JFrame {

    public Admin_GestionarNNA() {
        initComponents();
        this.setTitle("Gestión NNA");
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        scrollPanelNNA = new javax.swing.JScrollPane();
        panelNNAGestion = new javax.swing.JPanel();
        btnPrincipal1 = new javax.swing.JButton();
        txtNombreNNA1 = new javax.swing.JTextField();
        rbtnActivo1 = new javax.swing.JRadioButton();
        rbtnInactivo1 = new javax.swing.JRadioButton();
        btnBuscar1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableGestion = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblDatosNNA = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApePaterno = new javax.swing.JLabel();
        lblApeMaterno = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblFechaNacim = new javax.swing.JLabel();
        lblMunicipioNacim = new javax.swing.JLabel();
        lblEstadoNacim = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblOrigEtnico = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApePaterno = new javax.swing.JTextField();
        txtApeMaterno = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtFechaNacim = new javax.swing.JTextField();
        comboMunicipNacim = new javax.swing.JComboBox();
        comboEstadoNacim = new javax.swing.JComboBox();
        comboNacionalidad = new javax.swing.JComboBox();
        comboOrigEtnico = new javax.swing.JComboBox();
        lblNivelCursado = new javax.swing.JLabel();
        lblPromedioObten = new javax.swing.JLabel();
        lblNomInstitucion = new javax.swing.JLabel();
        comboNivelCursado = new javax.swing.JComboBox();
        txtPromedioObten = new javax.swing.JTextField();
        txtNomInstitucion = new javax.swing.JTextField();
        lblVacuna = new javax.swing.JLabel();
        lblFechaAplicacion = new javax.swing.JLabel();
        lblDosis = new javax.swing.JLabel();
        comboVacuna = new javax.swing.JComboBox();
        txtFechaAplicacion = new javax.swing.JTextField();
        txtDosis = new javax.swing.JTextField();
        btnAgregarVacuna = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVacunas = new javax.swing.JTable();
        lblDatosPadres = new javax.swing.JLabel();
        lblPadre = new javax.swing.JLabel();
        lblNombresPadre = new javax.swing.JLabel();
        lblApePaternoPadre = new javax.swing.JLabel();
        lblApeMaternoPadre = new javax.swing.JLabel();
        lblFechaNacimPadre = new javax.swing.JLabel();
        lblMunicipioNacimPadre = new javax.swing.JLabel();
        lblEstadoNacimPadre = new javax.swing.JLabel();
        txtNombresPadre = new javax.swing.JTextField();
        txtApePaternoPadre = new javax.swing.JTextField();
        txtApeMaternoPadre = new javax.swing.JTextField();
        txtFechaNacimPadre = new javax.swing.JTextField();
        comboMunicipNacimPadre = new javax.swing.JComboBox();
        comboEstadoNacimPadre = new javax.swing.JComboBox();
        lblMadre = new javax.swing.JLabel();
        lblNombresMadre = new javax.swing.JLabel();
        lblApePaternoMadre = new javax.swing.JLabel();
        lblApeMaternoMadre = new javax.swing.JLabel();
        lblFechaNacimMadre = new javax.swing.JLabel();
        lblMunicipioNacimMadre = new javax.swing.JLabel();
        lblEstadoNacimMadre = new javax.swing.JLabel();
        txtNombresMadre = new javax.swing.JTextField();
        txtApePaternoMadre = new javax.swing.JTextField();
        txtApeMaternoMadre = new javax.swing.JTextField();
        txtFechaNacimMadre = new javax.swing.JTextField();
        comboMunicipNacimMadre = new javax.swing.JComboBox();
        comboEstadoNacimMadre = new javax.swing.JComboBox();
        lblEstadoNacimMadre1 = new javax.swing.JLabel();
        lblEstadoNacimMadre2 = new javax.swing.JLabel();
        lblNombresTutor = new javax.swing.JLabel();
        lblApePaternoTutor = new javax.swing.JLabel();
        lblApeMaternoTutor = new javax.swing.JLabel();
        lblCURPTutor = new javax.swing.JLabel();
        lblFechaNacimTutor = new javax.swing.JLabel();
        lblSexoTutor = new javax.swing.JLabel();
        lblNacionalidadTutor = new javax.swing.JLabel();
        lblNumTelefTutor = new javax.swing.JLabel();
        lblSituaSentimTutor = new javax.swing.JLabel();
        txtNombresTutor = new javax.swing.JTextField();
        txtApePaternoTutor = new javax.swing.JTextField();
        txtApeMaternoTutor = new javax.swing.JTextField();
        txtFechaNacimTutor = new javax.swing.JTextField();
        txtCurpTutor = new javax.swing.JTextField();
        txtNumTelefTutor = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox();
        comboNacionalidadTutor = new javax.swing.JComboBox();
        comboSituaSentim = new javax.swing.JComboBox();
        lblDomicilio = new javax.swing.JLabel();
        lblDireccionDomi = new javax.swing.JLabel();
        lblNumExtDomi = new javax.swing.JLabel();
        lblNumIntDomi = new javax.swing.JLabel();
        lblCpDomi = new javax.swing.JLabel();
        lblColoniaDomi = new javax.swing.JLabel();
        lblMunicipDomi = new javax.swing.JLabel();
        lblEstadoDomi = new javax.swing.JLabel();
        txtDireccionDomi = new javax.swing.JTextField();
        txtNumExtDomi = new javax.swing.JTextField();
        txtNumIntDomi = new javax.swing.JTextField();
        txtCpDomi = new javax.swing.JTextField();
        comboColoniaDomi = new javax.swing.JComboBox();
        comboMunicipDomi = new javax.swing.JComboBox();
        comboEstadoDomi = new javax.swing.JComboBox();
        lblDatosLabo = new javax.swing.JLabel();
        lblNomEmpresa = new javax.swing.JLabel();
        lblDireccionEmpresa = new javax.swing.JLabel();
        lblNumExtEmpresa = new javax.swing.JLabel();
        lblNumIntEmpresa = new javax.swing.JLabel();
        lblCpEmpresa = new javax.swing.JLabel();
        lblColoniaEmpresa = new javax.swing.JLabel();
        lblMunicipEmpresa = new javax.swing.JLabel();
        lblEstadoEmpresa = new javax.swing.JLabel();
        txtNomEmpresa = new javax.swing.JTextField();
        txtDireccionEmpresa = new javax.swing.JTextField();
        txtNumExtEmpresa = new javax.swing.JTextField();
        txtNumIntEmpresa = new javax.swing.JTextField();
        txtCpEmpresa = new javax.swing.JTextField();
        comboColoniaEmpresa = new javax.swing.JComboBox();
        comboMunicipEmpresa = new javax.swing.JComboBox();
        comboEstadoEmpresa = new javax.swing.JComboBox();
        btnRegNna = new javax.swing.JButton();
        btnActualizarD = new javax.swing.JButton();
        panelNNAStatus = new javax.swing.JPanel();
        btnPrincipal2 = new javax.swing.JButton();
        txtNombreNNA2 = new javax.swing.JTextField();
        rbtnActivo2 = new javax.swing.JRadioButton();
        rbtnInactivo2 = new javax.swing.JRadioButton();
        btnBuscar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStatus = new javax.swing.JTable();
        btnCambiarStatus = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelNNAReporte = new javax.swing.JPanel();
        btnPrincipal3 = new javax.swing.JButton();
        txtNombreNNA3 = new javax.swing.JTextField();
        rbtnActivo3 = new javax.swing.JRadioButton();
        rbtnInactivo3 = new javax.swing.JRadioButton();
        btnBuscar3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableReporte = new javax.swing.JTable();
        btnGenerarReporte = new javax.swing.JButton();
        lblRutaGuardado = new javax.swing.JLabel();
        txtRutaGuardado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(689, 482));

        scrollPanelNNA.setPreferredSize(new java.awt.Dimension(664, 2298));

        panelNNAGestion.setBackground(new java.awt.Color(255, 255, 255));
        panelNNAGestion.setPreferredSize(new java.awt.Dimension(660, 3150));

        btnPrincipal1.setBackground(new java.awt.Color(0, 134, 207));
        btnPrincipal1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal1.setText("Menú Principal");

        rbtnActivo1.setText("Activo");

        rbtnInactivo1.setText("Inactivo");

        btnBuscar1.setBackground(new java.awt.Color(0, 134, 207));
        btnBuscar1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Buscar");

        tableGestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre(s)", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane5.setViewportView(tableGestion);

        btnMostrar.setBackground(new java.awt.Color(0, 134, 207));
        btnMostrar.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");

        lblDatosNNA.setText("Datos del NNA");

        lblNombres.setText("Nombre(s):");

        lblApePaterno.setText("Apellido Paterno:");

        lblApeMaterno.setText("Apellido Materno:");

        lblEdad.setText("Edad:");

        lblFechaNacim.setText("Fecha de nacimiento:");

        lblMunicipioNacim.setText("Municipio de nacimiento:");

        lblEstadoNacim.setText("Estado de nacimiento:");

        lblNacionalidad.setText("Nacionalidad:");

        lblOrigEtnico.setText("Origen Étnico:");

        comboMunicipNacim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEstadoNacim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboNacionalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboOrigEtnico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNivelCursado.setText("Último nivel cursado:");

        lblPromedioObten.setText("Promedio obtenido:");

        lblNomInstitucion.setText("Nombre de la Institucion:");

        comboNivelCursado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblVacuna.setText("Vacuna:");

        lblFechaAplicacion.setText("Fecha de aplicación");

        lblDosis.setText("Dosis");

        comboVacuna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarVacuna.setText("Agregar");

        tableVacunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vacuna", "Fecha", "Dosis"
            }
        ));
        jScrollPane2.setViewportView(tableVacunas);

        lblDatosPadres.setText("Datos de los Padres del NNA");

        lblPadre.setText("Padre");

        lblNombresPadre.setText("Nombre(s):");

        lblApePaternoPadre.setText("Apellido Paterno:");

        lblApeMaternoPadre.setText("Apellido Materno:");

        lblFechaNacimPadre.setText("Fecha de nacimiento:");

        lblMunicipioNacimPadre.setText("Municipio de nacimiento:");

        lblEstadoNacimPadre.setText("Estado de nacimiento:");

        comboMunicipNacimPadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEstadoNacimPadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMadre.setText("Madre");

        lblNombresMadre.setText("Nombre(s):");

        lblApePaternoMadre.setText("Apellido Paterno:");

        lblApeMaternoMadre.setText("Apellido Materno:");

        lblFechaNacimMadre.setText("Fecha de nacimiento:");

        lblMunicipioNacimMadre.setText("Municipio de nacimiento:");

        lblEstadoNacimMadre.setText("Estado de nacimiento:");

        comboMunicipNacimMadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEstadoNacimMadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEstadoNacimMadre1.setText("Datos del Tutor");

        lblEstadoNacimMadre2.setText("Datos Personales");

        lblNombresTutor.setText("Nombre(s):");

        lblApePaternoTutor.setText("Apellido Paterno:");

        lblApeMaternoTutor.setText("Apellido Materno:");

        lblCURPTutor.setText("CURP:");

        lblFechaNacimTutor.setText("Fecha de nacimiento:");

        lblSexoTutor.setText("Sexo:");

        lblNacionalidadTutor.setText("Nacionalidad:");

        lblNumTelefTutor.setText("Número Telefónico:");

        lblSituaSentimTutor.setText("Situación sentimental:");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboNacionalidadTutor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboSituaSentim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDomicilio.setText("Domicilio");

        lblDireccionDomi.setText("Direccion:");

        lblNumExtDomi.setText("Número Ext:");

        lblNumIntDomi.setText("Número Int:");

        lblCpDomi.setText("CP:");

        lblColoniaDomi.setText("Colonia:");

        lblMunicipDomi.setText("Municipio:");

        lblEstadoDomi.setText("Estado:");

        comboColoniaDomi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMunicipDomi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEstadoDomi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDatosLabo.setText("Datos Laborales");

        lblNomEmpresa.setText("Nombre de la Empresa:");

        lblDireccionEmpresa.setText("Direccion:");

        lblNumExtEmpresa.setText("Número Ext:");

        lblNumIntEmpresa.setText("Número Int:");

        lblCpEmpresa.setText("CP:");

        lblColoniaEmpresa.setText("Colonia:");

        lblMunicipEmpresa.setText("Municipio:");

        lblEstadoEmpresa.setText("Estado:");

        comboColoniaEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMunicipEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEstadoEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegNna.setText("Registrar NNA");

        btnActualizarD.setText("Actualizar datos");

        javax.swing.GroupLayout panelNNAGestionLayout = new javax.swing.GroupLayout(panelNNAGestion);
        panelNNAGestion.setLayout(panelNNAGestionLayout);
        panelNNAGestionLayout.setHorizontalGroup(
            panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNNAGestionLayout.createSequentialGroup()
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(btnMostrar))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblDatosNNA))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNombres)
                        .addGap(123, 123, 123)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblApePaterno)
                        .addGap(90, 90, 90)
                        .addComponent(txtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblApeMaterno)
                        .addGap(88, 88, 88)
                        .addComponent(txtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblEdad)
                        .addGap(155, 155, 155)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblFechaNacim)
                        .addGap(66, 66, 66)
                        .addComponent(txtFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMunicipioNacim)
                        .addGap(46, 46, 46)
                        .addComponent(comboMunicipNacim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblEstadoNacim)
                        .addGap(61, 61, 61)
                        .addComponent(comboEstadoNacim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNacionalidad)
                        .addGap(110, 110, 110)
                        .addComponent(comboNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblOrigEtnico)
                        .addGap(107, 107, 107)
                        .addComponent(comboOrigEtnico, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNivelCursado)
                        .addGap(68, 68, 68)
                        .addComponent(comboNivelCursado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblPromedioObten)
                        .addGap(76, 76, 76)
                        .addComponent(txtPromedioObten, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNomInstitucion)
                        .addGap(46, 46, 46)
                        .addComponent(txtNomInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblVacuna)
                        .addGap(140, 140, 140)
                        .addComponent(comboVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblFechaAplicacion)
                        .addGap(74, 74, 74)
                        .addComponent(txtFechaAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblDosis)
                        .addGap(154, 154, 154)
                        .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnAgregarVacuna))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblDatosPadres))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblPadre))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNombresPadre)
                        .addGap(121, 121, 121)
                        .addComponent(txtNombresPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblApePaternoPadre)
                        .addGap(88, 88, 88)
                        .addComponent(txtApePaternoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblApeMaternoPadre)
                        .addGap(86, 86, 86)
                        .addComponent(txtApeMaternoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblFechaNacimPadre)
                        .addGap(64, 64, 64)
                        .addComponent(txtFechaNacimPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMunicipioNacimPadre)
                        .addGap(44, 44, 44)
                        .addComponent(comboMunicipNacimPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblEstadoNacimPadre)
                        .addGap(59, 59, 59)
                        .addComponent(comboEstadoNacimPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMadre))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNombresMadre)
                        .addGap(121, 121, 121)
                        .addComponent(txtNombresMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblApePaternoMadre)
                        .addGap(88, 88, 88)
                        .addComponent(txtApePaternoMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblApeMaternoMadre)
                        .addGap(86, 86, 86)
                        .addComponent(txtApeMaternoMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblFechaNacimMadre)
                        .addGap(64, 64, 64)
                        .addComponent(txtFechaNacimMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMunicipioNacimMadre)
                        .addGap(44, 44, 44)
                        .addComponent(comboMunicipNacimMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addGroup(panelNNAGestionLayout.createSequentialGroup()
                                .addComponent(txtNombreNNA1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(rbtnActivo1)
                                .addGap(28, 28, 28)
                                .addComponent(rbtnInactivo1)
                                .addGap(50, 50, 50)
                                .addComponent(btnBuscar1)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelNNAGestionLayout.createSequentialGroup()
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDomicilio)
                            .addComponent(lblEstadoNacimMadre2)
                            .addComponent(lblEstadoNacimMadre1)
                            .addComponent(lblDatosLabo)
                            .addGroup(panelNNAGestionLayout.createSequentialGroup()
                                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstadoNacimMadre)
                                    .addComponent(lblNombresTutor)
                                    .addComponent(lblApePaternoTutor)
                                    .addComponent(lblApeMaternoTutor)
                                    .addComponent(lblCURPTutor)
                                    .addComponent(lblFechaNacimTutor)
                                    .addComponent(lblNumTelefTutor)
                                    .addComponent(lblSexoTutor)
                                    .addComponent(lblNacionalidadTutor)
                                    .addComponent(lblSituaSentimTutor)
                                    .addComponent(lblDireccionDomi)
                                    .addComponent(lblNumExtDomi)
                                    .addComponent(lblNumIntDomi)
                                    .addComponent(lblCpDomi)
                                    .addComponent(lblColoniaDomi)
                                    .addComponent(lblMunicipDomi)
                                    .addComponent(lblEstadoDomi)
                                    .addComponent(lblNomEmpresa)
                                    .addComponent(lblDireccionEmpresa)
                                    .addComponent(lblNumExtEmpresa)
                                    .addComponent(lblNumIntEmpresa)
                                    .addComponent(lblCpEmpresa)
                                    .addComponent(lblColoniaEmpresa)
                                    .addComponent(lblMunicipEmpresa)
                                    .addComponent(lblEstadoEmpresa))
                                .addGap(52, 52, 52)
                                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMunicipEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboColoniaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboEstadoDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboMunicipDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboColoniaDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSituaSentim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboNacionalidadTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumTelefTutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaNacimTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombresTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboEstadoNacimMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCurpTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNumExtDomi, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumIntDomi, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCpDomi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                    .addComponent(txtNumExtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCpEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addComponent(txtNumIntEmpresa, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(comboEstadoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApePaternoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApeMaternoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnRegNna)
                        .addGap(81, 81, 81)
                        .addComponent(btnActualizarD))
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrincipal1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNNAGestionLayout.setVerticalGroup(
            panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNNAGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal1)
                .addGap(15, 15, 15)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar1)
                    .addComponent(rbtnInactivo1)
                    .addComponent(rbtnActivo1)
                    .addComponent(txtNombreNNA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDatosNNA)
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblNombres))
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApePaterno))
                    .addComponent(txtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApeMaterno))
                    .addComponent(txtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblEdad))
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblFechaNacim))
                    .addComponent(txtFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblMunicipioNacim))
                    .addComponent(comboMunicipNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblEstadoNacim))
                    .addComponent(comboEstadoNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblNacionalidad))
                    .addComponent(comboNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblOrigEtnico))
                    .addComponent(comboOrigEtnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblNivelCursado))
                    .addComponent(comboNivelCursado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblPromedioObten))
                    .addComponent(txtPromedioObten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblNomInstitucion))
                    .addComponent(txtNomInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblVacuna))
                    .addComponent(comboVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblFechaAplicacion))
                    .addComponent(txtFechaAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblDosis))
                    .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarVacuna)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblDatosPadres)
                .addGap(18, 18, 18)
                .addComponent(lblPadre)
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblNombresPadre))
                    .addComponent(txtNombresPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApePaternoPadre))
                    .addComponent(txtApePaternoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApeMaternoPadre))
                    .addComponent(txtApeMaternoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblFechaNacimPadre))
                    .addComponent(txtFechaNacimPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblMunicipioNacimPadre))
                    .addComponent(comboMunicipNacimPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblEstadoNacimPadre))
                    .addComponent(comboEstadoNacimPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(lblMadre)
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombresMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombresMadre))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApePaternoMadre))
                    .addComponent(txtApePaternoMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApeMaternoMadre))
                    .addComponent(txtApeMaternoMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblFechaNacimMadre))
                    .addComponent(txtFechaNacimMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblMunicipioNacimMadre))
                    .addComponent(comboMunicipNacimMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAGestionLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblEstadoNacimMadre))
                    .addComponent(comboEstadoNacimMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(lblEstadoNacimMadre1)
                .addGap(18, 18, 18)
                .addComponent(lblEstadoNacimMadre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombresTutor)
                    .addComponent(txtNombresTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApePaternoTutor)
                    .addComponent(txtApePaternoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeMaternoTutor)
                    .addComponent(txtApeMaternoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCURPTutor)
                    .addComponent(txtCurpTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimTutor)
                    .addComponent(txtFechaNacimTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoTutor)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidadTutor)
                    .addComponent(comboNacionalidadTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumTelefTutor)
                    .addComponent(txtNumTelefTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituaSentimTutor)
                    .addComponent(comboSituaSentim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(lblDomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionDomi)
                    .addComponent(txtDireccionDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumExtDomi)
                    .addComponent(txtNumExtDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumIntDomi)
                    .addComponent(txtNumIntDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpDomi)
                    .addComponent(txtCpDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColoniaDomi)
                    .addComponent(comboColoniaDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipDomi)
                    .addComponent(comboMunicipDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoDomi)
                    .addComponent(comboEstadoDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(lblDatosLabo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomEmpresa)
                    .addComponent(txtNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionEmpresa)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumExtEmpresa)
                    .addComponent(txtNumExtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumIntEmpresa)
                    .addComponent(txtNumIntEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpEmpresa)
                    .addComponent(txtCpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColoniaEmpresa)
                    .addComponent(comboColoniaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipEmpresa)
                    .addComponent(comboMunicipEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoEmpresa)
                    .addComponent(comboEstadoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelNNAGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegNna)
                    .addComponent(btnActualizarD))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        scrollPanelNNA.setViewportView(panelNNAGestion);

        jTabbedPane1.addTab("Gestión NNA", scrollPanelNNA);

        panelNNAStatus.setBackground(new java.awt.Color(255, 255, 255));

        btnPrincipal2.setBackground(new java.awt.Color(0, 134, 207));
        btnPrincipal2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnPrincipal2.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal2.setText("Menú Principal");

        rbtnActivo2.setText("Activo");

        rbtnInactivo2.setText("Inactivo");

        btnBuscar2.setBackground(new java.awt.Color(0, 134, 207));
        btnBuscar2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setText("Buscar");

        tableStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableStatus);
        if (tableStatus.getColumnModel().getColumnCount() > 0) {
            tableStatus.getColumnModel().getColumn(3).setHeaderValue("Status");
        }

        btnCambiarStatus.setBackground(new java.awt.Color(0, 134, 207));
        btnCambiarStatus.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnCambiarStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarStatus.setText("Cambiar Status");

        btnGuardar.setBackground(new java.awt.Color(0, 134, 207));
        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar cambio");

        javax.swing.GroupLayout panelNNAStatusLayout = new javax.swing.GroupLayout(panelNNAStatus);
        panelNNAStatus.setLayout(panelNNAStatusLayout);
        panelNNAStatusLayout.setHorizontalGroup(
            panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNNAStatusLayout.createSequentialGroup()
                .addGroup(panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAStatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrincipal2))
                    .addGroup(panelNNAStatusLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelNNAStatusLayout.createSequentialGroup()
                                    .addComponent(btnCambiarStatus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar))
                                .addGroup(panelNNAStatusLayout.createSequentialGroup()
                                    .addComponent(txtNombreNNA2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtnActivo2)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtnInactivo2)
                                    .addGap(40, 40, 40)
                                    .addComponent(btnBuscar2))))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panelNNAStatusLayout.setVerticalGroup(
            panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNNAStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal2)
                .addGap(18, 18, 18)
                .addGroup(panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreNNA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnActivo2)
                    .addComponent(rbtnInactivo2)
                    .addComponent(btnBuscar2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNNAStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarStatus)
                    .addComponent(btnGuardar))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Cambio de Status", panelNNAStatus);

        panelNNAReporte.setBackground(new java.awt.Color(255, 255, 255));

        btnPrincipal3.setBackground(new java.awt.Color(0, 134, 207));
        btnPrincipal3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnPrincipal3.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal3.setText("Menú Principal");

        rbtnActivo3.setText("Activo");

        rbtnInactivo3.setText("Inactivo");

        btnBuscar3.setBackground(new java.awt.Color(0, 134, 207));
        btnBuscar3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar3.setText("Buscar");

        tableReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre(s)", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane4.setViewportView(tableReporte);

        btnGenerarReporte.setBackground(new java.awt.Color(0, 134, 207));
        btnGenerarReporte.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        btnGenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarReporte.setText("Generar reporte");

        lblRutaGuardado.setText("Ruta de guardado:");

        javax.swing.GroupLayout panelNNAReporteLayout = new javax.swing.GroupLayout(panelNNAReporte);
        panelNNAReporte.setLayout(panelNNAReporteLayout);
        panelNNAReporteLayout.setHorizontalGroup(
            panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNNAReporteLayout.createSequentialGroup()
                .addGroup(panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNNAReporteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrincipal3))
                    .addGroup(panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNNAReporteLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(txtNombreNNA3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addComponent(rbtnActivo3)
                                .addGap(33, 33, 33)
                                .addComponent(rbtnInactivo3)
                                .addGap(42, 42, 42)
                                .addComponent(btnBuscar3))
                            .addGroup(panelNNAReporteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblRutaGuardado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRutaGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerarReporte)))))
                .addGap(113, 113, 113))
        );
        panelNNAReporteLayout.setVerticalGroup(
            panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNNAReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal3)
                .addGap(18, 18, 18)
                .addGroup(panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreNNA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnActivo3)
                    .addComponent(rbtnInactivo3)
                    .addComponent(btnBuscar3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelNNAReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarReporte)
                    .addComponent(lblRutaGuardado)
                    .addComponent(txtRutaGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generar reporte", panelNNAReporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_GestionarNNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_GestionarNNA().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarD;
    private javax.swing.JButton btnAgregarVacuna;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnCambiarStatus;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnPrincipal1;
    private javax.swing.JButton btnPrincipal2;
    private javax.swing.JButton btnPrincipal3;
    private javax.swing.JButton btnRegNna;
    private javax.swing.JComboBox comboColoniaDomi;
    private javax.swing.JComboBox comboColoniaEmpresa;
    private javax.swing.JComboBox comboEstadoDomi;
    private javax.swing.JComboBox comboEstadoEmpresa;
    private javax.swing.JComboBox comboEstadoNacim;
    private javax.swing.JComboBox comboEstadoNacimMadre;
    private javax.swing.JComboBox comboEstadoNacimPadre;
    private javax.swing.JComboBox comboMunicipDomi;
    private javax.swing.JComboBox comboMunicipEmpresa;
    private javax.swing.JComboBox comboMunicipNacim;
    private javax.swing.JComboBox comboMunicipNacimMadre;
    private javax.swing.JComboBox comboMunicipNacimPadre;
    private javax.swing.JComboBox comboNacionalidad;
    private javax.swing.JComboBox comboNacionalidadTutor;
    private javax.swing.JComboBox comboNivelCursado;
    private javax.swing.JComboBox comboOrigEtnico;
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JComboBox comboSituaSentim;
    private javax.swing.JComboBox comboVacuna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApeMaterno;
    private javax.swing.JLabel lblApeMaternoMadre;
    private javax.swing.JLabel lblApeMaternoPadre;
    private javax.swing.JLabel lblApeMaternoTutor;
    private javax.swing.JLabel lblApePaterno;
    private javax.swing.JLabel lblApePaternoMadre;
    private javax.swing.JLabel lblApePaternoPadre;
    private javax.swing.JLabel lblApePaternoTutor;
    private javax.swing.JLabel lblCURPTutor;
    private javax.swing.JLabel lblColoniaDomi;
    private javax.swing.JLabel lblColoniaEmpresa;
    private javax.swing.JLabel lblCpDomi;
    private javax.swing.JLabel lblCpEmpresa;
    private javax.swing.JLabel lblDatosLabo;
    private javax.swing.JLabel lblDatosNNA;
    private javax.swing.JLabel lblDatosPadres;
    private javax.swing.JLabel lblDireccionDomi;
    private javax.swing.JLabel lblDireccionEmpresa;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblDosis;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstadoDomi;
    private javax.swing.JLabel lblEstadoEmpresa;
    private javax.swing.JLabel lblEstadoNacim;
    private javax.swing.JLabel lblEstadoNacimMadre;
    private javax.swing.JLabel lblEstadoNacimMadre1;
    private javax.swing.JLabel lblEstadoNacimMadre2;
    private javax.swing.JLabel lblEstadoNacimPadre;
    private javax.swing.JLabel lblFechaAplicacion;
    private javax.swing.JLabel lblFechaNacim;
    private javax.swing.JLabel lblFechaNacimMadre;
    private javax.swing.JLabel lblFechaNacimPadre;
    private javax.swing.JLabel lblFechaNacimTutor;
    private javax.swing.JLabel lblMadre;
    private javax.swing.JLabel lblMunicipDomi;
    private javax.swing.JLabel lblMunicipEmpresa;
    private javax.swing.JLabel lblMunicipioNacim;
    private javax.swing.JLabel lblMunicipioNacimMadre;
    private javax.swing.JLabel lblMunicipioNacimPadre;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNacionalidadTutor;
    private javax.swing.JLabel lblNivelCursado;
    private javax.swing.JLabel lblNomEmpresa;
    private javax.swing.JLabel lblNomInstitucion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombresMadre;
    private javax.swing.JLabel lblNombresPadre;
    private javax.swing.JLabel lblNombresTutor;
    private javax.swing.JLabel lblNumExtDomi;
    private javax.swing.JLabel lblNumExtEmpresa;
    private javax.swing.JLabel lblNumIntDomi;
    private javax.swing.JLabel lblNumIntEmpresa;
    private javax.swing.JLabel lblNumTelefTutor;
    private javax.swing.JLabel lblOrigEtnico;
    private javax.swing.JLabel lblPadre;
    private javax.swing.JLabel lblPromedioObten;
    private javax.swing.JLabel lblRutaGuardado;
    private javax.swing.JLabel lblSexoTutor;
    private javax.swing.JLabel lblSituaSentimTutor;
    private javax.swing.JLabel lblVacuna;
    private javax.swing.JPanel panelNNAGestion;
    private javax.swing.JPanel panelNNAReporte;
    private javax.swing.JPanel panelNNAStatus;
    private javax.swing.JRadioButton rbtnActivo1;
    private javax.swing.JRadioButton rbtnActivo2;
    private javax.swing.JRadioButton rbtnActivo3;
    private javax.swing.JRadioButton rbtnInactivo1;
    private javax.swing.JRadioButton rbtnInactivo2;
    private javax.swing.JRadioButton rbtnInactivo3;
    private javax.swing.JScrollPane scrollPanelNNA;
    private javax.swing.JTable tableGestion;
    private javax.swing.JTable tableReporte;
    private javax.swing.JTable tableStatus;
    private javax.swing.JTable tableVacunas;
    private javax.swing.JTextField txtApeMaterno;
    private javax.swing.JTextField txtApeMaternoMadre;
    private javax.swing.JTextField txtApeMaternoPadre;
    private javax.swing.JTextField txtApeMaternoTutor;
    private javax.swing.JTextField txtApePaterno;
    private javax.swing.JTextField txtApePaternoMadre;
    private javax.swing.JTextField txtApePaternoPadre;
    private javax.swing.JTextField txtApePaternoTutor;
    private javax.swing.JTextField txtCpDomi;
    private javax.swing.JTextField txtCpEmpresa;
    private javax.swing.JTextField txtCurpTutor;
    private javax.swing.JTextField txtDireccionDomi;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaAplicacion;
    private javax.swing.JTextField txtFechaNacim;
    private javax.swing.JTextField txtFechaNacimMadre;
    private javax.swing.JTextField txtFechaNacimPadre;
    private javax.swing.JTextField txtFechaNacimTutor;
    private javax.swing.JTextField txtNomEmpresa;
    private javax.swing.JTextField txtNomInstitucion;
    private javax.swing.JTextField txtNombreNNA1;
    private javax.swing.JTextField txtNombreNNA2;
    private javax.swing.JTextField txtNombreNNA3;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresMadre;
    private javax.swing.JTextField txtNombresPadre;
    private javax.swing.JTextField txtNombresTutor;
    private javax.swing.JTextField txtNumExtDomi;
    private javax.swing.JTextField txtNumExtEmpresa;
    private javax.swing.JTextField txtNumIntDomi;
    private javax.swing.JTextField txtNumIntEmpresa;
    private javax.swing.JTextField txtNumTelefTutor;
    private javax.swing.JTextField txtPromedioObten;
    private javax.swing.JTextField txtRutaGuardado;
    // End of variables declaration//GEN-END:variables
}
