package com.vijay.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamAPITerminal {
	
	public static List<Student> getList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(11, 28, "Lucy"));
		list.add(new Student(32, 30, "Daniel"));
		list.add(new Student(49, 27, "Steve"));
		list.add(new Student(28, 26, "Tim"));
		list.add(new Student(11, 28, "Lucy"));
		list.add(new Student(32, 30, "Daniel"));
		list.add(new Student(49, 27, "Steve"));
		list.add(new Student(28, 26, "Tim"));
		return list;
	}
	
	public static List<Student> getUniqueList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(11, 28, "Lucy"));
		list.add(new Student(32, 30, "Daniel"));
		list.add(new Student(49, 27, "Steve"));
		list.add(new Student(28, 26, "Tim"));
		return list;
	}

	public static void main(String[] args) {
		List<Student> list = getList();

		Predicate<Student> p1 = s -> s.stuName.startsWith("A");
		Predicate<Student> p2 = s -> s.stuAge < 40;
		Predicate<Student> p3 = s -> {
			return s.stuAge < 40 && s.stuName.startsWith("D");
		};
		Predicate<Student> p4 = s -> true;

		System.out.println("---------------- 01 ----------------");

		boolean b1 = list.stream().allMatch(p1);
		System.out.println("list.stream().allMatch(p1): " + b1);

		b1 = list.stream().allMatch(p2);
		System.out.println("list.stream().allMatch(p2): " + b1);

		b1 = list.stream().allMatch(p3);
		System.out.println("list.stream().allMatch(p3): " + b1);

		b1 = list.stream().allMatch(p4);
		System.out.println("list.stream().allMatch(p4): " + b1);

		System.out.println("\n---------------- 02 ----------------");

		b1 = list.stream().anyMatch(p1);
		System.out.println("list.stream().anyMatch(p1): " + b1);

		b1 = list.stream().anyMatch(p2);
		System.out.println("list.stream().anyMatch(p2): " + b1);

		b1 = list.stream().anyMatch(p3);
		System.out.println("list.stream().anyMatch(p3): " + b1);

		b1 = list.stream().anyMatch(p4);
		System.out.println("list.stream().anyMatch(p4): " + b1);

		System.out.println("\n---------------- 03 ----------------");

		long count = list.stream().count();
		System.out.println("Count: " + count);

		System.out.println("\n---------------- 04 ----------------");

		b1 = list.stream().noneMatch(p1);
		System.out.println("list.stream().noneMatch(p1): " + b1);

		b1 = list.stream().noneMatch(p2);
		System.out.println("list.stream().noneMatch(p2): " + b1);

		b1 = list.stream().noneMatch(p3);
		System.out.println("list.stream().noneMatch(p3): " + b1);

		b1 = list.stream().noneMatch(p4);
		System.out.println("list.stream().noneMatch(p4): " + b1);

		System.out.println("\n---------------- 05 ----------------");

		list.stream().forEach(e -> System.out.println(e));

		System.out.println("\n---------------- 05A ----------------");

		list.stream().forEach(System.out::println);

		System.out.println("\n---------------- 06 ----------------");

		list.parallelStream().forEachOrdered(student -> System.out.println(student));

		System.out.println("\n---------------- 07 ----------------");

		Comparator<Student> str = (s1, s2) -> {
			return s1.stuAge - s2.stuAge;
		};
		Optional<Student> min = list.stream().min(str);
		Student std = min.get();
		System.out.println("Min by age : " + std);

		Optional<Student> min1 = list.stream().min((a, b) -> {
			return a.stuId - b.stuId;
		});
		System.out.println("Min by Id : " + min1.get());

		Student std3 = list.stream().min(Comparator.comparing((Student ss) -> ss.getStuName(), (t1, t2) -> {
			return t1.compareTo(t2);
		})).get();

		System.out.println("Student 3: " + std3);

		Student std4 = list.stream().min(Comparator.comparing(Student::getStuName)).get();

		Student std5 = list.stream().min(Comparator.comparing((Student s) -> s.getStuName())).get();

		Student std6 = list.stream().min(Comparator.comparing((Student s) -> {
			return s.getStuName();
		})).get();

		System.out.println("Student 4: " + std4);

		System.out.println("\n---------------- 08 ----------------");

		Optional<Student> std1 = list.stream().findAny();

		System.out.println(std1.get());

		System.out.println("\n---------------- 09 ----------------");

		Optional<Student> std2 = list.stream().findFirst();

		System.out.println(std2.get());

		System.out.println("\n---------------- 10 ----------------");

		Object[] studentsObj = list.stream().toArray();

		for (Object s : studentsObj) {
			Student st = (Student) s;
			System.out.println(st.getStuId());
		}

		Student[] students = list.stream().toArray(Student[]::new);

		Student[] studentss = list.stream().toArray((int ii) -> {
			return new Student[ii];
		});

		for (Student s : studentss) {
			System.out.println(s);
		}
		System.out.println(list.stream().isParallel());
	}
}
