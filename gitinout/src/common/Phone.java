package common;

import enums.PhoneType;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Phone
 *
 */
@Entity

public class Phone implements Serializable {	   
	@Id
	@SequenceGenerator(name="phone_seq",sequenceName="phone_seq",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="phone_seq")
	private int id;
	private PhoneType type;
	private int number;
	private static final long serialVersionUID = 1L;

	public Phone() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public PhoneType getType() {
		return this.type;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}   
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
   
}
