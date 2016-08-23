/**
 * Created by godjaku on 2016. 8. 16..
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while(true){
    		System.out.println("비밀번호를 생성합니다.");
        	System.out.println("비밀번호를 입력하세요.");
        	Password password = new Password(scan.nextLine());
        	
        	if(password.PW.length()>12 || password.PW.length()<8)
        		System.out.println("비밀번호가 올바르지 않습니다. 다시 만드세요.");
        	else{
        		if(password.pwValidity(password.PW) == 1){
            		System.out.println("비밀번호가 생성되었습니다.");
            		break;
            	}
            	else
            		System.out.println("비밀번호가 올바르지 않습니다. 다시 만드세요.");
        	}
    	}

		while(true){
			System.out.println("");
			System.out.println("이메일을 입력하세요");

			Email email = new Email(scan.nextLine());

			if(email.EM.indexOf('@')>40 || email.EM.length()-email.EM.indexOf('@')>80)
				System.out.println("이메일 형식이 올바르지 않습니다. 다시 확인해주세요.");
			else{
				if(email.emailValidity(email.EM) == 1){
					System.out.println("이메일 정상");
					break;
				}
				else
					System.out.println("이메일 형식이 올바르지 않습니다 다시 확인해주세요.");
			}
		}
    }
}
