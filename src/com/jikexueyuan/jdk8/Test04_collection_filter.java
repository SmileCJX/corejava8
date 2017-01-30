package com.jikexueyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//过滤出性别为女的人
public class Test04_collection_filter {
	
	public static void main(String[] args) {
		List<Person> persons = createPeople();
		persons.stream()
			.filter(p -> p.getGender() == Person.Sex.FEMALE)
			.forEach(p -> System.out.println( p.toString()) );
	}
	
	//集合初始化
		static List<Person> createPeople(){
			List<Person> persons = new ArrayList<Person>();
			Person p = new Person("伍文涛", Person.Sex.MALE, 21, 1.66);
			persons.add(p);
			p = new Person("黄友强", Person.Sex.MALE, 24, 1.70);
			persons.add(p);
			p = new Person("张淑洁", Person.Sex.FEMALE, 22, 1.66);
			persons.add(p);
			p = new Person("马云", Person.Sex.MALE, 56, 1.60);
			persons.add(p);
			
			return persons;
		}
}
