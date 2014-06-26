/**
*
*/
package centre;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

import programme.Programme;

/**
* @author anoop
*
*/

@Entity
public class Centre {

@Id @GeneratedValue(strategy=GenerationType.TABLE,generator="gurukul_centre_id")
@TableGenerator(name="gurukul_centre_id",
table="gurukul_gen",
pkColumnName="gen_name",
valueColumnName="gen_val",
initialValue=1,
allocationSize=1)
private int id;

private String name;
private String address;

@Basic(fetch=FetchType.LAZY)
private String comments;

@OneToMany(targetEntity=Programme.class, mappedBy="centre")
private List<Programme> programmes;
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
* @return the address
*/
public String getAddress() {
return address;
}
/**
* @param address the address to set
*/
public void setAddress(String address) {
this.address = address;
}
/**
* @return the comments
*/
public String getComments() {
return comments;
}
/**
* @param comments the comments to set
*/
public void setComments(String comments) {
this.comments = comments;
}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((comments == null) ? 0 : comments.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Centre other = (Centre) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (comments == null) {
		if (other.comments != null)
			return false;
	} else if (!comments.equals(other.comments))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
/**
 * @return the programmes
 */
public List<Programme> getProgrammes() {
	return programmes;
}
/**
 * @param programmes the programmes to set
 */
public void setProgrammes(List<Programme> programmes) {
	this.programmes = programmes;
}



}