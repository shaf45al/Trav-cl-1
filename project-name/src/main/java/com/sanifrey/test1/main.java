/**  
 * ������������� �������������� ������ � ������  
 */
package com.sanifrey.test1;

/** 
 * ���������� ����� ������� 
 */ 
	import java.awt.EventQueue; 
 
/** 
 * ��������� public ����� 
 */ 
	public class main {  
	 /**  
	  * ������ ����������  
	  */  
	public static void main(String[] args) {   
	/**   
	 * ���������, ��� ��� ���������� ��������� � ������� ������   
	 */   
	EventQueue.invokeLater(new Runnable() {   
		public void run() {     
			/**     
			 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ���     
			 * ������ ���������� try     
			 */ 
 
			try {      
				/**      
				 * ������ ������ myOsnF      
				 */      
				OsnF myOsnF= new OsnF();      
				/**       
				 * �������� ����� zapusk       
				 */      
				myOsnF.zapusk();           
				/**      
				 * ������������ ���������� e ���� Exception     
				 */    
			} catch (Exception e) {      
				/**       
				 * �������� ����������, ������� ���������       
				 */       
				e.printStackTrace();     
			}    
		}   
		});  
	} 
	}
     