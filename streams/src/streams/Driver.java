package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<Person> people = getPeople();
		
		// Declarative approach
		// filter
		List<Person> females = people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		
		females.forEach(System.out::println);
		
		// sort
		List<Person> sorted = people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		sorted.forEach(System.out::println);
		
		// All match
		boolean match = people.stream()
				.anyMatch(Person -> Person.getAge() > 120);
		
		System.out.println(match);
		
		// None match
		boolean noneMatch =people.stream()
		.noneMatch(Person -> Person.getName().equals("Antonia"));
		
		System.out.println(noneMatch);
		
		// Max 
		people.stream()
		.max(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
	
		
		// Max 
		people.stream()
		.min(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);

		// Group
		Map<Gender, List<Person>> group = people.stream()
		.collect(Collectors.groupingBy(Person::getGender));
			

	}
	
	
	private static List<Person> getPeople() {
		return List.of(
		        new Person("Antonio", 20, Gender.MALE),
		        new Person("Alina Smith", 33, Gender.FEMALE),
		        new Person("Helen White", 57, Gender.FEMALE),
		        new Person("Alex Boz", 14, Gender.MALE),
		        new Person("Jamie Goa", 99, Gender.MALE),
		        new Person("Anna Cook", 7, Gender.FEMALE),
		        new Person("Zelda Brown", 120, Gender.FEMALE)
		    );
	}

}
