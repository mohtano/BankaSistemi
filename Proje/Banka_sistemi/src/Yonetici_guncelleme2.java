
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Yonetici_guncelleme2 extends javax.swing.JFrame {

	
	public Yonetici_guncelleme2() {
		initComponents();
	}
	
	Yonetici_guncelleme1 yg1;
	
	public Yonetici_guncelleme2(Yonetici_guncelleme1 yg1){
	this();
	this.yg1=yg1;
		
		
	}
	
	public static String DosyaOku(){
		String deger="";
	File file=new File("C:\\banka\\bilgiYeri.txt");
	try{
	Scanner sc=new Scanner(file);
	
		deger=sc.nextLine();
	
	sc.close();	
	}
	catch(Exception e){
	e.printStackTrace();
	}	
	return deger;
	}
	
	
	public static void oluşturmak(String bilgiler)
    {
        File file=new File("C:\\banka\\bilgiYeri.txt");
        try
        {
            FileOutputStream dosya=new FileOutputStream(file);
            dosya.write(bilgiler.getBytes());
            dosya.flush();
            dosya.close();
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
        }
    }
	
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel7 = new javax.swing.JLabel();
                txtTelefonno = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                txtUyruklu = new javax.swing.JComboBox<>();
                txtTc = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                txtSoyad = new javax.swing.JTextField();
                txtEposta = new javax.swing.JTextField();
                txtBabaAdı = new javax.swing.JTextField();
                jLabel12 = new javax.swing.JLabel();
                txtGün = new javax.swing.JSpinner();
                jLabel1 = new javax.swing.JLabel();
                txtAy = new javax.swing.JSpinner();
                txtEğitim = new javax.swing.JComboBox<>();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtAdres = new javax.swing.JTextArea();
                txtYıl = new javax.swing.JSpinner();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtAd = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                kaydet = new javax.swing.JButton();
                txtBorç = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                txtBakiye = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                butGeridön = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel7.setText("Uyruklu :");

                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel8.setText("Adres :");

                txtUyruklu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SURİYE", "TÜRKİYE", "MISIR ", "LÜBNAN", "ÜRDÜN", "FİLİSTİN", "SUDAN", "YEMEN", "IRAK", "AZERBEYCAN", "BAKİSTAN", "KATAR", "ALMANYA", "FRANSA", "İTALYA", "ÇİN", "JAPAN", "RUSYA" }));

                jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel11.setText("Yıl");

                jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel12.setText("Eğitim :");

                txtGün.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtGün.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
                txtGün.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                txtGünStateChanged(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Kimlik NO :");

                txtAy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtAy.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

                txtEğitim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ana Okulu", "Orta Okulu", "Lise", "Ön Lisans", "Lisans", "Yüksek Lisans", "Doktora", " " }));

                txtAdres.setColumns(20);
                txtAdres.setRows(5);
                jScrollPane1.setViewportView(txtAdres);

                txtYıl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtYıl.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2002, 1));

                jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel9.setText("Gün");

                jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel10.setText("Ay");

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel2.setText("Soyad :");

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel3.setText("Baba Adı :");

                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel6.setText("Ad :");

                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel4.setText("Doğum Tarihi :");

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel5.setText("E-posta Adresi :");

                jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel13.setText("Telefon No :");

                kaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                kaydet.setText("Kaydet");
                kaydet.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                kaydetActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel14.setText("Borç :");

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel15.setText("Bakiye :");

                butGeridön.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                butGeridön.setText("Geri Dön");
                butGeridön.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                butGeridönActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtBorç, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                                        .addComponent(txtBakiye)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel13)
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTelefonno, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtEğitim, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtEposta)
                                                        .addComponent(txtUyruklu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(butGeridön)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(9, 9, 9)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel3))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtBabaAdı, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel9)
                                                                        .addGap(2, 2, 2)
                                                                        .addComponent(txtGün, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(32, 32, 32)
                                                                        .addComponent(jLabel10)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel11)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtYıl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(35, 35, 35)
                                                                        .addComponent(jLabel1)
                                                                        .addGap(18, 18, 18))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel6))
                                                                        .addGap(18, 18, 18)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtSoyad)
                                                                .addComponent(txtAd)
                                                                .addComponent(txtTc))))
                                        .addContainerGap()))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(220, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtEposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtUyruklu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEğitim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTelefonno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBorç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(kaydet)
                                        .addComponent(butGeridön))
                                .addGap(39, 39, 39))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(txtBabaAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(txtGün, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtYıl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11))
                                        .addContainerGap(424, Short.MAX_VALUE)))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void txtGünStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtGünStateChanged

        }//GEN-LAST:event_txtGünStateChanged

        private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed
	String sembol4=";";
	String matris5[]=DosyaOku().split(sembol4);
	String num=yg1.jTextField1.getText();
	String doğum=txtGün.getValue().toString()+"-"+txtAy.getValue().toString()+"-"+txtYıl.getValue().toString();
	
	for(int i=0;i<matris5.length;i++){
	if(matris5[i].equals(num)){
		
	matris5[i]=num;	
	
	matris5[i+1]=txtAd.getText();
	matris5[i+2]=txtSoyad.getText();
	matris5[i+3]=txtBabaAdı.getText();
	matris5[i+4]=doğum;
	matris5[i+5]=txtEposta.getText();
	matris5[i+6]=txtUyruklu.getSelectedItem().toString();
	matris5[i+7]=txtEğitim.getSelectedItem().toString();
	matris5[i+8]=txtTelefonno.getText();
	matris5[i+9]=txtAdres.getText();
	matris5[i+10]=txtBakiye.getText();
	matris5[i+11]=txtBorç.getText();
							
	break;	
	}	
		
	}
		
        String bilgiler="";
	for(int i=0;i<matris5.length;i++){
		bilgiler=bilgiler+matris5[i]+";";
	}
	
	oluşturmak(bilgiler);
	JOptionPane.showMessageDialog(rootPane, "Bilgileriniz güncellenmiştir");
	
		
		

        }//GEN-LAST:event_kaydetActionPerformed

        private void butGeridönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGeridönActionPerformed
                this.setVisible(false);
        }//GEN-LAST:event_butGeridönActionPerformed

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
			java.util.logging.Logger.getLogger(Yonetici_guncelleme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Yonetici_guncelleme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Yonetici_guncelleme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Yonetici_guncelleme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Yonetici_guncelleme2().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton butGeridön;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton kaydet;
        private javax.swing.JTextField txtAd;
        private javax.swing.JTextArea txtAdres;
        private javax.swing.JSpinner txtAy;
        private javax.swing.JTextField txtBabaAdı;
        private javax.swing.JTextField txtBakiye;
        private javax.swing.JTextField txtBorç;
        private javax.swing.JTextField txtEposta;
        private javax.swing.JComboBox<String> txtEğitim;
        private javax.swing.JSpinner txtGün;
        private javax.swing.JTextField txtSoyad;
        private javax.swing.JTextField txtTc;
        private javax.swing.JTextField txtTelefonno;
        private javax.swing.JComboBox<String> txtUyruklu;
        private javax.swing.JSpinner txtYıl;
        // End of variables declaration//GEN-END:variables
}
