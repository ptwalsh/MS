package account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	//@Id
	//@GeneratedValue
	private Long id;
	private String firstname;
	private String secondname;
	private String accountnumber;
	
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondName(String secondname) {
		this.secondname = secondname;
	}
	public String getAccountNumber() {
		return accountnumber;
	}
	public void setAccountNumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;;
	}
	
}
