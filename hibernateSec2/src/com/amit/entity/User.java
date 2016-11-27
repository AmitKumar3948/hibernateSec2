package com.amit.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name="users")
public class User{

	@Id
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="enabled")
	private boolean enabled;
	@OneToMany
    @JoinColumn(name="user")
	private Set<UserRole> userRole = new HashSet<UserRole>(0);


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole> getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		//this.userRole = userRole;
}

}
