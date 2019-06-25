package net.ptcs.demo.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
	/*bookId:非空校验，整数校验，大于0的校验
	 * bookName:非空校验，不能有非法字符（符合书名的正则表达式规范）
	 * intoStoreTime：非空校验
	 * publishName：非空校验，不能有非法字符（符合出版社名的正则表达式规范）
	 * price：非空校验，大于0，小数校验*/
	
	@NotNull(message="{book.bookId.isNull}")
	private Integer bookId;
	@NotNull(message="{book.bookName.isNull}")
	@Size(min=3,max=40,message="{book.bookName.size}")
	private String bookName;
	@NotNull(message="{book.intoStoreTime.isNull}")
	private Date intoStoreTime;
	@NotNull(message="{book.publishName.isNull}")
	private String publishName;
	@NotNull(message="{book.price.isNull}")
	private Double price;

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", intoStoreTime=" + intoStoreTime + ", publishName="
				+ publishName + ", price=" + price + "]";
	}

	public Book(Integer bookId, String bookName, Date intoStoreTime,
			String publishName, Double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.intoStoreTime = intoStoreTime;
		this.publishName = publishName;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getIntoStoreTime() {
		return intoStoreTime;
	}

	public void setIntoStoreTime(Date intoStoreTime) {
		this.intoStoreTime = intoStoreTime;
	}

	public String getPublishName() {
		return publishName;
	}

	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
