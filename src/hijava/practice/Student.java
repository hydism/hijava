package hijava.practice;

public class Student {

	public String stdNum;
	public String stdName;
	public String stdAge;
	public String stdPhnum;

	public Student() {
	}

	public Student(String name) {
		this.setStdName(name);
	}

	public Student(String num, String name, String age, String phnum) {
		this.setRecord(num, name, age, phnum);
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAge() {
		return stdAge;
	}

	public void setStdAge(String stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdPhnum() {
		if(this.stdPhnum != null || stdPhnum.length() < 4) {
			return stdPhnum;
		} else {
			return stdPhnum.substring(0, stdPhnum.length() - 4);
		}
	}

	public void setStdPhnum(String phnum) {
	this.stdPhnum = phnum.substring(0, phnum.length() - 4);
		
	}

	public String getStdNum() {
		return this.stdNum;
	}
	
	public void setStdNum(String num) {
		this.stdNum = num;
	}

	//오버라이드 : 부모클래스에 상속된 함수를 재정의한것.
	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdPhnum=" + stdPhnum
				+ "****" + "]";
	}
	
	public void setRecord(String num, String name, String age, String phnum)	{
		this.setStdNum(num);
		this.setStdName(name);
		this.setStdAge(age);
		this.setStdPhnum(phnum);
	}
}
