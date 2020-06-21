public class Main {

    public static void main(String[] args) {

        Factory factory = new MainFactory();
        User firstUser = factory.createUser("Alex");
        User secondUser = factory.createUser("Ivan");
        User thirdUser = factory.createUser("Beni");
        User anotherUser = factory.createUser("Nadejda");

        ChatRoom.AddUser(firstUser);
        ChatRoom.AddUser(secondUser);
        ChatRoom.AddUser(thirdUser);

        firstUser.sendMessage("My name is Alex!");
        secondUser.sendMessage("Hi Alex!");
        thirdUser.sendMessage("Hi Alex!");

        anotherUser.sendMessage("Hello!");

        secondUser.sendMessage("addBot");
        firstUser.sendMessage("Do you have a cat?");
        thirdUser.sendMessage("Yeah cats are great, I have a cat at home!");
        thirdUser.sendMessage("another message!");

    }

}

