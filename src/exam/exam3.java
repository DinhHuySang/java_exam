/**
 * 
 */
package exam;

//Declare the lib
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import exam.Person;

/**
 * @author leo
 *
 */

public class exam3 {
	String[] person_list;
	
	public exam3(String path_json) throws IOException, ParseException {
		this.person_list = exam3.dataBase_Name(path_json);
	}
	
	public static String[] dataBase_Name(String path) throws IOException, ParseException {
		JSONParser jsonparse = new JSONParser();
		FileReader reader = new FileReader(path);
		Object obj = jsonparse.parse(reader);
		JSONObject database = (JSONObject)obj;
		/**
		 * the json defined
		 * {
		 * 		"info":[
		 * 				   {
					        "id": "14520841",
					        "name": "Nguyễn Chí Thành",
					        "subject": "Hệ thống thông tin"
  						   },
  						........
		 * 				]
		 * }
		 */
		JSONArray info = (JSONArray)database.get("info");
		String [] name_list = new String[info.size()];
		
//		Input name_list
		for(int i=0; i<info.size(); i++) {
			JSONObject name = (JSONObject)info.get(i);
			name_list[i] = (String) name.get("name");
		}
		return name_list;
	}
		
	
//	public static void swap(Person a, Person b) {
//		Person temp = a;
//		a = b;
//		b = temp;
//	}
	public static void main(String[] args) throws IOException, ParseException{		
		// parsing file "infomation.json"
        String database_path = "./data/information.json";
        String[] database = exam3.dataBase_Name(database_path);
        ArrayList<Person> persons = new ArrayList();
//        System.out.println(Person("dao le huy").);
        
//        Add each Person to Arraylist  
        for(int i=0; i<database.length; i++) {
        	persons.add(new Person(database[i]));
        }
        /**
         * Sorting ....
         */
//        Sort first_name
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person a, Person b) {
                return (a.first_name.compareTo(b.first_name));
            }
        });
        
//        Sort mid_name
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person a, Person b) {
            	int flag = 0;
            	if(a.first_name.compareTo(b.first_name)==0) {
            		flag = (a.mid_name.compareTo(b.mid_name));
            	}
				return flag;
            }
        });
        for(int i=0; i<persons.size()/10; i++) {
        	System.out.println("full name: "+persons.get(i).full_name+"    last name: "+persons.get(i).last_name+"    mid name: "+persons.get(i).mid_name+"   first name: "+persons.get(i).first_name);
        }
	}




}
