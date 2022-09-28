class Human {
	String name;
	String surname;
	String patronomicName;
	int age;

	Human() {
	}

	public Human(String name, String surname, String patronomicName, int age) {
		this.name = name;
		this.surname = surname;
		this.patronomicName = patronomicName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronomicName() {
		return patronomicName;
	}

	public void setPatronomicName(String patronomicName) {
		this.patronomicName = patronomicName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", patronomicName='" + patronomicName + '\'' +
				", age=" + age +
				'}';
	}
}

