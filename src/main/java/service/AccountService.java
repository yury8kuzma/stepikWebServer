package service;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccountService {
    private static final Map<String, String> loginSave = new HashMap<>();

    public static void saveData(String login, String pass) {
        loginSave.put(login, pass);
    }

    public static boolean containsProfile (String login, String pass) {
        String password = loginSave.get(login);
        return password != null && password.equals(pass);
    }


}
