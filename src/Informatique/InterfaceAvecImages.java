package Informatique;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceAvecImages extends JFrame {

    private JTabbedPane tabbedPane;
    private JButton btnAdmin;
    private JButton btnRespMaintenance;
    private JButton btnOperateur;

    public InterfaceAvecImages() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Application de Gestion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1270, 724);
        getContentPane().setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        JPanel panel1 = createPanel1();
        tabbedPane.addTab("Accueil", panel1);

        // Onglet "Client"
        JInternalFrame internalFrameClient = new JInternalFrame("Client", true, true, true, true);
        PanelClient panelClient = new PanelClient();
        internalFrameClient.getContentPane().add(panelClient);
        panelClient.setLayout(null);
        internalFrameClient.setSize(800, 600);
        internalFrameClient.setVisible(true);
        tabbedPane.addTab("Client", internalFrameClient);

        // Onglet "Nouvelle fenêtre Opérateur"
        JInternalFrame internalFrameOperateur = new JInternalFrame("Nouvelle fenêtre Opérateur", true, true, true, true);
        JPanel panelOperateur = createPanelOperateur();
        internalFrameOperateur.getContentPane().add(panelOperateur);
        internalFrameOperateur.setSize(800, 600);
        internalFrameOperateur.setVisible(true);
        tabbedPane.addTab("Nouvelle fenêtre Opérateur", internalFrameOperateur);

        // Nouvel onglet "Compte rendu"
        JPanel panelCompteRendu = createPanelCompteRendu();
        tabbedPane.addTab("Compte rendu", panelCompteRendu);

        // Nouvel onglet "Demande de maintenance"
        JPanel panelDemandeMaintenance = createPanelDemandeMaintenance();
        tabbedPane.addTab("Demande de maintenance", panelDemandeMaintenance);

        // Nouvel onglet "Devis"
        JPanel panelDevis = createPanelDevis();
        tabbedPane.addTab("Devis", panelDevis);

        // Nouvel onglet "Maintenance"
        JPanel panelMaintenance = createPanelMaintenance();
        tabbedPane.addTab("Maintenance", panelMaintenance);

        // Nouvel onglet "Responsable de maintenance"
        JPanel panelResponsableMaintenance = new PanelResponsableMaintenance();
        tabbedPane.addTab("Responsable de maintenance", panelResponsableMaintenance);

        setVisible(true);
    }

    private JPanel createPanel1() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
        internalFrame.getContentPane().setBackground(new Color(255, 255, 255));
        internalFrame.setBackground(new Color(128, 255, 255));
        internalFrame.setBounds(25, 11, 1138, 615);
        panel.add(internalFrame);
        internalFrame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(680, 100, 147, 134);
        internalFrame.getContentPane().add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP 1040G5\\Pictures\\IM4.png"));

        btnAdmin = new JButton("Administrateur");
        btnAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnAdmin.setBounds(39, 262, 150, 30);
        internalFrame.getContentPane().add(btnAdmin);

        btnOperateur = new JButton("Opérateur");
        btnOperateur.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnOperateur.setBounds(348, 272, 100, 30);
        internalFrame.getContentPane().add(btnOperateur);

        btnRespMaintenance = new JButton("Responsable de maintenance");
        btnRespMaintenance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnRespMaintenance.setBounds(687, 262, 199, 30);
        internalFrame.getContentPane().add(btnRespMaintenance);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP 1040G5\\Pictures\\img12.png"));
        lblNewLabel_1.setBounds(39, 107, 186, 144);
        internalFrame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP 1040G5\\Pictures\\code\\IM3.png"));
        lblNewLabel_2.setBounds(323, 107, 155, 127);
        internalFrame.getContentPane().add(lblNewLabel_2);
        btnRespMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenue, Responsable de maintenance !");
                openMaintenanceFeature();
            }
        });
        btnOperateur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenue, Opérateur !");
                openOperatorFeature();
            }
        });
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenue, Administrateur !");
                openAdminFeature();
            }
        });
        internalFrame.setVisible(true);

        return panel;
    }

    private JPanel createPanelOperateur() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblNumero = new JLabel("Numéro:");
        lblNumero.setBounds(20, 20, 80, 25);
        panel.add(lblNumero);

        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(100, 20, 150, 25);
        panel.add(txtNumero);

        JLabel lblDebut = new JLabel("Début:");
        lblDebut.setBounds(20, 50, 80, 25);
        panel.add(lblDebut);

        JTextField txtDebut = new JTextField();
        txtDebut.setBounds(100, 50, 150, 25);
        panel.add(txtDebut);

        JLabel lblFin = new JLabel("Fin:");
        lblFin.setBounds(20, 80, 80, 25);
        panel.add(lblFin);

        JTextField txtFin = new JTextField();
        txtFin.setBounds(100, 80, 150, 25);
        panel.add(txtFin);

        JLabel lblCodeOperateur = new JLabel("Code Opérateur:");
        lblCodeOperateur.setBounds(20, 110, 120, 25);
        panel.add(lblCodeOperateur);

        JTextField txtCodeOperateur = new JTextField();
        txtCodeOperateur.setBounds(140, 110, 150, 25);
        panel.add(txtCodeOperateur);

        JButton btnAjouter = new JButton("Ajouter");
        btnAjouter.setBounds(20, 140, 100, 25);
        panel.add(btnAjouter);

        JButton btnRetour = new JButton("Retour");
        btnRetour.setBounds(140, 140, 100, 25);
        panel.add(btnRetour);

        // Tableau pour afficher les données
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Numéro");
        model.addColumn("Début");
        model.addColumn("Fin");
        model.addColumn("Code Opérateur");
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(300, 20, 600, 400);
        panel.add(scrollPane);

        // Ajout des données au tableau
        btnAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero = txtNumero.getText();
                String debut = txtDebut.getText();
                String fin = txtFin.getText();
                String codeOperateur = txtCodeOperateur.getText();
                model.addRow(new Object[]{numero, debut, fin, codeOperateur});

                // Réinitialiser les champs après ajout
                txtNumero.setText("");
                txtDebut.setText("");
                txtFin.setText("");
                txtCodeOperateur.setText("");
            }
        });

        // Retour à l'accueil
        btnRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(0); // Retour à l'onglet "Accueil"
            }
        });

        return panel;
    }

    private JPanel createPanelCompteRendu() {
        JPanel panelCompteRendu = new JPanel();
        panelCompteRendu.setLayout(null);

        JLabel lblTitre = new JLabel("Compte rendu");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitre.setBounds(20, 20, 150, 25);
        panelCompteRendu.add(lblTitre);

        JTextArea txtAreaCompteRendu = new JTextArea();
        txtAreaCompteRendu.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(txtAreaCompteRendu);
        scrollPane.setBounds(20, 50, 360, 300);
        panelCompteRendu.add(scrollPane);

        JButton btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(20, 360, 100, 25);
        panelCompteRendu.add(btnEnregistrer);

        JButton btnEffacer = new JButton("Effacer");
        btnEffacer.setBounds(130, 360, 100, 25);
        panelCompteRendu.add(btnEffacer);

        btnEnregistrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logique pour enregistrer le compte rendu
                String compteRendu = txtAreaCompteRendu.getText();
                // Exemple de sauvegarde ou traitement du compte rendu
                JOptionPane.showMessageDialog(null, "Compte rendu enregistré :\n\n" + compteRendu);
            }
        });

        btnEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaCompteRendu.setText(""); // Effacer le texte du compte rendu
            }
        });

        return panelCompteRendu;
    }

    private JPanel createPanelDemandeMaintenance() {
        JPanel panelDemandeMaintenance = new JPanel();
        panelDemandeMaintenance.setLayout(null);

        JLabel lblTitre = new JLabel("Demande de maintenance");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitre.setBounds(20, 20, 200, 25);
        panelDemandeMaintenance.add(lblTitre);

        JTextArea txtAreaDemande = new JTextArea();
        txtAreaDemande.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(txtAreaDemande);
        scrollPane.setBounds(20, 50, 360, 300);
        panelDemandeMaintenance.add(scrollPane);

        JButton btnEnvoyer = new JButton("Envoyer");
        btnEnvoyer.setBounds(20, 360, 100, 25);
        panelDemandeMaintenance.add(btnEnvoyer);

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setBounds(130, 360, 100, 25);
        panelDemandeMaintenance.add(btnAnnuler);

        btnEnvoyer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logique pour envoyer la demande de maintenance
                String demande = txtAreaDemande.getText();
                // Exemple d'envoi ou de traitement de la demande
                JOptionPane.showMessageDialog(null, "Demande de maintenance envoyée :\n\n" + demande);
            }
        });

        btnAnnuler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaDemande.setText(""); // Effacer le texte de la demande
            }
        });

        return panelDemandeMaintenance;
    }

    private JPanel createPanelDevis() {
        JPanel panelDevis = new JPanel();
        panelDevis.setLayout(null);

        JLabel lblTitre = new JLabel("Devis");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitre.setBounds(20, 20, 100, 25);
        panelDevis.add(lblTitre);

        JLabel lblNomClient = new JLabel("Nom du client:");
        lblNomClient.setBounds(20, 50, 100, 25);
        panelDevis.add(lblNomClient);

        JTextField txtNomClient = new JTextField();
        txtNomClient.setBounds(130, 50, 200, 25);
        panelDevis.add(txtNomClient);

        JLabel lblEmailClient = new JLabel("Email:");
        lblEmailClient.setBounds(20, 80, 100, 25);
        panelDevis.add(lblEmailClient);

        JTextField txtEmailClient = new JTextField();
        txtEmailClient.setBounds(130, 80, 200, 25);
        panelDevis.add(txtEmailClient);

        JLabel lblCliNumeroIFU = new JLabel("Numéro IFU:");
        lblCliNumeroIFU.setBounds(20, 110, 100, 25);
        panelDevis.add(lblCliNumeroIFU);

        JTextField txtCliNumeroIFU = new JTextField();
        txtCliNumeroIFU.setBounds(130, 110, 200, 25);
        panelDevis.add(txtCliNumeroIFU);

        JLabel lblCliNumeroRCCM = new JLabel("Numéro RCCM:");
        lblCliNumeroRCCM.setBounds(20, 140, 100, 25);
        panelDevis.add(lblCliNumeroRCCM);

        JTextField txtCliNumeroRCCM = new JTextField();
        txtCliNumeroRCCM.setBounds(130, 140, 200, 25);
        panelDevis.add(txtCliNumeroRCCM);

        JLabel lblCliAdresse = new JLabel("Adresse:");
        lblCliAdresse.setBounds(20, 170, 100, 25);
        panelDevis.add(lblCliAdresse);

        JTextField txtCliAdresse = new JTextField();
        txtCliAdresse.setBounds(130, 170, 300, 25);
        panelDevis.add(txtCliAdresse);

        JLabel lblCliCodeAPE = new JLabel("Code APE:");
        lblCliCodeAPE.setBounds(20, 200, 100, 25);
        panelDevis.add(lblCliCodeAPE);

        JTextField txtCliCodeAPE = new JTextField();
        txtCliCodeAPE.setBounds(130, 200, 200, 25);
        panelDevis.add(txtCliCodeAPE);

        JTextArea txtAreaDevis = new JTextArea();
        txtAreaDevis.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(txtAreaDevis);
        scrollPane.setBounds(360, 50, 400, 300);
        panelDevis.add(scrollPane);

        JButton btnGenererDevis = new JButton("Générer Devis");
        btnGenererDevis.setBounds(360, 360, 150, 25);
        panelDevis.add(btnGenererDevis);

        JButton btnEffacerDevis = new JButton("Effacer");
        btnEffacerDevis.setBounds(520, 360, 100, 25);
        panelDevis.add(btnEffacerDevis);

        btnGenererDevis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomClient = txtNomClient.getText();
                String emailClient = txtEmailClient.getText();
                String cliNumeroIFU = txtCliNumeroIFU.getText();
                String cliNumeroRCCM = txtCliNumeroRCCM.getText();
                String cliAdresse = txtCliAdresse.getText();
                String cliCodeAPE = txtCliCodeAPE.getText();
                // Générer le devis avec les données saisies
                String devis = "Devis pour " + nomClient + "\n\n" +
                        "Email: " + emailClient + "\n" +
                        "Numéro IFU: " + cliNumeroIFU + "\n" +
                        "Numéro RCCM: " + cliNumeroRCCM + "\n" +
                        "Adresse: " + cliAdresse + "\n" +
                        "Code APE: " + cliCodeAPE + "\n\n" +
                        "Détails du devis:\n" +
                        txtAreaDevis.getText();
                txtAreaDevis.setText(devis);
            }
        });

        btnEffacerDevis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNomClient.setText("");
                txtEmailClient.setText("");
                txtCliNumeroIFU.setText("");
                txtCliNumeroRCCM.setText("");
                txtCliAdresse.setText("");
                txtCliCodeAPE.setText("");
                txtAreaDevis.setText("");
            }
        });

        return panelDevis;
    }

    private JPanel createPanelMaintenance() {
        JPanel panelMaintenance = new JPanel();
        panelMaintenance.setLayout(null);

        JLabel lblTitre = new JLabel("Maintenance");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitre.setBounds(20, 20, 150, 25);
        panelMaintenance.add(lblTitre);

        JTextArea txtAreaMaintenance = new JTextArea();
        txtAreaMaintenance.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(txtAreaMaintenance);
        scrollPane.setBounds(20, 50, 360, 300);
        panelMaintenance.add(scrollPane);

        JButton btnPlanifier = new JButton("Planifier");
        btnPlanifier.setBounds(20, 360, 100, 25);
        panelMaintenance.add(btnPlanifier);

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setBounds(130, 360, 100, 25);
        panelMaintenance.add(btnAnnuler);

        btnPlanifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logique pour planifier la maintenance
                String maintenance = txtAreaMaintenance.getText();
                // Exemple de planification ou traitement de la maintenance
                JOptionPane.showMessageDialog(null, "Maintenance planifiée :\n\n" + maintenance);
            }
        });

        btnAnnuler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaMaintenance.setText(""); // Effacer le texte de la maintenance
            }
        });

        return panelMaintenance;
    }

    private void openMaintenanceFeature() {
        JOptionPane.showMessageDialog(null, "Fonctionnalité Maintenance ouverte !");
    }

    private void openOperatorFeature() {
        JOptionPane.showMessageDialog(null, "Fonctionnalité Opérateur ouverte !");
    }

    private void openAdminFeature() {
        JOptionPane.showMessageDialog(null, "Fonctionnalité Administrateur ouverte !");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceAvecImages();
            }
        });
    }
}

