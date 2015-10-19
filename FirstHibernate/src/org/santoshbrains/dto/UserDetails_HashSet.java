package org.santoshbrains.dto;
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

@Entity
public class UserDetails_HashSet {
	@Id
	private String userId;
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
	joinColumns=@JoinColumn(name="USER_ID")
	)
	Set<Address> collAddress = new HashSet<Address>();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Set<Address> getCollAddress() {
		return collAddress;
	}
	public void setCollAddress(Set<Address> collAddress) {
		this.collAddress = collAddress;
	}
}
