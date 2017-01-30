package com.jikexueyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//创建一个元素为Person类的集合：People
//使用Stream和forEach显示该集合所有元素
public class Test03_collection_stream {
	public static void main(String[] args) {
		List<Person> persons = createPeople();//集合初始化
		Stream<Person> stream = persons.stream();
		stream.forEach(
				p -> System.out.println(p.toString())
				);
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
