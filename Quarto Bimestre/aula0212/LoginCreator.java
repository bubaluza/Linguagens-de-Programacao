public class LoginCreator {
public static Login getInstancia(int cod){
    if(cod==0){ //Login
        return new Login();
    }
    else{ //LoginAdapter
        return new LoginAdapter();
    }
}
}
