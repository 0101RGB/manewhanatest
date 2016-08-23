
public class Password{
	String PW = new String();
	public Password(String password){
		this.PW = password;
	}
	public int pwValidity(String PW){
		String tempPW = PW;
		int validity[] = new int[4];
		int sum = 0;
		
		for(int i=0;i<tempPW.length();i++){
			if(Character.isDigit(tempPW.charAt(i)))
				validity[0]=1;
			else if(Character.isUpperCase(tempPW.charAt(i)))
				validity[1]=1;
			else if(Character.isLowerCase(tempPW.charAt(i)))
				validity[2]=1;
			else //특수문자
				validity[3]=1;
				
		}
		sum = validity[0]+validity[1]+validity[2]+validity[3];
		if(sum == 4)
			return 1;
		else
			return 0;
	}
	
}
