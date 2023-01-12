package it.develhope.identities;

import it.develhope.interfaces.LearningPerson;

import java.time.Year;

public class Student extends CollegePerson implements LearningPerson {
	int academicYear;
	@Override
	public void studyAtHome() {
		System.out.println(name+" "+surname+" studies at home since "+ (Year.now().getValue()-academicYear));
	}
	public Student(String name, String surname, int collegeId, int academicYear){
		this.name=name;
		this.surname=surname;
		this.collegeId=collegeId;
		this.academicYear=academicYear;
	}
}
