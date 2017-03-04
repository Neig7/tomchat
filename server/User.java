public class User{
  private int id;
  private String name;

  public User(int id, String name){
    this.id = id;
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setName(){
    this.name = name;
  }

  public int getId(){
    return id;
  }

}