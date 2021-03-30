/**
 * 
 */
package exam;

/**
 * @author leo
 *
 */
public class Person {

	/**
	 * Contractor to init names
	 */
	public String full_name = "";
	public String last_name = "";
	public String mid_name  = "";
	public String first_name= "";
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.full_name = name;
		String [] name_component = name.split(" ");
//		System.out.println(name_component.length);
		
		if (name_component.length > 1) {
			this.last_name = name_component[0];
			this.first_name = name_component[name_component.length-1];
			
			this.mid_name = "";
			for(int i=1; i<name_component.length-1;i++) {
				this.mid_name += name_component[i]+" ";
				
			}
		}
		else if(name_component.length == 2) {
			this.last_name = "";
			this.mid_name = name_component[0];
			this.first_name = name_component[1];
		}
		else if (name_component.length == 2) {
			this.last_name = "";
			this.mid_name = "";
			this.first_name = name_component[0];
		}
		else {
			this.first_name = "";
			this.mid_name = "";
			this.last_name = "";
		}
	}
	
	/**
	 * These methods get components in name to process
	 * @return
	 */
	public String get_fullName() {
		return this.full_name;
	}
	
	public String get_FirstName() {
		return this.first_name;
	}
	
	public String get_LastName() {
		return this.last_name;
	}
	
	public String get_MiddleName() {
		return this.mid_name;
	}
	
	/**
	 * these method to set attribute of object
	 */
	
	public String set_lastName(String lastName) {
		return this.last_name = lastName;
	}
	public String set_firstName(String firstName) {
		return this.first_name = firstName;
	}
	public String set_middleName(String middleName) {
		return this.mid_name = middleName;
	}
	public String set_fullName(String fullName) {
		return this.full_name = fullName;
	}
	
	
	/**
	 * these methods to compare name
	 * @param first_name2
	 * @return
	 */
	public boolean has_firstName_is_bigger_(String first_name2) {
		return this.first_name.compareTo(first_name2) > 0;
	}
	
	public boolean has_middleName_is_bigger_(String name) {
		return this.mid_name.compareTo(name) < 0;
	}
	
	public boolean has_firstName_equal_(String name) {
		return this.mid_name.compareTo(name) == 0;
	}
	
	public static void main(String[] args) {
		Person k = new Person("Y Buăn Adrơng");
//		System.out.println(k.full_name);
		System.out.println(k.first_name);
		System.out.println(k.last_name);
		System.out.println(k.mid_name);
		
	}
}
