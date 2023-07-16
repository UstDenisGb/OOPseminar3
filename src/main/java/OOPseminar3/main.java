package OOPseminar3;

public class main {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ruslan", "Ivanov", 25))
        .addUser(new User("Petr", "Petrov", 30))
        .addUser(new User("Denis", "Denisov", 3))
        .addUser(new User("Adam", "Adamov", 31))
        .addUser(new User("Adam", "Adamov", 23));

        Personal personal2 = new Personal();
        personal2.addUser(new User("Inna", "Ivanova", 25))
                .addUser(new User("Ira", "Petrova", 30));

        User user = new User("Anna", "Orlova", 11);
        user.setSubordinate(personal);

        personal2.addUser(user);

        User boss = new User("Leonid", "Putin", 87);
        boss.setSubordinate(personal2);

        Company company = new Company(boss);

        for (User ierarchy: company) {
            System.out.println(ierarchy);
        }
        //for (User user: personal)
          //   {
            //     System.out.println(user);
             //}
        //List<User> users = personal.toList();
        //System.out.println("-----------");
        //System.out.println(users);
        //System.out.println("-----------");
        //Collections.sort(users);
        //System.out.println(users);

    }
}
