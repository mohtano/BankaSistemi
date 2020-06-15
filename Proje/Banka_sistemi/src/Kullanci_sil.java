
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Kullanci_sil extends javax.swing.JFrame {

	
	public Kullanci_sil() {
		initComponents();
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
	
	public static String Dosya_Oku(){
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
	
	
	
	
	public static void silmekten_sonra(String bilgi)
    {
        File file=new File("C:\\banka\\bilgiYeri.txt");
        try
        {
            FileOutputStream dosya=new FileOutputStream(file);
            dosya.write(bilgi.getBytes());
            dosya.flush();
            dosya.close();
        }
        catch(Exception ex)
        {
             ex.printStackTrace();
        }
    }
	
	public static void silmektenSonra(String bilgi)
    {
        File file=new File("C:\\banka\\musteri.txt");
        try
        {
            FileOutputStream dosya=new FileOutputStream(file);
            dosya.write(bilgi.getBytes());
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

                jTextField1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton1.setText("kaydını sil");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Kullancının numarasını gir :");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		
	String sembol3=";";
	String matris1[]=DosyaOku().split(sembol3);
	boolean kontrol=true;
	int duraklama=0;
	String num=jTextField1.getText();
	
	String matris3[]=Dosya_Oku().split(sembol3);
	boolean kontrol2=true;
	int duraklama2=0;
	
	for(int j=0;j<matris3.length;j++){
	if(num.equals(matris3[j])){
	duraklama2=j;
	kontrol2=false;
	break;
	}		
	}
		
	
	
	for(int i=0;i<matris1.length;i++){
	if(num.equals(matris1[i])){
	duraklama=i;
	kontrol=false;
	break;
	}		
	}
	
	if(kontrol){
		JOptionPane.showMessageDialog(rootPane, "girdiğiniz numara kayıtlı değildir ");
	}
	else
	{
		
		  String son_bilgi="";
               for(int i=0;i<matris1.length;i++)
               {
                   if((i < duraklama) || (i > duraklama+12))
                   {
                     son_bilgi=son_bilgi+matris1[i]+";";  
                   }
               }
	       
	       
	        String son_bilgi2="";
               for(int i=0;i<matris3.length;i++)
               {
                   if(i!=duraklama2)
                   {
                     son_bilgi2=son_bilgi2+matris3[i]+";";  
                   }
               }
	       
	       
	       
	     silmekten_sonra(son_bilgi);
	     silmektenSonra(son_bilgi2);
	   JOptionPane.showMessageDialog(rootPane, "Kaydiniz silindi");    
	   this.setVisible(false);
	       
	}
	
	
		
        }//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(Kullanci_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Kullanci_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Kullanci_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Kullanci_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Kullanci_sil().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
