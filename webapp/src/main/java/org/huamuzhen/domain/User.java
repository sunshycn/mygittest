package org.huamuzhen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER")
public class User implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "org.huamuzhen.dal.util.IdGenerator")
	@Column(name="ID", unique = true, nullable = false, length = 30)
	public String id;
	
	@Column(name="USERNAME", unique = true, nullable = false, length = 30)
	public String username;
	
	@Column(name="PASSWORD", nullable = false, length = 30)
	public String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
