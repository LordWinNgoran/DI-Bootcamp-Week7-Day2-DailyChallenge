// Daily Challenge: Author & Book Classes
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write class Author, Book
* date: 07/02/2023
*/

package daily;


/*
 * @description: Create a class called Author is designed as shown in the class diagram.
 * 
 */
public class Author {
	private String name;
	private String email;
	private char gender;
	private boolean isMale = true;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// return name + " (" + gender + ") at " + email;
		return """
				%s (%s) at %s
				""".formatted(name, gender, email);
	}
}
