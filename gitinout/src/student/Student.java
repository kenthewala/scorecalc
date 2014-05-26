/**
 * 
 */
package student;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
	private String name;
	private String fathersName;
	//todo:
	//private Address address;
	
	//example of enumerated type string.
	@Enumerated(EnumType.STRING)
	private StudentType type;
	

}
