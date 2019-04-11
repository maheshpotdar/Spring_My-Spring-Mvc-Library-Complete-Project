package com.mahesh.Model;

public class BeanLibrarianHandle {

	private String callNo, bookName, author, publisher, studname,studmobile;
	private int qty, issued, id, status,studid;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public BeanLibrarianHandle(String callNo, String bookName, String author, String publisher, String studname,
			int studid, String studmobile, int qty, int issued, int id, int status) {
		super();
		this.callNo = callNo;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.studname = studname;
		this.studid = studid;
		this.studmobile = studmobile;
		this.qty = qty;
		this.issued = issued;
		this.id = id;
		this.status = status;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudmobile() {
		return studmobile;
	}

	public void setStudmobile(String studmobile) {
		this.studmobile = studmobile;
	}

	public BeanLibrarianHandle(String callNo, String bookName, String author, String publisher, String studname,
			int studid, String studmobile, int qty, int issued, int id) {
		super();
		this.callNo = callNo;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.studname = studname;
		this.studid = studid;
		this.studmobile = studmobile;
		this.qty = qty;
		this.issued = issued;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCallNo() {
		return callNo;
	}

	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public String toString() {
		return "BeanLibrarianHandle [callNo=" + callNo + ", bookName=" + bookName + ", author=" + author
				+ ", publisher=" + publisher + ", studname=" + studname + ", studid=" + studid + ", studmobile="
				+ studmobile + ", qty=" + qty + ", issued=" + issued + ", id=" + id + ", status=" + status + "]";
	}

	public int getIssued() {
		return issued;
	}

	public void setIssued(int issued) {
		this.issued = issued;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BeanLibrarianHandle(String callNo, String bookName, String author, String publisher, int qty, int issued,
			int id) {
		super();
		this.callNo = callNo;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
		this.issued = issued;
		this.id = id;
	}

	public BeanLibrarianHandle() {
		super();
	}

}
