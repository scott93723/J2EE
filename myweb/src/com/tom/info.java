package com.tom;

public class info {
	String infoname;
	String tel;
	String address;
	String gender;
	String com;

	public info() {

	}

	public info(String infoname, String tel, String address, String gender, String com) {
		super();
		this.infoname = infoname;
		this.tel = tel;
		this.address = address;
		this.gender = gender;
		this.com = com;
	}

	public String getInfoname() {
		return infoname;
	}

	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	

	public boolean validate() {

		
		boolean error = false;
		if (infoname.length()<4 || infoname.length()>20){
			infoname = "帳號長度錯誤(4-20)";
			error = true;
		}
		if (tel.length()<6 || tel.length()>20){
		//	errorPassword = "密碼長度錯誤(6-20)";
			error = true;
		}
//		if (address.address()){
//		//	errorPasswordNotMatch = "兩組密碼不相同";
//			error = true;
//		}
//		if (com.indexOf("@")==-1){
//			errorEmail = "Email格式錯誤";
//			error = true;
//		}
		if (error){
			return false;			
		}else{
			return true;
		}
		
	//	return false;
	}



}