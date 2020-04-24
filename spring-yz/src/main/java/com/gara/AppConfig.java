package com.gara;


import org.springframework.context.annotation.ComponentScan;

/**
 * @author GARA
 */
//@Component
@ComponentScan(value = {"com.gara"})
public class AppConfig {

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppConfig() {
		System.out.println("===============" + AppConfig.class.getName());
	}

	public AppConfig(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
}
