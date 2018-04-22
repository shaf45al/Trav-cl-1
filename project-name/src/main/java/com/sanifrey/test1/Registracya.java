/**  
 * ������������� �������������� ������ � ������  
 */ 
package com.sanifrey.test1;

/**  
 * ���������� ����������  
 */ 
import java.awt.FlowLayout; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.awt.Insets; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.FileWriter; 
import java.io.IOException; 
 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 
 
/**   
 * ��������� public �����, � ������� �������������� ����������� � ������� 
 */  
public class Registracya{  
	/**  
	 * ������ ���������� ������ FileWriter � ����������� �� �������� null   
	 */  
	private FileWriter writer = null;    
	/**     
	 * ��������� ����������� ������    
	 */  
	public Registracya(){  
	}    
	/**    
	 * ����� zapusk ��� ������������� � ����������� ������   
	 */  
	public void zapusk(){   
	/**   
	 * ������ ������ ������ JFrame   
	 */   
		final JFrame s=new JFrame();      
	/**    
	 * ���������, ������� �� ���� ����������� �� ������ ������ ����� ������    
	 * (������� - ���������� Strakhovatel.isRun1 ����� true)    
	 */   
	if(Strakhovatel.isRun1==false){        
		/**     
		 * ���������� opcion ������������� ����� �����, ����������� �����,   
		 * ��������� ������������� � ���������� ���� ������������� ��������     
		 */    
		int opcion=JOptionPane.showConfirmDialog(null, "��� ������ ����� ������, ������  ����� ���������������. ����������?", null,  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);      
		if(opcion==JOptionPane.YES_OPTION){           
			/**      
			 * ���������� LichnyKab.isRun1 �������� �������� false.      
			 * ��� ���������� ��� ����, ����� ������������ ���� �������� �������  
			 * �� ������ ������ �����������, �.�. ����� ��������� ����������  
			 * ��������� �������, ���������� LichnyKab.isRun1 ����������� true,      
			 * ��� �������� � ������������� ���������� �� ���������.      
			 */    
			LichnyKab.isRun1=false;       
    /**      
     * ���������� ��������������� true,  
     * �.�. ���� ����������� ������������ �� ������      
     */     
	Strakhovatel.isRun1=true;           
	/**      
	 * ��������� ��������� ����      
	 */     
	s.setTitle("�������� ����� ������� ������");     
	s.setSize(600,400);        
	/**      
	 * ��������� ���� �� �������� ������       
	 */     
	s.setLocationRelativeTo(null);                        
	/**      
	 * ��������� ��������, ������� ����� ����������� ��� �������� ����      
	 */     
	s.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);      
	/**     
	 * ������������� �������� FlowLayout ��� ������������  
	 * ����������� �� ������    
	 */     
	s.setLayout(new FlowLayout());         
	/**      
	 * ������� ���������-���������� panel ������ JPanel      
	 */     
	final JPanel panel=new JPanel();     
	panel.setLayout(new GridBagLayout());          
	/**      
	 * ������� ���������� ��� ������ ������ ������������      
	 */     
	final JButton vykhod=new JButton("�����");      
	final JButton prodolj=new JButton("����������");      
	final JTextField FIO=new JTextField();     
	final JTextField parolTF=new JTextField(9);     
	/**     
	 * ������������� �������� ��� combobox      
	 */     
	String[] vidStr = {                                     
			"����������� ������������������ ������"      
	};     
	final JComboBox<String> comboBoxVidStr = new JComboBox<String>(vidStr);        
	final JButton PodatZayavky=new JButton("��������� �����������");           
	final JLabel FIOL= new JLabel("������� ���: ");     
	final JLabel parolL= new JLabel("���������� ������: ");    
	final JLabel VidStrL= new JLabel("�������� ��� �����������: "); 
 
 
    /**      
     * ��������� ��������� ���������� �� ������ panel      
     */     
	panel.add(FIOL,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
	panel.add(parolL,new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
	panel.add(VidStrL,new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));    
    panel.add(parolTF,new GridBagConstraints(1,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
    panel.add(FIO,new GridBagConstraints(1,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
    panel.add(comboBoxVidStr,new GridBagConstraints(1,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
    panel.add(prodolj,new GridBagConstraints(0,4,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
    panel.add(vykhod,new GridBagConstraints(1,4,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0)); 
 
    /**     
     * ��������� ������ panel �� �����      
     */     
    s.add(panel);              
    /**      
     * ������� ���������� ��� ����������� ������������������� ������        
     */     
    final JTextField PrognozirDoh=new JTextField("0");    
    final JTextField proczOtvetStrahovshikaP=new JTextField("0");     
    final JLabel PrognozirDohL= new JLabel("�������������� �����, ���: ");    
    final JLabel proczOtvetStrahovshikaPL= new JLabel("������� ���������������  �����������,%: "); 
 
    /**      
     * ��������� ��������� � ������ vykhod � ������� ������      
     *addActionListener.      
     */     
    vykhod.addActionListener(new ActionListener() {      
    	public void actionPerformed(ActionEvent e) {       
    		/**        
    		 * ���������� ��������������� false, �.�. ���� �����������   
    		 * �� ����� ������������ �� ������        
    		 */       
    		Strakhovatel.isRun1=false;      
    		/**        
    		 * ����� ��������� ������������        
    		 */       
    		s.setVisible(false);      
    	}     
    });          
    /**      
     * ��������� ��������� � ������ prodolj � ������� ������      
     *addActionListener.     
      */    
    prodolj.addActionListener(new ActionListener() {      
    	public void actionPerformed(ActionEvent arg0) {       
    		System.out.println(parolTF.getText());       
    		/**        
    		 * �������� ����� sohranitParol()       
    		 */       
    		sohranitParol(parolTF);              
    		/**        
    		 * ������� � ������ ���������� ��� ������ ������  
    		 * ������������         
    		 */       
    		panel.remove(parolTF); 
    		panel.remove(FIO);       
    		panel.remove(comboBoxVidStr);       
    		panel.remove(parolL);       
    		panel.remove(FIOL);       
    		panel.remove(VidStrL);      
    		panel.remove(prodolj);                
    		/**        
    		 * ��������� ���������� ��� ����������� �������������������   
    		 * ������         
    		 */       
    		panel.add(PrognozirDoh,new GridBagConstraints(1,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));       
    		panel.add(proczOtvetStrahovshikaP,new GridBagConstraints(1,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0)); 
 
    		panel.add(PrognozirDohL,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));      
    		panel.add(proczOtvetStrahovshikaPL,new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));    
    		panel.add(PodatZayavky,new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));      
    		panel.add(vykhod,new GridBagConstraints(1,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));           
    		/**        
    		 * �������� ��������� ���������� ����������� �����        
    		 */       
    		panel.revalidate();          
    		}     
    	});          
    /**      
     * ��������� ��������� � ������ PodatZayavky � ������� ������     
     *addActionListener.      
     */     
    PodatZayavky.addActionListener(new ActionListener() {      
    	public void actionPerformed(ActionEvent e) {       
    		/**        
    		 * �������� ����� sohranitDannye(int pr, int a)        
    		 */        
    		sohranitDannye(Integer.parseInt(PrognozirDoh.getText()), Integer.parseInt(proczOtvetStrahovshikaP.getText()));        
    		/**         
    		 * ������� ����� ������������ � ����� ostatokPoVznosam    
    		 * ������ LichnyKab          
    		 */       
    		LichnyKab.ostatokPoVznosam.setText("");      
    		}     
    	});          
    s.setVisible(true);             
	}                  
	}else     
		System.out.println("�� ��� ������� �����");  
	}    
/**   
 * ����� sohranitDannye(int pr, int a). 
 * ��� ������ ������ ���������� ���������� ���������� �������� � �������� ���������������   
 * ������ � �������� ��������������� ����������� c ������� ������� setdPr(int dPr) �   
 * setA(int a) ������ Formuly   
 */  
public void sohranitDannye(int pr, int a) {   
	OsnF.obj2.setdPr(pr);  
	OsnF.obj2.setA(a);   
	System.out.println(OsnF.obj2.getdPr()+" "+OsnF.obj2.getA()); 
}    
/**   
 * ����� sohranitParol(JTextField textfield).   
 * ��� ������ ������ ���������� ���������� ������ �� ���������� textfield � ���� p.txt   
 */  
public void sohranitParol(JTextField textfield) {   
	/**   
	 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ���   
	 * ������ ���������� try   
	 */   
	try {    
		/**    
		 * ������ ������ ������ FileWriter � ������ ����� p.txt, ���� ����� �����������  
		 * ������    
		 */    
		writer = new FileWriter("p.txt");   
		/**     
		 * ��������� ���������� textfield � ����� writer     
		 */    
		textfield.write(writer);    
		/**     
		 * ��������� �����     
		 */   
		writer.close();   
		/**    
		 * ������������ ���������� e ���� IOException     
		 */   
		} catch (IOException e) {    
			/**     
			 * �������� ����������, ������� ���������     
			 */    
			e.printStackTrace();   
			}     
	} 
}
