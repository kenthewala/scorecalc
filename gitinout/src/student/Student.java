/**
 * 
 */
package student;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import library.Book;
import programme.Programme;
import common.Address;
import common.Phone;
import enums.StudentType;

/**
 * @author anoop
 *
 */
@Entity
public class Student {
	
	//sequence generator with name specified.
	@SequenceGenerator(name="stud_gen", sequenceName="stud_seq")
	@Id @GeneratedValue(generator="stud_gen")
	private int id;
	private String firstName;
	private String middleName;
	private String surname;
	private String fathersName;
	@Embedded
	private Address address;
	@ManyToOne
	@JoinColumn(name="programme_id")//owner of the many to one relationship will have the @Joincolumn annotation.
	private Programme programme;
	//centre information will be taken out from programme
	
	//example of enumerated type string.
	@Enumerated(EnumType.STRING)
	private StudentType type;
	
	@OneToOne
	//suppressing this annotations just to see what name gets generated in db for the join column. @JoinColumn(name="book_id")
	private Book book;
	
	@JoinTable(name="emp_phone",
			joinColumns=@JoinColumn(name="student_id"),
			inverseJoinColumns=@JoinColumn(name="phone_id"))
	private List<Phone> phones;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the fathersName
	 */
	public String getFathersName() {
		return fathersName;
	}

	/**
	 * @param fathersName the fathersName to set
	 */
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the programme
	 */
	public Programme getProgramme() {
		return programme;
	}

	/**
	 * @param programme the programme to set
	 */
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}

	/**
	 * @return the type
	 */
	public StudentType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(StudentType type) {
		this.type = type;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @return the phones
	 */
	public List<Phone> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
		

}
