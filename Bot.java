public class Bot {

    public void printMessage() {
        System.out.println("Bot: You cannot say cat!");
    }
    public void removeUser(User user) {
        ChatRoom.RemoveUser(user);
    }
}
