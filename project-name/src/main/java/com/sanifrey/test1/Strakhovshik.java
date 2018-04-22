/**  
 * ������������� �������������� ������ � ������  
 */ 
package com.sanifrey.test1;


/**  
 * ���������� ����������  
 */ 
import java.awt.Color; 
import java.awt.Component; 
import java.awt.FlowLayout; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.awt.Insets; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.BoxLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 
 
/**   
 * ��������� public �����, � ������� �������������� ��������� ���������� ������  
 */  
public class Strakhovshik{ 
 
 /**     
  * ��������� ����������� ������    
  */    
	public Strakhovshik(){  
	} 
 
 /**    
  * ����� zapusk ��� ������������� � ����������� ������   
  */   
	public void zapusk(){   
		/**   
		 * ������ ������ ������ JFrame   
		 */   
		JFrame s=new JFrame();       
		/**    
		 * ��������� ��������� ����    
		 */  
		s.setTitle("����������");    
		s.setSize(600,400);    
		/**    
		 * ��������� ��������, ������� ����� ����������� ��� �������� ����    
		 */   
		s.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    
  /**    
   * ��������� ���� �� �������� ������     
   */   
		s.setLocationRelativeTo(null);                         
		/**   
		 * ������������ �������� FlowLayout ��� ������������ ����������� �� ������   
		 */   
		s.setLayout(new FlowLayout());    
 
  /**    
   * ������� ���������-���������� panel ������ JPanel, ������� ����� ��������� ������   
   *��� ���� �����������, ����� � ������ "���������"    
   */   
		JPanel panel=new JPanel();   
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));      
		/**    
		 * ������� ���������-���������� panelStrPredpRisk ������ JPanel ��� ���� �����������    
		 */   
		JPanel panelStrPredpRisk=new JPanel();   
		/**    
		 * ������� ��������� label ������ JLabel     
		 */   
		JLabel label=new JLabel("������� ��������� ������!");   
		/**    
		 * ������������� ���� ������ ����� label    
		 */   
		label.setForeground(Color.RED);     
		/**    
		 * ������� ��������� VnestiKoef ������ JButton    
		 */  
		JButton VnestiKoef=new JButton("���������");       
		final JTextField predprKoefTF=new JTextField("0");       
		/**    
		 * ������������� ������������ ����������� panelStrPredpRisk, label � VnestiKoef   
		 *(�� ��������)    
		 */   
		panelStrPredpRisk.setAlignmentX(Component.CENTER_ALIGNMENT);    
		label.setAlignmentX(Component.CENTER_ALIGNMENT);   
		VnestiKoef.setAlignmentX(Component.CENTER_ALIGNMENT); 
 
  /**    
   * ��������� ���������� label, panelStrPredpRisk, VnestiKoef �� ������ panel    
   */  
		panel.add(label);  
		panel.add(panelStrPredpRisk);  
		panel.add(VnestiKoef);       
	/**    
	 * ��������� �������� ������ �� �����   
	 */   
	s.add(panel);       
	/**    
	 * ������������� ��� ��������� GridBagLayout ��� ���������� ����������� �� ������   
	 * panelStrPredpRisk    
	 */   
	panelStrPredpRisk.setLayout(new GridBagLayout()); 
 
  /**    
   * ������� ��������� predprKoefL ������ JLabel    
   */   
	JLabel predprKoefL=new JLabel("����������� ��� ������� ��������� �������: "); 
  /**   
   *  � ���� predprKoefTF ������������� ��������, ���������� �� ������ getPredKoef()    
   * ������ Formuly     
   */   
	predprKoefTF.setText(Double.toString(OsnF.obj2.getPredKoef()));                        
  /**    
   * ��������� ���������� predprKoefL, predprKoefTF, VnestiKoef �� ������   
   * panelStrPredpRisk    
   */   
	panelStrPredpRisk.add(predprKoefL,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));   
	panelStrPredpRisk.add(predprKoefTF,new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));   
	panelStrPredpRisk.add(VnestiKoef,new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));     
  /**    
   * ��������� ��������� � ������ VnestiKoef � ������� ������    
   *addActionListener.    
   */  
	VnestiKoef.addActionListener(new ActionListener() {    
		public void actionPerformed(ActionEvent e) {      
			/**       
			 * �������� ����� sohranitKoef(double koef)       
			 */     
			sohranitKoef(Double.parseDouble(predprKoefTF.getText()));    
			}   
		}); 
 
  s.setVisible(true);  
  }    
/**   
 * ����� sohranitKoef(double koef).   
 * ��� ������ ������ ���������� ���������� ����������� �������� � �������� ������������    
 * ����������� � ������� ������ setPredKoef(double predKoef) ������ Formuly   
 */ 
	public void sohranitKoef(double koef) {   
		OsnF.obj2.setPredKoef(koef);  
		} 
	} 
