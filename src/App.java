import java.util.List;

public class App {
   
    public static void main(String[] args){

      //  ConnectionFactory.createConnection();
        

        User paulo = new User();


        paulo.setUsername("paulo");
        paulo.setPassword("1234");
        paulo.setStatus( 0);
        paulo.setToken(7.333);

        UserRepository userRepository = new UserRepository();
       // userRepository.save(paulo);

        List <User> users = userRepository.selectAll();

        

       

    }
}
 