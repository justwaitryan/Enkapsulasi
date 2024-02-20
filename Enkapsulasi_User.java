
package enkapsulasi_user;

public class Enkapsulasi_User {
     
    public static void main(String[] args) {
       User ryan = new User("Ryan","dhrynfrds",0,false);
       
       ryan.setUsername("Ryan");
       ryan.setPassword("kelasabangkuu");
       ryan.setId(5);
       ryan.setStatus(true);
       
       
        System.out.println("Username : " + ryan.getUsername());
        System.out.println("Password : " + ryan.getPassword());
        System.out.println("Username : " + ryan.getId());
        System.out.println("Password : " + ryan.isStatus());
    }
    
}
