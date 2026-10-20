package ocp;

public class AuthManager {

    public Erregistratu getService(String service) {

        if(service.equals("facebook"))
            return new Facebook();

        if(service.equals("google"))
            return new Google();

        if(service.equals("twitter"))
            return new Twitter();

        if(service.equals("apple"))
            return new Apple();

        return null;
    }
}