package com.manios.solr.dokimos;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

/**
 * 
 * @author cmanios
 */
public class SolrIndexDocument {

	@Id
	@Field
	private String id;
	@Field
	private String name;
	@Field
	private String surname;
	@Field
	private Integer age;
	@Field
	private String airplane;

	public SolrIndexDocument() {
	}

	public SolrIndexDocument(String id, String name, String surname,
			Integer age, String airplane) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.airplane = airplane;
	}

	/**
	 * Returns the document's unique id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the document's unique id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}

}
