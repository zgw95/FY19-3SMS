package com.zgw.sms;
/*
 *  ѧ����
 * 	���ԣ�
	 * id��
	 * ������
	 * �Ա�
	 * ���䣨1~120����
	 * �����꼶���������м����߼���
	 * ��ַ��
	 * ��ϵ��ʽ��11λ�ֻ��ţ���
	 * �������䣨����@��.com�� 
 */
public class Student {
	
	//������ �޲Σ��в�
	public Student()
	{
		
	}
		
	public Student(int id,String stuName,int stuAge,String stuSex,String stuGrade,String stuTel,String stuEmail,String stuAddress) 
	{
		super();
		this.id = id;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuGrade = stuGrade;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;	
		this.stuAddress = stuAddress;
	}
	


	//˽������
	private int id;
	
	private String stuName;
	
	private int stuAge;
	
	private String stuSex;
	
	private String stuGrade;
	
	private String stuTel;
	
	private String stuEmail;
	
	private String stuAddress;
	
	
	//����˽�����Ե�public����
	//����1 id
  	public int getId()
  	{
  		return id;
  	}
  	public void setId(int id)
  	{
  		this.id = id;
  	}
  	//����2  ����
  	public String getName()
  	{
  		return stuName;
  	}
  	public void setName(String name)
  	{
  		this.stuName = name;
  	}
  	//����3 �Ԅe
  	public String getSex()
  	{
  		return stuSex;
  	}
  	public void setSex(String sex)
  	{
  		this.stuSex = sex;
  	}
  	//����4 ����
  	public int getAge()
  	{
  		return stuAge;
  	}
  	public void setAge(int age)
  	{
  		this.stuAge = age;
  	}
  	//����5�����༉
  	public String getGrade()
  	{
  		return stuGrade;
  	}
  	public void setGrade(String grade)
  	{
  		this.stuGrade = grade;
  	}
  	//����6��ַ
  	public String getAddress()
  	{
  		return stuAddress;
  	}
  	public void setAddress(String address)
  	{
  		this.stuAddress = address;
  	}
  	//����7��ϵ��ʽ
  	public String getTel()
  	{
  		return stuTel;
  	}
  	public void setTel(String telephone)
  	{
  		this.stuTel = telephone;
  	}	
  	//����8��������
  	public String getEmail()
  	{
  		return stuEmail;
  	}
  	public void setEmail(String email)
  	{
  		this.stuEmail = email;
  	}
	
  	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex
				+ ", stuGrade=" + stuGrade + ", stuTel=" + stuTel + ", stuEmail=" + stuEmail + ", stuAddress="
				+ stuAddress + "]";
	}	

}
