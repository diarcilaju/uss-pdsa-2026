package patron.singleton;

public class MainSingleton {
    public static void main(String [] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();

        System.out.println("Hash s1: " + s1.hashCode());
        System.out.println("Hash s2: " + s2.hashCode());
    }
}
