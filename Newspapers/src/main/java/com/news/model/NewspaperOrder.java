package com.news.model;

import java.util.Objects;

public class NewspaperOrder {

	private long id;
	private String newspaper;
	private String price;
	private float date;

	// constructor to retrieve from db
	public NewspaperOrder(long id, String newspaper, String price, float date) {
		super();
		this.id = id;
		this.newspaper = newspaper;
		this.price = price;
		this.date = date;
	}

	// Constructor to post to db without id
	public NewspaperOrder(String newspaper, String price, float date) {
		super();
		this.newspaper = newspaper;
		this.price = price;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(String newspaper) {
		this.newspaper = newspaper;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public float getDate() {
		return date;
	}

	public void setDate(float date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, newspaper, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewspaperOrder other = (NewspaperOrder) obj;
		return Float.floatToIntBits(date) == Float.floatToIntBits(other.date) && id == other.id
				&& Objects.equals(newspaper, other.newspaper) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "NewspaperOrder [id=" + id + ", newspaper=" + newspaper + ", price=" + price + ", date=" + date + "]";
	}

}
