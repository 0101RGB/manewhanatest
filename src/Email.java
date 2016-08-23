/**
 * Created by chayukyung on 2016. 8. 24..
 */
public class Email {
    String EM = new String();

    public Email(String email){
        this.EM = email;
    }

    public int emailValidity(String EM){
        String a = EM;

        if(a.contains("@") && a.contains("."))
            return 1;
        else
            return 0;
    }
}
