package com.litmus7.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Member")

public class Member {

    @Id

    private String id;

    private String firstName;

    private String lastName;
    
    private String email;

    public Member() {}

    public Member(String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

 /**

 * @return the id

 */

public String getId() {

return id;

}

/**

 * @param id the id to set

 */

public void setId(String id) {

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

 * @return the lastName

 */

public String getLastName() {

return lastName;

}

/**

 * @param lastName the lastName to set

 */

public void setLastName(String lastName) {

this.lastName = lastName;

}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



}
