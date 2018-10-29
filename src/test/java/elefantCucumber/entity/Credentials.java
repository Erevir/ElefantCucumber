package elefantCucumber.entity;

public class Credentials {
    public UserName userName;
   public Password pwd;

    public Credentials() {

    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Password getPwd() {
        return pwd;
    }

    public void setPwd(Password pwd) {
        this.pwd = pwd;
    }
}
