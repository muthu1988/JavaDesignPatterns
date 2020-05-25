package solid;

import java.util.ArrayList;
import java.util.List;

// A. High-level modules should not depend on low-level modules. 
// Both should depend on abstractions.

// B. Abstractions should not depend on details. 
// Details should depend on abstractions.

enum Relationship {
	PARENT_OF, CHILD_OF, SIBLING
}

class Person {
	public String name;
	// dob etc.

	public Person(String name) {
		this.name = name;
	}
}

interface RelationshipBrowser {
	List<Person> findAllChildrenOf(String name);
}

class Relationships implements RelationshipBrowser {

	private List<String> relations = new ArrayList<>();

	public List<String> getRelations() {
		return relations;
	}

	public List<Person> findAllChildrenOf(String name) {
		List<Person> childrens = new ArrayList<>();
		for (String rel : relations) {
			String[] split = rel.split("-");
			if (split[1].equals(Relationship.CHILD_OF.toString())) {
				childrens.add(new Person(split[0]));
			}
		}
		return childrens;
	}

	public void addParentAndChild(Person parent, Person child) {
		relations.add(parent.name + "-" + Relationship.PARENT_OF.toString() + "-" + child.name);
		relations.add(child.name + "-" + Relationship.CHILD_OF.toString() + "-" + parent.name);
	}
}

class Research {
	public Research(RelationshipBrowser browser) {
		List<Person> children = browser.findAllChildrenOf("John");
		for (Person child : children)
			System.out.println("John has a child called " + child.name);
	}
}

public class DependencyInversion {
	public static void main(String[] args) {
		Person parent = new Person("John");
		Person child1 = new Person("Chris");
		Person child2 = new Person("Matt");

		// low-level module
		Relationships relationships = new Relationships();
		relationships.addParentAndChild(parent, child1);
		relationships.addParentAndChild(parent, child2);

		new Research(relationships);
	}
}
