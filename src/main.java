import java.util.List;

public class main {

	public static void main(String[] args) {
		  List<Person> listPersonSortByName = Person.getListPerson();
		  
		  listPersonSortByName.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		  System.out.println("sort by name:");
		  for (Person person: listPersonSortByName) {
		    System.out.println(person);
		  }
		  
		  List<Person> listPersonSortByNameAndAge = Person.getListPerson();
		  listPersonSortByNameAndAge.sort((o1, o2) -> {
		    if (o1.getName().equals(o2.getName())) {
		      return o2.getAge() - o1.getAge();
		    }
		    return o1.getName().compareTo(o2.getName());
		  });
		  System.out.println("sort by name and age:");
		  for (Person person: listPersonSortByNameAndAge) {
		    System.out.println(person);
		  }
		}
}
