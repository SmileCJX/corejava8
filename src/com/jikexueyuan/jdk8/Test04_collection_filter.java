package com.jikexueyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//���˳��Ա�ΪŮ����
public class Test04_collection_filter {
	
	public static void main(String[] args) {
		List<Person> persons = createPeople();
		persons.stream()
			.filter(p -> p.getGender() == Person.Sex.FEMALE)
			.forEach(p -> System.out.println( p.toString()) );
	}
	
	//���ϳ�ʼ��
		static List<Person> createPeople(){
			List<Person> persons = new ArrayList<Person>();
			Person p = new Person("������", Person.Sex.MALE, 21, 1.66);
			persons.add(p);
			p = new Person("����ǿ", Person.Sex.MALE, 24, 1.70);
			persons.add(p);
			p = new Person("�����", Person.Sex.FEMALE, 22, 1.66);
			persons.add(p);
			p = new Person("����", Person.Sex.MALE, 56, 1.60);
			persons.add(p);
			
			return persons;
		}
}
