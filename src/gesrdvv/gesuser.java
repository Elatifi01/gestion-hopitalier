package gesrdvv;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class gesuser extends javax.swing.JFrame {
    private static String url = "jdbc:mysql://localhost:3306/gesrdv";    
    private static String driverName = "com.mysql.cj.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "";
    private static Connection con;
    private static String urlstring;
    private static int medid;
    static int groupid;
    JLabel medID = new JLabel("Medecin ID");
    JLabel medName = new JLabel("Medecin Nom");
    JTextField medText = new JTextField();
    JComboBox medCombo = new JComboBox();
    ButtonGroup b = new ButtonGroup();
    public gesuser() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage((new ImageIcon(getClass().getResource("/images/hospital.png")).getImage()));
//        try{
//          Class.forName(driverName);
//          Connection con = null;
//          con = DriverManager.getConnection(url,username,password);
//          Statement s = con.createStatement();
//          String sql = "SELECT * FROM medecin";
//          ResultSet res = s.executeQuery(sql);
//          while(res.next()){
//              jComboBox1.addItem(res.getString("idmedecin"));
//          }
//        }
//        catch(ClassNotFoundException e){
//            JOptionPane.showMessageDialog(null,"err de pilote"); 
//        }
//        catch(SQLException s){
//            JOptionPane.showMessageDialog(null,"err de connexion"); 
//        }
          
                try{
          Class.forName(driverName);
          Connection con = null;
          con = DriverManager.getConnection(url,username,password);
          Statement s = con.createStatement();
          String sql = "SELECT * FROM users";
          ResultSet res = s.executeQuery(sql);
          while(res.next()){
              jComboBox1.addItem(res.getString("iduser"));
          }
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"err de pilote"); 
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,"err de connexion"); 
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des utilisateurs");
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choisir..." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel4.setText("Login");
        jLabel4.setAlignmentY(1.0F);

        jLabel5.setText("Password");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Générer mdp");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove-user.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Nova Cond", 0, 24)); // NOI18N
        jLabel1.setText("GESTION DES UTILISATEURS");

        jLabel3.setText("Fonction");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Secretaire", "Medecin" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 152, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, 152, Short.MAX_VALUE)
                                    .addComponent(jButton4)
                                    .addComponent(jPasswordField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel6)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        choixMed med = new choixMed();
        System.out.println(med.idMed());
        jTextField2.setText("");
        jPasswordField1.setText("");
        jComboBox1.setSelectedItem("choisir...");
        jComboBox2.setSelectedItem("Admin");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{
          Class.forName(driverName);
          Connection con = null;
          con = DriverManager.getConnection(url,username,password);
          Statement s = con.createStatement();
          String sql = "SELECT * FROM users WHERE iduser = "+jComboBox1.getSelectedItem()+" ";
          ResultSet res = s.executeQuery(sql);
          while(res.next()){
              
              jTextField2.setText(res.getString("login"));
              jPasswordField1.setText(res.getString("password"));
              switch (res.getInt("groupid")) {
                  case 0:
                      jComboBox2.setSelectedItem("Admin");
                      break;
                  case 1:
                      jComboBox2.setSelectedItem("Medecin");
                      
                      break;
                  case 2:
                      jComboBox2.setSelectedItem("Secretaire");
                      break;
                  default:
                      break;
              }
          }
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"err de pilote"); 
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,"err de connexion"); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        if(jComboBox2.getSelectedItem() == "Admin"){
            if(jTextField2.getText().length() <= 0 ||jPasswordField1.getText().length() <= 0){
                    JOptionPane.showMessageDialog(null,"Vous n'avais pas saisis un champ obligatoire");
                }
            else{
            groupid = 0;
            
                    try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO users(login,password,groupid,idmed) VALUES('"+jTextField2.getText()+"','"+jPasswordField1.getText()+"',"+groupid+","+null+")";
            int res = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"L'utilisateur est enregistré");

        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,s.getMessage());
        }               
            }
           
        }
        
        else if(jComboBox2.getSelectedItem() == "Medecin"){
            if(jTextField2.getText().length() <= 0 ||jPasswordField1.getText().length() <= 0){
                    JOptionPane.showMessageDialog(null,"Vous n'avais pas saisis un champ obligatoire");
                }
            else{
            groupid = 1;
            choixMed med = new choixMed();
            medid = med.idMed();
                    try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO users(login,password,groupid,idmed) VALUES('"+jTextField2.getText()+"','"+jPasswordField1.getText()+"',"+groupid+",'"+medid+"')";
            int res = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"L'utilisateur est enregistré");

        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,s.getMessage());
        }}
        }
        
        else if(jComboBox2.getSelectedItem() == "Secretaire"){
                        if(jTextField2.getText().length() <= 0 ||jPasswordField1.getText().length() <= 0){
                    JOptionPane.showMessageDialog(null,"Vous n'avais pas saisis un champ obligatoire");
                }
            else{
            groupid = 2;

                    try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO users(login,password,groupid,idmed) VALUES('"+jTextField2.getText()+"','"+jPasswordField1.getText()+"',"+groupid+","+null+")";
            int res = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"L'utilisateur est enregistré");

        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,s.getMessage());
        }}
        }

                            
        jComboBox1.removeAllItems();
        try{
            Class.forName(driverName);
            Connection con = null;
            con = DriverManager.getConnection(url,username,password);
            Statement s = con.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet res = s.executeQuery(sql);
            jComboBox1.addItem("choisir...");
            while(res.next()){
                jComboBox1.addItem(res.getString("iduser"));
            }
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"err de pilote");
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,"err de connexion");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for(int i =0;i<=9;i++){
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        jPasswordField1.setText(sb.toString());

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                try {
            Class.forName(driverName);      
            con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM users WHERE iduser = "+jComboBox1.getSelectedItem()+"";
            int a = JOptionPane.showConfirmDialog(null, "Voulez vraiment supprimer cet utilisateur?");
            if(a == 0){
            int res = stmt.executeUpdate(sql);}
            JOptionPane.showMessageDialog(null, "Utilisateur supprimer");
    
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,s.getMessage());
        } 
                        jComboBox1.removeAllItems();
        try{
            Class.forName(driverName);
            Connection con = null;
            con = DriverManager.getConnection(url,username,password);
            Statement s = con.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet res = s.executeQuery(sql);
            jComboBox1.addItem("choisir...");
            while(res.next()){
                jComboBox1.addItem(res.getString("iduser"));
            }
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"err de pilote");
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,"err de connexion");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
if(jComboBox2.getSelectedItem() == "Admin"){
                if(jTextField2.getText().length() <= 0 ||jPasswordField1.getText().length() <= 0){
                        JOptionPane.showMessageDialog(null,"Vous n'avais pas saisis un champ obligatoire");
                    }
                else{
                groupid = 0;

                        try {
                Class.forName(driverName);
                con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
                String sql = "UPDATE users SET login = '"+jTextField2.getText()+"',password = '"+jPasswordField1.getText()+"' WHERE iduser = "+jComboBox1.getSelectedItem()+" ";
                int res = stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Les informations sont modifiés");

            } catch (ClassNotFoundException ex) {
                // log an exception. for example:
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            catch(SQLException s){
                JOptionPane.showMessageDialog(null,s.getMessage());
            }               
                }

            }

            else if(jComboBox2.getSelectedItem() == "Medecin"){
                if(jTextField2.getText().length() <= 0 ||jPasswordField1.getText().length() <= 0){
                        JOptionPane.showMessageDialog(null,"Vous n'avais pas saisis un champ obligatoire");
                    }
                else{
                groupid = 1;
                choixMed med = new choixMed();
                medid = med.idMed();
                        try {
                Class.forName(driverName);
                con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
                String sql = "UPDATE users SET login = '"+jTextField2.getText()+"',password = '"+jPasswordField1.getText()+"' WHERE iduser = "+jComboBox1.getSelectedItem()+" ";
                int res = stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Les informations sont modifiés");

            } catch (ClassNotFoundException ex) {
                // log an exception. for example:
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            catch(SQLException s){
                JOptionPane.showMessageDialog(null,s.getMessage());
            }}
        }
        
        else if(jComboBox2.getSelectedItem() == "Secretaire"){
                        if(jTextField2.getText().length() <= 0 ||jPasswordField1.getText().length() <= 0){
                    JOptionPane.showMessageDialog(null,"Vous n'avais pas saisis un champ obligatoire");
                }
            else{
            groupid = 2;

                    try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE users SET login = '"+jTextField2.getText()+"',password = '"+jPasswordField1.getText()+"' WHERE iduser = "+jComboBox1.getSelectedItem()+" ";
            int res = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Les informations sont modifiés");

        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(SQLException s){
            JOptionPane.showMessageDialog(null,s.getMessage());
        }}
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedItem() == "Medecin" && jComboBox1.getSelectedItem() == "choisir..."){
         new choixMed().setVisible(true);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                if(jComboBox1.getSelectedItem() == "choisir..."){
            jComboBox1.setSelectedItem("Admin");
            jTextField2.setText("");
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}