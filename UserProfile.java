// Activity 2: My First Variable Naming


// Open your IntelliJ Idea IDE and follow the instructions below
// Create a project called MyFirstVariableNaming
// Create a class titled "UserProfile"
// Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
// Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
// Use the age to calculate the year when a user was born.
// Print the values back to a user's console.
import java.util.Scanner;
public class UserProfile {

	private String name;
    private int age;
    private String gender;
    private String jobPreference;
    private String nationality;
    private String bloodType;

    public UserProfile(String name, int age, String gender, String jobPreference, String nationality, String bloodType) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobPreference = jobPreference;
        this.nationality = nationality;
        this.bloodType = bloodType;
    }
    
    public int calBirthYear() {
        return java.time.Year.now().getValue() - age;
    }

    
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Job Preference: " + jobPreference);
        System.out.println("Nationality: " + nationality);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Birth Year: " + calBirthYear());
    }
	public static void main(String[] args) {
		String name;
		int age;
		String gender;
		String job_prefence;
		String nationality;
		String blood_type;
		var scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name = scanner.nextLine();
		
		System.out.println("Enter Your Age");
		age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter Your Gender");
		gender= scanner.nextLine();
		
		System.out.println("Enter Your Job Prefence");
		job_prefence= scanner.nextLine();
		
		System.out.println("Enter Your Nationality");
		nationality = scanner.nextLine();
		
		System.out.println("Enter Your Blood Type");
		blood_type = scanner.nextLine();
		UserProfile userProfile =new UserProfile(name,age,gender, job_prefence,nationality, blood_type);
		userProfile.printInfo();	

	}

}