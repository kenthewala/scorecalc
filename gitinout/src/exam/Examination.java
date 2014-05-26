/**
 * 
 */
package exam;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author anoop
 *
 */
@Entity
public class Examination {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int noOfQuestions;
	private Time duration;
	
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
	 * @return the noOfQuestions
	 */
	public int getNoOfQuestions() {
		return noOfQuestions;
	}
	/**
	 * @param noOfQuestions the noOfQuestions to set
	 */
	public void setNoOfQuestions(int noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}
	/**
	 * @return the duration
	 */
	public Time getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Time duration) {
		this.duration = duration;
	}

}
