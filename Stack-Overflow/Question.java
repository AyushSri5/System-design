import java.util.Date;
import java.util.List;

public class Question {
    private int id;
    private String title;
    private String content;
    private String author;
    private List<Answer> answerList;
    private List<Comment> commentList;
    private List<Tag> tagList;
    private List<Vote> votes;
    private Date creationDate;
}
