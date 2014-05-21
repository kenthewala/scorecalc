/**
*
*/
package centre;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
* @author anoop
*
*/

@Entity
public class Centre {

@Id
private int id;
private String name;
private String address;
private String comments;


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

}