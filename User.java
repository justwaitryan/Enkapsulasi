package enkapsulasi_user;

public class User {
    private String username;
    private String password;   
    private int id;
    private boolean status;
    
    public User(String a, String b, int c, boolean d){
        this.username = a;
        this.password = b;
        this.id = c;
        this.status = d;
    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
        
}
