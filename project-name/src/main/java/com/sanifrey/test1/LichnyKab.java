/**  
 * ������������� �������������� ������ � ������  
 */
package com.sanifrey.test1;

/**  
 * ���������� ����������  
 */ 
import java.awt.Component; 
import java.awt.GridLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
 
import javax.swing.Box; 
import javax.swing.BoxLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 
 
import com.sanifrey.test1.StrVyplata; 
 
/**   
 * ��������� public �����, � ������� �������������� ����� ��������� ������,  
 * ����� ������� �� ��������� �������, � ����� ������� � ���� "��������� �������"  
 */  
public class LichnyKab{ 
	/**   
	 * ������ ���������� ������ FileReader � ����������� �� �������� null   
	 */ 
 
	private FileReader input = null;    
	/**   
	 *  ������ ���������� ���� boolean, ������� ������������� �������/���������� �����   
	 *  ��������� ��������� �������.   
	 *  false - ���� ��������� ������� �� ���� ��������   
	 */  
	static boolean isRun1=false;           
	String parolProverka="";    
	/**   
	 * ������� ��������� ostatokPoVznosam ������ JLabel ��� ����������� ������� �� ���������   
	 * �������   
	 */  
	static JLabel ostatokPoVznosam=new JLabel("");    
 
	/**     
	 * ��������� ����������� ������    
	 */  
	public LichnyKab(){  }    
	/**    
	 * ����� zapusk ��� ������������� � ����������� ������   
	 */    
	protected void zapusk(){   
		System.out.println("����� � ������ �������"); 
 
	/**   
	 * ������ ������ ������ JFrame   
	 */   
	 final JFrame s=new JFrame();       
	/**    
	 * ���������� parolProverka ������������� ������, ��������� ������������� �   
	 * ���������� ���� ����� ������    
	 */   
	parolProverka=JOptionPane.showInputDialog(null, "������� ������", null,  JOptionPane.INFORMATION_MESSAGE);      
	JTextField textField=new JTextField(10);      
	/**   
	 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ���   
	 * ������ ���������� try   
	 */ 
	try {    
		/**    
		 * ������ ������ ������ FileReader � ������ ����� p.txt, ������ �����  
		 * ����������� ������    
		 */    input = new FileReader("p.txt");    
		/**     
		 * ��������� ���������� ������ input � textfield     
		 */    
		 textField.read(input, "p.txt");    
		 /**     
		  * ��������� �����     
		  */    
		 input.close();      
		 /**    
		  * ������������ ���������� e1 ���� FileNotFoundException    
		  */   
		 } catch (FileNotFoundException e1) {    
			 /**     
			  * �������� ����������, ������� ���������     
			  */    
			 e1.printStackTrace();       
			 /**    
			  * ������������ ���������� e1 ���� IOException     
			  */   
			 } catch (IOException e1) {    
				 /**     
				  * �������� ����������, ������� ���������     
				  */    
				 e1.printStackTrace();   
				 }     
	/**    
	 * ���� ��������� ������ ������, �� ����������� ��������� ���� "������ �������"   
	 */   
	if(textField.getText().equals(parolProverka)){     
		System.out.println("�� �����");            
		s.setSize(600,400);                 
		s.setTitle("������ �������");      
		/**       
		 * ��������� ��������, ������� ����� ����������� ��� �������� ����       
		 */      
		s.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);         
		/**       
		 * ��������� ���� �� �������� ������        
		 */      
		s.setLocationRelativeTo(null);                          
		/**       
		 * ������������ �������� GridLayout ��� ������������ ����������� ��            
		 * ������       
		 */      
		s.setLayout(new GridLayout(2,20,1,20));         
		/**       
		 * ������� ����������        
		 * vykhod ������ JButton,        
		 * vnestiVznos ������ JButton,        
		 * ostatokPoVznosamL ������ JLabel,       
		 * polychitVyplaty ������ JButton,        
		 * � ���������-���������� panel ������ JPanel, ������� ����� ���������    
		 * ����������������� ����������       
		 */ 
		JPanel panel=new JPanel();    
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
 
		JButton vykhod=new JButton("�����");    
		JButton vnestiVznos=new JButton("������ �����");         
		JLabel ostatokPoVznosamL= new JLabel("������� �� ��������� �������,���: ");    
		JButton polychitVyplaty=new JButton("�������� ��������� �������");         
		/**      
		 * � ��������� ��������� ostatokPoVznosam ��������������� ��������,   
		 * ���������� �� ������ UznatOstatok() ������ Formuly.      
		 * ��, ���� ����� � ��������� ���������� ostatokPoVznosam �������������   
		 * '0'(������� �� ���. ������� ����� 0),      
		 *  �� ����� UznatOstatok() ������ Formuly ���������� �� �����      
		 */     
		if(ostatokPoVznosam.getText().equals("0"))               
			System.out.println("������� �� ������� 0");     
		else  {      
			ostatokPoVznosam.setText(String.valueOf(UznatOstatok()));       
		}          
		/**      
		 * ������������� ������������ ����������� ostatokPoVznosamL,   
		 * ostatokPoVznosam, vnestiVznos, vykhod, polychitVyplaty (�� ��������)      
		 */     
		ostatokPoVznosamL.setAlignmentX(Component.CENTER_ALIGNMENT);      
		ostatokPoVznosam.setAlignmentX(Component.CENTER_ALIGNMENT);      
		vnestiVznos.setAlignmentX(Component.CENTER_ALIGNMENT);      
		vykhod.setAlignmentX(Component.CENTER_ALIGNMENT);      
		polychitVyplaty.setAlignmentX(Component.CENTER_ALIGNMENT);            
		/**      
		 * ��������� ���������� ostatokPoVznosamL, ostatokPoVznosam,       
		 * vnestiVznos, polychitVyplaty, vykhod �� ������ panel      
		 */     
		panel.add(Box.createVerticalGlue());      
		panel.add(ostatokPoVznosamL);      
		/**      
		 * ��������� �������      
		 */     
		panel.add(Box.createVerticalGlue());      
		panel.add(ostatokPoVznosam);        
		panel.add(Box.createVerticalGlue());       
		panel.add(vnestiVznos);     
		panel.add(Box.createVerticalGlue());      
		panel.add(polychitVyplaty);     
		panel.add(Box.createVerticalGlue());      
		panel.add(vykhod);     
		panel.add(Box.createVerticalGlue());  
 
    /**      
     * ��������� ��������� � ������ vykhod � ������� ������      
     * addActionListener.      
     */     
		vykhod.addActionListener(new ActionListener() {      
			public void actionPerformed(ActionEvent e) {       
				/**       
				 * ����� ��������� ������������        
				 */       
				s.setVisible(false);              
				}     
			});       
    /**      
     * ��������� ��������� � ������ vnestiVznos � ������� ������      
     * addActionListener.      
     */     
		vnestiVznos.addActionListener(new ActionListener() {      
			public void actionPerformed(ActionEvent e) {       
				/**         
				 * �������� ����� VnestiStrVznos()         
				 */       
				VnestiStrVznos();           
				}     
			});          
		/**      
		 * ��������� ��������� � ������ polychitVyplaty � ������� ������      
		 *addActionListener.      
		 */     
		polychitVyplaty.addActionListener(new ActionListener() {      
			public void actionPerformed(ActionEvent e) {       
				/**        
				 * ���� ����� � ostatokPoVznosam �������������   
				 * '0'(��������� ������ �������),        
				 * ������� ������ ������ StrVyplata � �������� �����   
				 * zapusk()        
				 */       
				if(ostatokPoVznosam.getText().equals("0")) {        
					StrVyplata myVyplata=new StrVyplata();        
					myVyplata.zapusk();       
				}else           
					System.out.println("������� �� ��������� ������ �� 0");     
				}     
			});            
		s.add(panel);      
		s.setVisible(true);    
		}  
	}    
	/**   
	 * ����� VnestiStrVznos()   
	 */ 
	public void VnestiStrVznos(){   
		/**    
		 * � ���������� StrPrem ������ Formuly ������������� �������� '0'    
		 */   
		OsnF.obj2.setStrPrem(0);   
		/**    
		 * � ��������� ��������� ostatokPoVznosam ������������� �������� '0'    
		 */   
		ostatokPoVznosam.setText("0");  
		}     
	/**   
	 * ����� UznatOstatok()   
	 */  
	public int UznatOstatok(){   
		/**    
		 * �������� ����� RaschitatSP() ������ Formuly    
		 */   
		return OsnF.obj2.RaschitatSP();  
		}  
	} 
     