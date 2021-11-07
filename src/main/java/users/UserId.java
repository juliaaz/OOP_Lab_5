package users;

public class UserId {
    static int id;

    public static int generateID() {
        id += 1;
        return id;
    }
}
