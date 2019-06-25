package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Search")
public class Search {

	@Id
	private String id;
	//@Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
	private String searchTerm;
	
	//@Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
	private int  searchCount;
//	private String password;
//	private String fullname;
//	private boolean enabled;
//	@DBRef
//	private List<Role> roles;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSearchTerm() {
		return this.searchTerm;
	}
	public void setSerchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	public int getsearchCount() {
		return this.searchCount;
	}
	public void setSearchCount(int searchCount) {
		this.searchCount = searchCount;
	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	public String getFullname() {
//		return fullname;
//	}
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
//	public boolean isEnabled() {
//		return enabled;
//	}
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//	public List<Role> getRoles() {
//		return roles;
//	}
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}
	
}


