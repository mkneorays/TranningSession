package com.neorays.command;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentCommand {
@NotEmpty(message="name is requried")
	String name;

@ NotNull(message="should not empty")
@Max(value=100, message="should no greater then 100")
@Min(value=10,message="should not less then  10")
	int age;
@NotEmpty(message="address is requried")
	String add;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "StudentCommand [name=" + name + ", age=" + age + ", add=" + add
				+ "]";
	}
	
}
