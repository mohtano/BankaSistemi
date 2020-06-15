

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Kullanci_giris_yap extends javax.swing.JFrame {

	public String bakiye="";
		public String borç="";
	
	
	Ana_girisi ana;
	
	public Kullanci_giris_yap() {
		initComponents();
	}
	
	public Kullanci_giris_yap(Ana_girisi ana){
	this();
	this.ana=ana;
		
	}
	
	
	
	
	
	
	
	
	public static String musteri_DosyaOku(){
		String deger="";
	File file=new File("C:\\banka\\musteri.txt");
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
	
	
	public static String bilgiler_bulmak(){
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
	
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                musteri_adi = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                musteri_sifre = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jLabel1.setText("T.C. Kimlik :");

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jLabel2.setText("Şifreniz :");

                jButton1.setBackground(new java.awt.Color(255, 255, 255));
                jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jButton1.setForeground(new java.awt.Color(0, 102, 0));
                jButton1.setText("Giriş");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 255, 255));
                jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 0, 0));
                jButton2.setText("Geri Dön");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(musteri_adi)
                                                                .addContainerGap())
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(musteri_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 10, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(musteri_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(musteri_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              this.setVisible(false);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
	String sembol=";";
	String gelen[]=musteri_DosyaOku().split(sembol);
	
	
	String gelen_bilgiler=musteri_adi.getText()+musteri_sifre.getText();
	
        String no=musteri_adi.getText();
	
	boolean kontrol=true;
	for(int i=0;i<gelen.length;i++){
	if(gelen_bilgiler.equals(gelen[i])){	
	kontrol=false;	
	break;
	}
	}
	if(kontrol){
		JOptionPane.showMessageDialog(rootPane, "kullanci adı yada şifresi yanlıştır .. tekrar deneyin");
	}
	else{
		
		String sembol1=";";
		String matris[]=bilgiler_bulmak().split(sembol1);
		
			
			
		
		for(int i=0;i<matris.length;i++){
		
		if(no.equals(matris[i])){
		bakiye=matris[i+10];
		borç=matris[i+11];
		break;
		}	
			
		}
		
		
		Kullanci_ekrani ke=new Kullanci_ekrani(this);
		ke.setVisible(true);
		this.setVisible(false);
	}	
	



	
        }//GEN-LAST:event_jButton1ActionPerformed

	
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
			java.util.logging.Logger.getLogger(Kullanci_giris_yap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Kullanci_giris_yap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Kullanci_giris_yap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Kullanci_giris_yap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Kullanci_giris_yap().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        public javax.swing.JTextField musteri_adi;
        public javax.swing.JTextField musteri_sifre;
        // End of variables declaration//GEN-END:variables
}
