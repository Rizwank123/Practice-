package come.masai;

public class Developer {
	private int id;
	private String name;
	private int age;
	private int noOfProjectDone;
	private String email;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoOfProjectDone() {
		return noOfProjectDone;
	}
	public void setNoOfProjectDone(int noOfProjectDone) {
		this.noOfProjectDone = noOfProjectDone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Developer(int id, String name, int age, int noOfProjectDone, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.noOfProjectDone = noOfProjectDone;
		this.email = email;
		this.mobile = mobile;
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", age=" + age + ", noOfProjectDone=" + noOfProjectDone
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	

}
