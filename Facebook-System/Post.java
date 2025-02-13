import java.util.Date;
import java.util.List;

public class Post {
    private String id;
    private User user;
    private String content;
    private List<String> imageUrl;
    private List<String> videoUrl;
    private Date timestamps;
    private int likes;
    private List<Comment> comments;

    public void likePost(){
        // Logic for liking a post
    }
    public void addComment(){
        // Logic for adding a comment
    }
}
