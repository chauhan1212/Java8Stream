package com.vijay.stream;

class Student implements Comparable< Student> {
	int stuId;
	int stuAge;
	String stuName;

	Student(int id, int age, String name) {
		this.stuId = id;
		this.stuAge = age;
		this.stuName = name;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stuAge;
		result = prime * result + stuId;
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stuAge != other.stuAge)
			return false;
		if (stuId != other.stuId)
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		return true;
	}



	Student() {

	}
	
	

	public int getStuId() {
		return stuId;
	}

	public int getStuAge() {
		return stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuAge=" + stuAge + ", stuName=" + stuName + "]";
	}



	@Override
	public int compareTo(Student o) {
		return this.stuId - o.stuId;
	}
	
	
}
