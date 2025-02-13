import java.util.Date;
import java.util.List;

public class Comment {
    private String id;
    private User user;
    private Post post;
    private String content;
    private Date timeStamp;
    private List<User> likes;
}