class PanelClient extends JPanel {
    private JTextField txtNomClient;
    private JTextField txtEmail;
    private JTextField txtNumeroIFU;
    private JTextField txtNumeroRCCM;
    private JTextField txtAdresse;
    private JTextField txtCodeAPE;

    public PanelClient() {
        setLayout(null);

        JLabel lblTitre = new JLabel("Client");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitre.setBounds(20, 20, 150, 25);
        add(lblTitre);

        JLabel lblNomClient = new JLabel("Nom du client:");
        lblNomClient.setBounds(20, 50, 100, 25);
        add(lblNomClient);

        txtNomClient = new JTextField();
        txtNomClient.setBounds(130, 50, 200, 25);
        add(txtNomClient);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 80, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(130, 80, 200, 25);
        add(txtEmail);

        JLabel lblNumeroIFU = new JLabel("Numéro IFU:");
        lblNumeroIFU.setBounds(20, 110, 100, 25);
        add(lblNumeroIFU);

        txtNumeroIFU = new JTextField();
        txtNumeroIFU.setBounds(130, 110, 200, 25);
        add(txtNumeroIFU);

        JLabel lblNumeroRCCM = new JLabel("Numéro RCCM:");
        lblNumeroRCCM.setBounds(20, 140, 100, 25);
        add(lblNumeroRCCM);

        txtNumeroRCCM = new JTextField();
        txtNumeroRCCM.setBounds(130, 140, 200, 25);
        add(txtNumeroRCCM);

        JLabel lblAdresse = new JLabel("Adresse:");
        lblAdresse.setBounds(20, 170, 100, 25);
        add(lblAdresse);

        txtAdresse = new JTextField();
        txtAdresse.setBounds(130, 170, 300, 25);
        add(txtAdresse);

        JLabel lblCodeAPE = new JLabel("Code APE:");
        lblCodeAPE.setBounds(20, 200, 100, 25);
        add(lblCodeAPE);

        txtCodeAPE = new JTextField();
        txtCodeAPE.setBounds(130, 200, 200, 25);
        add(txtCodeAPE);
    }
}

class PanelResponsableMaintenance extends JPanel {
    public PanelResponsableMaintenance() {
        setLayout(null);

        JLabel lblTitre = new JLabel("Responsable de maintenance");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitre.setBounds(20, 20, 250, 25);
        add(lblTitre);

        JTextArea txtArea = new JTextArea();
        txtArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(20, 50, 360, 300);
        add(scrollPane);

        JButton btnValider = new JButton("Valider");
        btnValider.setBounds(20, 360, 100, 25);
        add(btnValider);

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setBounds(130, 360, 100, 25);
        add(btnAnnuler);
    }
}
