import java.sql.Time;
import java.util.List;

public abstract class Persona {
    private String name;
    private Address address;
    private String email;
    private String password;
    private Account accountId;
}

abstract class Admin extends Persona {
    public abstract boolean blockUser(User user);
    public abstract boolean disablePage(CompanyPage page);

    public abstract boolean unblockUser(User user);

    public abstract boolean enablePage(CompanyPage page);
    public abstract boolean deleteGroup(Group group);
}

abstract class User extends Persona {
    private int userId;

    private Time dateOfJoining;

    private Profile profile;
    private List<User> followsUsers;
    private List<CompanyPage> followCompanies;
    private List<User> connections;
    private List<Group> joinedGroups;
    private List<CompanyPage> createdPages;
    private List<Group> groups;

    public abstract boolean postJob(Job jobId);

    public abstract boolean acceptRecommendation(User user);
    public abstract boolean deleteRecommendation(User user);

    public abstract boolean sendMessage(User user,Message message);
    public abstract boolean createComment(Comment comment);
    public abstract boolean deleteComment(Comment comment);
    public abstract boolean createPost(Post post);
    public abstract boolean deletePost(Post post);

    public abstract boolean acceptConnection(ConnectionInvitation connection);
    public abstract boolean removeConnection(ConnectionInvitation connection);
    public abstract boolean createGroup(Group group);
    public abstract boolean leaveGroup(Group group);
    public abstract boolean joinGroup(Group group);
    public abstract boolean followUser(User user);
    public abstract boolean unFollowUser(User user);


}
