package org.santoshbrains.dto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails_ArrayList {
	@Id
	private String userId;
	@ElementCollection
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue (generator="sequence",strategy=GenerationType.TABLE)
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "myGenerator", type = @Type(type="long") )
	private Collection<Address> collAddress = new ArrayList<Address>();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Collection<Address> getCollAddress() {
		return collAddress;
	}
	public void setCollAddress(Collection<Address> collAddress) {
		this.collAddress = collAddress;
	}
	
}
