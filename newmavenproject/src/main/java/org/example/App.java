package org.example;
import java.util.ResourceBundle;
/**
 * Hello world!
 *
 */
public class App 
{
    public boolean login_test(String user,String pass){
        ResourceBundle r = ResourceBundle.getBundle("config");
        String username =r.getString("user");
        String password =r.getString("pass");
        if(username.equals(user) && password.equals(pass))
        {
            return true;
        }
        else{
            return false;
        }

    }
}
