package Creational.Builder;
//https://www.youtube.com/watch?v=xy6FUwftz1Q

import java.util.List;

public class App {

//https://www.youtube.com/watch?v=xy6FUwftz1Q&t=5s

    public static void main(String[] args) {

//        Account account = new Account(1,"fdww@gmail.com","Mark", List.of("mihai","Jhon"),"Alexandu",52,"87","031452","Valencia");

        Name name = new Name.Builder().firstname("Jhon")
                .middleNames(List.of("Peter", "Marcus"))
                .sureName("Jonson")
                .build();

        Address address = new Address.Builder()
                .city("Bucharest")
                .houseNumber(111)
                .zipcode("1234")
                .build();

        AccountDetalies accountDetalies = new AccountDetalies.Builder()
                .address(address)
                .name(name)
                .id(15)
                .email("Mark@gmail.com")
                .build();
        System.out.println(name);
        System.out.println(address);
        System.out.println(accountDetalies);

    }
}
