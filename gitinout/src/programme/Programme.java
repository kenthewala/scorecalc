/**
 * 
 */
package programme;

import java.sql.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import student.Student;
import centre.Centre;
import enums.ProgrammeType;


/**
 * @author anoop
 *
 */
@Entity
@Access(AccessType.FIELD)
public class Programme {
	
	//sequence generator with no name specified.
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Transient private String name;
	private int year;
	
	@ManyToOne
	@JoinColumn(name="centre_id")
	private Centre centre;
	
	@Column(name="course_duration")
	private int duration;
	private Date startDate;
	private Date expectedEndDate;
	
	//example of enumerated type ordinal
	@Enumerated(EnumType.ORDINAL)
	private ProgrammeType type;
	
	@OneToMany(mappedBy="programme")
	private List<Student> students;
	
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
	 * @return the name
	 */
	@Access(AccessType.PROPERTY)
	//the property to be mapped is determinded by the return type of the getter.
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the centre
	 */
	public Centre getCentre() {
		return centre;
	}
	/**
	 * @param centre the centre to set
	 */
	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the expectedEndDate
	 */
	public Date getExpectedEndDate() {
		return expectedEndDate;
	}
	/**
	 * @param expectedEndDate the expectedEndDate to set
	 */
	public void setExpectedEndDate(Date expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}

}
