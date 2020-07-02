package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{
	
	 public boolean basicEligibilityCheck (User user) {
		return checkUser(user);
		
	 }

	 public boolean checkQuizAnswer(String points) {
		 int score = Integer.parseInt(points);
			if(score > 80)
				return true;
				else
			return false;
		}

	
	public boolean checkUser(User user) {
			 if((user.getAge() >= 18 && user.getAge() <= 35) && (user.getHeight() >= 155 && user.getHeight() <=170 ) && (user.getWeight() >= 55 && user.getWeight() <= 90) && (user.getCountry() == "ProGrad")) {
				 return true;
			 }	
			 else
				return false;
	}
}






