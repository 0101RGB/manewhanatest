/**
 * Created by godjaku on 2016. 8. 16..
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while(true){
    		System.out.println("��й�ȣ�� �����մϴ�.");
        	System.out.println("��й�ȣ�� �Է��ϼ���.");
        	Password password = new Password(scan.nextLine());
        	
        	if(password.PW.length()>12 || password.PW.length()<8)
        		System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�. �ٽ� ���弼��.");
        	else{
        		if(password.pwValidity(password.PW) == 1){
            		System.out.println("��й�ȣ�� �����Ǿ����ϴ�.");
            		break;
            	}
            	else
            		System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�. �ٽ� ���弼��.");
        	}
    	}
    }
}
