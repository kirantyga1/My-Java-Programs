package JavaBasicPrograms;
import java.time.LocalDate;
import java.time.Period;


public class BirthdayFinder {

	public static void main(String[] args) {

		LocalDate today= LocalDate.now();
		LocalDate birthDate	= LocalDate.of(1991, 06, 19);
		
		int years=Period.between(birthDate, today).getMonths();
		System.out.println("Maheshwari is "+years+" Days old");
		
	}

}
