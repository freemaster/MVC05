package kr.smhrd.model;

public class MemberVO {
	private int num;
	private String id;
	private String pass;
	private String mname;
	private int mage;
	private String memail;
	private String mtel;
	
	public MemberVO() {
		super();
	}
	
	public MemberVO(int num, String id, String pass, String mname, int mage, String memail, String mtel) {
		super();
		this.num = num;
		this.id = id;
		this.pass = pass;
		this.mname = mname;
		this.mage = mage;
		this.memail = memail;
		this.mtel = mtel;
	}

	public MemberVO(String id, String pass, String mname, int mage, String memail, String mtel) {
		super();
		this.id = id;
		this.pass = pass;
		this.mname = mname;
		this.mage = mage;
		this.memail = memail;
		this.mtel = mtel;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getMname() {
		return mname;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public int getMage() {
		return mage;
	}
	
	public void setMage(int mage) {
		this.mage = mage;
	}
	
	public String getMemail() {
		return memail;
	}
	
	public void setMemail(String memail) {
		this.memail = memail;
	}
	
	public String getMtel() {
		return mtel;
	}
	
	public void setMtel(String mtel) {
		this.mtel = mtel;
	}

	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", id=" + id + ", pass=" + pass + ", mname=" + mname + ", mage=" + mage
				+ ", memail=" + memail + ", mtel=" + mtel + "]";
	}
}
