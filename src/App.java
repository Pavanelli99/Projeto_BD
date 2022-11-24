public class App {
   
    public static void main(String[] args){

      //  ConnectionFactory.createConnection();
        

        User eduardo = new User();


        eduardo.setUsername("eduardo");
        eduardo.setPassword("1234");
        eduardo.setStatus( 1);
        eduardo.setToken(3.1415);

        UserRepository userRepository = new UserRepository();
        userRepository.save(eduardo);

        

       

    }
}
 