
public class Pet {
	
	private String name;
	private int age;
	private String location;
	private int type;
	
	
	public Pet() {
		
	}
	
	public Pet( String name, int age, String location, int type ) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setName( String arg ) {
		this.name = arg;
	}
	
	public void setAge( int num ) {
		this.age = num;
	}
	
	public void setLocation( String arg ) {
		this.location = arg;
	}
}
	
