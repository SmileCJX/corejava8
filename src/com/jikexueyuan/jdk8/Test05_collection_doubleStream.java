package com.jikexueyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Administrator
 *	统计people集合中姓名中包含“文”字的平均身高
 */
public class Test05_collection_doubleStream {
	public static void main(String[] args) {
		List<Person> persons = createPeople();
		double avgHeight = persons.stream()
			.filter(p -> p.getName().indexOf("文") >= 0)
			.mapToDouble(p -> p.getHeight())
			.average()
			.getAsDouble();
		
		System.out.println("包含文字的所有人的平均身高：" + avgHeight);
	}
	
	//集合初始化
	static List<Person> createPeople(){
		List<Person> persons = new ArrayList<Person>();
		Person p = new Person("伍文涛", Person.Sex.MALE, 21, 1.66);
		persons.add(p);
		p = new Person("黄文强", Person.Sex.MALE, 24, 1.70);
		persons.add(p);
		p = new Person("张淑洁", Person.Sex.FEMALE, 22, 1.66);
		persons.add(p);
		p = new Person("马云", Person.Sex.MALE, 56, 1.60);
		persons.add(p);
		
		return persons;
	}				
}
