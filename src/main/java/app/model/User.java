package app.model;


import javax.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
	private Long id;
	private String username;
	private String phoneNumber;
	private String email;
	private String address;
	private String password;
	private String passwordConfirm;
	private Date createAt;
	private Date updateAt;
	private Set<Role> roles;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Transient
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	@Column(name = "create_at")
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Column(name = "update_at")
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	 @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + ", password=" + password + ", passwordConfirm=" + passwordConfirm
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + ", roles=" + roles + "]";
	}

	
}