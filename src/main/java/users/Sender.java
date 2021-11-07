package users;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
public class Sender implements User{
    int id;
    String status;

    public Sender() {
        this.id = UserId.generateID();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
