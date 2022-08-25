package caseghenning;


public class user {
	private String name;
	private int age;
	
	public user (String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public user() {
		super();
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
	
	
	@Override
    public String toString(){
		if(age >= 0 && age <12) {
			return ("Name: " + name + "\n" + "| Age: " + age + "\n" + "| This user is a child! " + "\n") ;				
		}else
		if (age >=12 && age <= 19){
			return ("Name: " + name + "\n" + "| Age: " + age + "\n" + "| This user is a teenager!" + "\n");
		}else 
		if(age >=20 && age <65) {
			return ("Name: " + name + "\n" + "| Age: " + age + "\n" + "| This user is an adult!" + "\n");
		}
		else{
			return ("Name: " + age + "\n" + "| Age: " + age + "\n" + "| This person is an elderly!" + "\n");
		}


        
    }	
}