package pekan7_2511531001;

public class Akun_2511531001 {
	// variabel global
	private String Usrname,Pssword,Email;
	private int pinAngka;
	
	// mutator setter
	public void setUsrname (String Usrname) {
		this.Usrname=Usrname;
	}
	public void setPssword (String Pssword) {
		this.Pssword=Pssword;
	}
	public void setEmail (String Email) {
		this.Email=Email;
	}
	public void setpinAngka (int pinAngka) {
		this.pinAngka=pinAngka;
	}

	// accessor getter
	public String getUsrname() {
		return Usrname;
	}
	public String getPssword() {
		return Pssword;
	}
	public String getEmail() {
		return Email;
	}
	public int getpinAngka() {
		return pinAngka;
	}
	
	// helper method
	public boolean isPasswordValid() {
		return Pssword.length()>= 8;	
	}
	public boolean isEmailValid( ) {
		return Email.contains("@") && Email.contains(".");
		
	}
}
