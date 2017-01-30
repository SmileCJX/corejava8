package com.jikexueyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Administrator
 *	ͳ��people�����������а������ġ��ֵ�ƽ�����
 */
public class Test05_collection_doubleStream {
	public static void main(String[] args) {
		List<Person> persons = createPeople();
		double avgHeight = persons.stream()
			.filter(p -> p.getName().indexOf("��") >= 0)
			.mapToDouble(p -> p.getHeight())
			.average()
			.getAsDouble();
		
		System.out.println("�������ֵ������˵�ƽ����ߣ�" + avgHeight);
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
