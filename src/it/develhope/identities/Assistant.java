package it.develhope.identities;

import it.develhope.interfaces.LearningPerson;
import it.develhope.interfaces.TeachingPerson;

public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson {
	boolean isGoingToBeAPhD;
	@Override
	public void teachToOtherPeople() {
		System.out.println(name+" "+surname+" is an assistant and can teach to students!");
	}
	@Override
	public void studyAtHome() {
		System.out.println(name + " also studies at home!");
	}
	public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD){
		this.name=name;
		this.surname=surname;
		this.collegeId=collegeId;
		this.isGoingToBeAPhD=isGoingToBeAPhD;
	}


}