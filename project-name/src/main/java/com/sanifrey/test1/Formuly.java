/**  
 * ������������� �������������� ������ � ������  
 */ 
package com.sanifrey.test1;


/**   
 * ��������� public �����, � ������� �������������� ������ 
 * ��������� ������, ������ �� ������������������� ������������ � ��������� ������� 
 */  
public class Formuly {    
	/**    
	 * ��������� private ���������� ���� int, ������������ ������ ��������� ������� (���.)   
	 */   
	private int StrVyp;    
	/**    
	 * ��������� private ���������� ���� int, ������������ ������ ��������� ������ (���.)   
	 */   
	private int StrPrem;    
	/**    
	 * ��������� � �������������� private ���������� ���� double, ������������ ���������   
	 * �����������   
	 */   
	private double predKoef=0.5;    
	/**    
	 * ��������� private ���������� ���� int, ������������ �������������� ����� (���.)   
	 */   
	private int dPr;    
	/**    
	 * ��������� private ���������� ���� int, ������������ ���������� ����� (���.)   
	 */   
	private int dPol; 
 
 /**   
  * ��������� private ���������� ���� int, ������������ ������� ���������������   
  * ����������� (%)  
  */   
	private int a; 
 
 /**  
  * ����� RaschitatSP().   
  * ��� ������ ������ ���������� ���������� ��������, ����������� �� ������� StrPrem=DPr*k,   
  *  � ���������� StrPrem � ������� ������ setStrPrem(int strPrem) ������ Formuly   
  */  
	public int RaschitatSP(){   
		return this.setStrPrem((int)(this.dPr*this.predKoef));  
	}    
/**   
 * ����� RaschitatY().   
 * ��� ������ ������ ���������� ������ ������    
 * � ����������� ����������� ��������   
 */  
	private int RaschitatY(){   int Y=0; 
 
  /**    
   * ���� dPol<dPr (���������� ����� ������ ��� ��������������)    
   */   
	if(this.dPol<this.dPr)     
		Y=this.dPr-this.dPol;   
	/**    
	 * ���� dPol>=dPr (���������� ����� ������ ��� ����� ���������������)    
	 */   
	else {          
		System.out.println("������ �� ���� ��������");    
		Y=0;   
	} 
	return Y;  
	} 
 
 /**  
  * ����� RaschitatSV().   
  * ��� ������ ������ ���������� ������ ��������� ������� �� ������� StrVyp=Y*a/100   
  * � ���������� ����������� �������� � ���������� StrVyp    
  */  
	public int RaschitatSV(){  
		return this.StrVyp= (int)(RaschitatY()*this.a/100);  
	}    
	/**   
	 * ������� � ������� ��� private ���������� ������� ������   
	 */   
	public double getPredKoef() {   
		return predKoef;  
	} 
 
 public void setPredKoef(double predKoef) {   
	 this.predKoef = predKoef;  
 }    
 public int getdPol() {   
	 return dPol;  
} 
 
 public void setdPol(int dPol) {   
	 this.dPol = dPol;  
 }    
 public int getdPr() {   
	 return dPr;  
} 
 
 public void setdPr(int dPr) {   
	 this.dPr = dPr;  
} 
 
 public int getStrVyp() {   
	 return StrVyp;  
} 
 
 public void setStrVyp(int strVyp) {   
	 StrVyp = strVyp;  
} 
 
 public int getStrPrem() {   
	 return StrPrem;  
} 
 
 public int setStrPrem(int strPrem) {   
	 StrPrem = strPrem;   
	 return strPrem;  
} 
 
 public int getA() {   
	 return a;  
} 
 
 public void setA(int a) {   
	 this.a = a;  
} 
} 
