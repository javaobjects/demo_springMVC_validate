package net.ptcs.demo.entity;

import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {
	/*bookId:非空校验，整数校验，大于0的校验
	 * bookName:非空校验，不能有非法字符（符合书名的正则表达式规范）
	 * intoStoreTime：非空校验
	 * publishName：非空校验，不能有非法字符（符合出版社名的正则表达式规范）
	 * price：非空校验，大于0，小数校验*/
	
	@NotNull(message="{book.bookId.isNull}")
	private Integer bookId;
	@NotBlank(message="{book.bookName.isNull}")
	@Size(min=3,max=40,message="{book.bookName.size}")
	private String bookName;
	@NotNull(message="{book.intoStoreTime.isNull}")
	private Date intoStoreTime;
	@NotBlank(message="{book.publishName.isNull}")
	private String publishName;
	
	
	@Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
	@NotBlank(message = "手机号码不能为空")
	private String phone;
	
	
	@NotNull(message="{book.price.isNull}")//对于数字校验是否为空使用@NotNull,String类型使用@NotBlank list类型使用@NotEmpty
	@Digits(fraction = 2, integer = 100, message="{book.price.error}")//对于小数进行校验，限定整数数位integer和小数数位fraction
	@DecimalMin(value = "0", message="{book.price.value}")//对值进行校验，必须大于等于value的值
	private Double price;

	public Book() {
		super();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
