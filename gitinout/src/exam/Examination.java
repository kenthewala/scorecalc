/**
 * 
 */
package exam;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import programme.Programme;

/**
 * @author anoop
 *
 */
@Entity
public class Examination {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	private Programme programme;
	private Date date;
	private int noOfQuestions;
	private int weightPerCorrectAnswer;
	private int weightPerWrongAnswer;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	 * @return the weightPerCorrectAnswer
	 */
	public int getWeightPerCorrectAnswer() {
		return weightPerCorrectAnswer;
	}
	/**
	 * @param weightPerCorrectAnswer the weightPerCorrectAnswer to set
	 */
	public void setWeightPerCorrectAnswer(int weightPerCorrectAnswer) {
		this.weightPerCorrectAnswer = weightPerCorrectAnswer;
	}
	/**
	 * @return the weightPerWrongAnswer
	 */
	public int getWeightPerWrongAnswer() {
		return weightPerWrongAnswer;
	}
	/**
	 * @param weightPerWrongAnswer the weightPerWrongAnswer to set
	 */
	public void setWeightPerWrongAnswer(int weightPerWrongAnswer) {
		this.weightPerWrongAnswer = weightPerWrongAnswer;
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
