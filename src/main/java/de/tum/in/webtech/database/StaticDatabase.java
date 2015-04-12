package de.tum.in.webtech.database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import de.tum.in.webtech.model.Presentation;
import de.tum.in.webtech.model.Student;

/**
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */
public class StaticDatabase {
	
	/**
	 * 
	 */
	static HashMap<Integer, Student> students = new HashMap<Integer, Student>();
	
	/**
	 * 
	 */
	static HashMap<Integer, Presentation> presentations = new HashMap<Integer, Presentation>();
	
	
	static {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("Vadim");
		s1.setLastName("Lopatkin");
		s1.setEmail("");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setFirstName("Robin");
		s2.setLastName("Gloster");
		s2.setEmail("");
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setFirstName("Tobias");
		s3.setLastName("Waltl");
		s3.setEmail("");
		
		Student s4= new Student();
		s4.setId(4);
		s4.setFirstName("Erol");
		s4.setLastName("Demirbas");
		s4.setEmail("");
		
		Student s5= new Student();
		s5.setId(5);
		s5.setFirstName("Florian");
		s5.setLastName("Gust");
		s5.setEmail("");
		
		Student s6= new Student();
		s6.setId(6);
		s6.setFirstName("Patrick");
		s6.setLastName("Bilic");
		s6.setEmail("");
		
		Student s7= new Student();
		s7.setId(7);
		s7.setFirstName("Aleksander");
		s7.setLastName("Umov");
		s7.setEmail("");
		
		Student s8= new Student();
		s8.setId(8);
		s8.setFirstName("Matthias");
		s8.setLastName("Holdorf");
		s8.setEmail("");
		
		Student s9= new Student();
		s9.setId(9);
		s9.setFirstName("Fridolin");
		s9.setLastName("Koch");
		s9.setEmail("");
		
		Student s10= new Student();
		s10.setId(10);
		s10.setFirstName("John-Matthieu");
		s10.setLastName("Gallard");
		s10.setEmail("");
		
		Student s11= new Student();
		s11.setId(11);
		s11.setFirstName("Janosch");
		s11.setLastName("Maier");
		s11.setEmail("maierj@in.tum.de");
		
		Student s12= new Student();
		s12.setId(12);
		s12.setFirstName("Martin");
		s12.setLastName("Mihaylov");
		s12.setEmail("");
		
		Student s13= new Student();
		s13.setId(13);
		s13.setFirstName("Stefan");
		s13.setLastName("Stark");
		s13.setEmail("");
		
		Student s14= new Student();
		s14.setId(14);
		s14.setFirstName("Manuel");
		s14.setLastName("Schultheiß");
		s14.setEmail("");
		
		Student s15= new Student();
		s15.setId(15);
		s15.setFirstName("Carola");
		s15.setLastName("Boettcher");
		s15.setEmail("");
		
		Student s16= new Student();
		s16.setId(16);
		s16.setFirstName("Daniel");
		s16.setLastName("Schosser");
		s16.setEmail("schosser@in.tum.de");
		
		Student s17= new Student();
		s17.setId(17);
		s17.setFirstName("René");
		s17.setLastName("Milzarek");
		s17.setEmail("rene.milzarek@in.tum.de");
		
		students.put(1, s1);
		students.put(2, s2);
		students.put(3, s3);
		students.put(4, s4);
		students.put(5, s5);
		students.put(6, s6);
		students.put(7, s7);
		students.put(8, s8);
		students.put(9, s9);
		students.put(10, s10);
		students.put(11, s11);
		students.put(12, s12);
		students.put(13, s13);
		students.put(14, s14);
		students.put(15, s15);
		students.put(16, s16);
		students.put(17, s17);
		
		Presentation p1 = new Presentation();
		p1.setId(1);
		p1.setTitle("AKKA.io - The muscle");
		p1.setStartDate(new Date());
		p1.setPresenter(s1);
		
		Presentation p2 = new Presentation();
		p2.setId(2);
		p2.setTitle("AnuglarJS - Binding the data (dropped)");
		p2.setStartDate(new Date());
		p2.setPresenter(s2);
		
		Presentation p3 = new Presentation();
		p3.setId(3);
		p3.setTitle("Building Isomorphic apps with Meteor JS");
		p3.setStartDate(new Date());
		p3.setPresenter(s3);
		
		Presentation p4 = new Presentation();
		p4.setId(4);
		p4.setTitle("Docker and AWS - Clouds in the sky");
		p4.setStartDate(new Date());
		p4.setPresenter(s4);
		
		Presentation p5 = new Presentation();
		p5.setId(5);
		p5.setTitle("Famo.us - Building mobile apps");
		p5.setStartDate(new Date());
		p5.setPresenter(s5);
		
		Presentation p6 = new Presentation();
		p6.setId(6);
		p6.setTitle("Gulp and YO - Modern Web Tech Workflows");
		p6.setStartDate(new Date());
		p6.setPresenter(s6);
		
		Presentation p7 = new Presentation();
		p7.setId(7);
		p7.setTitle("HAPI - Lightweight APIs");
		p7.setStartDate(new Date());
		p7.setPresenter(s7);
		
		Presentation p8 = new Presentation();
		p8.setId(8);
		p8.setTitle("Let's Go Revel");
		p8.setStartDate(new Date());
		p8.setPresenter(s8);
		
		Presentation p9 = new Presentation();
		p9.setId(9);
		p9.setTitle("Listen to the Symfony");
		p9.setStartDate(new Date());
		p9.setPresenter(s9);
		
		Presentation p10 = new Presentation();
		p10.setId(10);
		p10.setTitle("Python and Django - The elephant in the room (Part 1)");
		p10.setStartDate(new Date());
		p10.setPresenter(s10);
		
		Presentation p11 = new Presentation();
		p11.setId(11);
		p11.setTitle("Python and Django - The elephant in the room (Part 2)");
		p11.setStartDate(new Date());
		p11.setPresenter(s11);
		
		Presentation p12 = new Presentation();
		p12.setId(12);
		p12.setTitle("Reactive in the frontend - ReactJS");
		p12.setStartDate(new Date());
		p12.setPresenter(s12);
		
		Presentation p13 = new Presentation();
		p13.setId(13);
		p13.setTitle("Realtime on the Web - Socket.io and Tornado");
		p13.setStartDate(new Date());
		p13.setPresenter(s13);
		
		Presentation p14 = new Presentation();
		p14.setId(14);
		p14.setTitle("Ruby on Rails - Part 1");
		p14.setStartDate(new Date());
		p14.setPresenter(s14);
		
		Presentation p15 = new Presentation();
		p15.setId(15);
		p15.setTitle("Ruby on Rails - Part 2");
		p15.setStartDate(new Date());
		p15.setPresenter(s15);
		
		Presentation p16 = new Presentation();
		p16.setId(16);
		p16.setTitle("Sass and Jade");
		p16.setStartDate(new Date());
		p16.setPresenter(s16);
		
		Presentation p17 = new Presentation();
		p17.setId(17);
		p17.setTitle("Swagger and RAML - API centering dev");
		p17.setStartDate(new Date());
		p17.setPresenter(s17);
		
		presentations.put(1, p1);
		presentations.put(2, p2);
		presentations.put(3, p3);
		presentations.put(4, p4);
		presentations.put(5, p5);
		presentations.put(6, p6);
		presentations.put(7, p7);
		presentations.put(8, p8);
		presentations.put(9, p9);
		presentations.put(10, p10);
		presentations.put(11, p11);
		presentations.put(12, p12);
		presentations.put(13, p13);
		presentations.put(14, p14);
		presentations.put(15, p15);
		presentations.put(16, p16);
		presentations.put(17, p17);
	}
	 
	public static Student getStudent(int id) {
		return students.get(id);
	}
	 
	public static List<Student> getAllStudents() {
		return new ArrayList<Student>(students.values());
	}
	
	public static void deleteStudent(int id) {
		students.remove(id);
	}
	
	public static void postStudent(Student student) {
		
		// Retrieve the max key
		int maxKey = Collections.max(students.keySet());
		student.setId(maxKey+1);
		
		students.put(maxKey+1, student);
	}
	
	public static void putStudent(int id, Student student) {
		student.setId(id);
		students.put(id, student);
	}
	
	
	public static Presentation getPresentation(int id) {
		return presentations.get(id);
	}
	 
	public static List<Presentation> getAllPresentations() {
		return new ArrayList<Presentation>(presentations.values());
	}

}