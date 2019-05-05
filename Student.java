package com.zgw.sms;
/*
 *  学生类
 * 	属性：
	 * id，
	 * 姓名，
	 * 性别，
	 * 年龄（1~120），
	 * 所属年级（初级、中级、高级）
	 * 地址，
	 * 联系方式（11位手机号），
	 * 电子邮箱（包含@和.com） 
 */
public class Student {
	
	//构造器 无参，有参
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
	


	//私有属性
	private int id;
	
	private String stuName;
	
	private int stuAge;
	
	private String stuSex;
	
	private String stuGrade;
	
	private String stuTel;
	
	private String stuEmail;
	
	private String stuAddress;
	
	
	//访问私有属性的public方法
	//方法1 id
  	public int getId()
  	{
  		return id;
  	}
  	public void setId(int id)
  	{
  		this.id = id;
  	}
  	//方法2  名字
  	public String getName()
  	{
  		return stuName;
  	}
  	public void setName(String name)
  	{
  		this.stuName = name;
  	}
  	//方法3 性別
  	public String getSex()
  	{
  		return stuSex;
  	}
  	public void setSex(String sex)
  	{
  		this.stuSex = sex;
  	}
  	//方法4 年龄
  	public int getAge()
  	{
  		return stuAge;
  	}
  	public void setAge(int age)
  	{
  		this.stuAge = age;
  	}
  	//方法5所属班級
  	public String getGrade()
  	{
  		return stuGrade;
  	}
  	public void setGrade(String grade)
  	{
  		this.stuGrade = grade;
  	}
  	//方法6地址
  	public String getAddress()
  	{
  		return stuAddress;
  	}
  	public void setAddress(String address)
  	{
  		this.stuAddress = address;
  	}
  	//方法7联系方式
  	public String getTel()
  	{
  		return stuTel;
  	}
  	public void setTel(String telephone)
  	{
  		this.stuTel = telephone;
  	}	
  	//方法8电子邮箱
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
