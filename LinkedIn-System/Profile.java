import java.util.Date;
import java.util.List;

public abstract class Profile {
    private String headline;
    private String about;
    private String gender;
    private List<Education> educationList;

    private List<Experience> experienceList;
    private List<Skill> skills;

    public abstract boolean addExperience(Experience experience);
    public abstract boolean addEducation(Education education);
    public abstract boolean addSkills(Skill skill);
}

abstract class Skill{
    private String name;
}

abstract class Experience {
    private String title;
    private String company;
    private String location;
    private Date startDate;
    private Date endDate;
}

abstract class Education {
    private String school;
    private String location;

    private Date startDate;
    private Date endDate;

}

