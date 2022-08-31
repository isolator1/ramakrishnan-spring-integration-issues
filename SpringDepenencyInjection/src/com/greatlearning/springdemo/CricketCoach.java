package com.greatlearning.springdemo;

public class CricketCoach implements SportsCoach {
	
	ExpertAdvice expertadvice;
	
	public CricketCoach(ExpertAdvice expertadvice) {
		super();
		this.expertadvice = expertadvice;
	}

	@Override
	public String getTrainingSchedule() {
		// TODO Auto-generated method stub
		return " Training is scheduled on Monday";
	}

	@Override
	public String getExpertAdvice() {
		// TODO Auto-generated method stub
		return expertadvice.getAdvice();
	}


	

}
