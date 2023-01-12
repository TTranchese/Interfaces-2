package it.develhope.identities;

import it.develhope.interfaces.TeachingPerson;

public class Professor extends CollegePerson implements TeachingPerson {
	String teachingSubject;
	@Override
	public void teachToOtherPeople() {
		System.out.println(name+" "+surname+" teaches "+teachingSubject);
	}
	public Professor(String name, String surname, int collegeId, String  teachingSubject){
		this.name=name;
		this.surname=surname;
		this.collegeId=collegeId;
		this.teachingSubject=teachingSubject;
	}
}
