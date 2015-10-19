package org.santoshbrains.dto;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity (name="USER_DETAILS") //This class is treated as entity class
@Table (name="USER_DETAILS_FROM")
public class UserDetails {
	//This field will be primary key for the object
	@Id	@GeneratedValue(strategy=GenerationType.TABLE)
	private int u_ID;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column = @Column(name="HOME_ADDRESS_STREET")),
		@AttributeOverride(name="city",column=@Column(name="HOME_ADDRESS_CITY")),
		@AttributeOverride(name="state",column=@Column(name="HOME_ADDRESS_STATE")),
		@AttributeOverride(name="zip",column=@Column(name="HOME_ADDRESS_ZIP"))})
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	private String user_ID;
	public int getU_ID() {
		return u_ID;
	}

	public void setU_ID(int u_ID) {
		this.u_ID = u_ID;
	}
	@Column(name="emailAddress")
	private String email_Address;
	private String name;
	//@Transient
	@Temporal(TemporalType.DATE)
	private Date dateOfJoining;
	
	private String physicalAddress;

	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getEmail_Address() {
		return email_Address;
	}
	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
