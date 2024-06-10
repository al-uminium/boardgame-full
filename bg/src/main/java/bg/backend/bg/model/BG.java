package bg.backend.bg.model;


public class BG {
  private int gid; 
  private String name;
  private int year; 
  private int ranking; 
  private int usersRated;
  private String url;
  private String image;
  
  public int getGid() {
    return gid;
  }
  public void setGid(int gid) {
    this.gid = gid;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public int getRanking() {
    return ranking;
  }
  public void setRanking(int ranking) {
    this.ranking = ranking;
  }
  public int getUsersRated() {
    return usersRated;
  }
  public void setUsersRated(int usersRated) {
    this.usersRated = usersRated;
  }
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
}
