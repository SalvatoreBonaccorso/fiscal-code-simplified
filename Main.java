
public class Main {

    public static void main(String [] args){

        User u = new User("Salvatore","Bonaccorso",19,04,1989);
        User u1 = new User("Daniele","Melarosa",04,05,1978);
        User u2 = new User("Carlo","Leonardi",29, 11, 1996);

        System.out.println(u);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println("Il codice fiscale semplificato è : "+ u.firstName()+u.firstSurname()+u.endYear());
        System.out.println("Il codice fiscale semplificato è : " + u1.firstName()+u1.firstSurname()+u1.endYear());
        System.out.println("Il codice fiscale semplificato è : " + u2.firstName()+u2.firstSurname()+u2.endYear());

    }
}
