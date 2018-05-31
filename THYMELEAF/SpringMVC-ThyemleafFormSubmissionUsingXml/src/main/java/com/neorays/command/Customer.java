package com.neorays.command;

public class Customer {

	 private long id;
	    private String firstname;
	    private String lastname;
	     
	 
	    public long getId() {
	        return id;
	    }
	 
	    public void setId(long id) {
	        this.id = id;
	    }
	 
	    public String getFirstname() {
	        return firstname;
	    }
	 
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	 
	    public String getLastname() {
	        return lastname;
	    }
	 
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
		}
	    
}
