import it.develhope.identities.Assistant;
import it.develhope.identities.Professor;
import it.develhope.identities.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Tommaso", "Tranchese", 1, 3);
		Professor professor = new Professor("Lorenzo", "Catania", 2, "IT");
		Assistant assistant = new Assistant("Gigi", "Coppola", 3, true);

		student.goToCollege();
		student.studyAtHome();
		professor.goToCollege();
		professor.teachToOtherPeople();
		assistant.goToCollege();
		assistant.teachToOtherPeople();
		assistant.studyAtHome();
	}
}