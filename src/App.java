import java.util.List;

public class App {
   
    public static void main(String[] args){

      UserRepository userRepository = new UserRepository();

      //  ConnectionFactory.createConnection();
        

        User usr= new User();

        usr.setId(3);
        usr.setUsername("paulinho");
        usr.setPassword("1234");
        usr.setStatus( 0);
        usr.setToken(7.333);

        
       //Salvar um usuario
       // ------------------------------------------------------------
       // userRepository.save(paulo);

       //buscar todos usuarios  
       // ------------------------------------------------------------
       // List <User> users = userRepository.selectAll();
       // for(user u : usuarios)
       // System.out.println(user);

       //Buscar pelo ID
       // ------------------------------------------------------------
        // User loc = userRepository.getOne(1);

        // if(loc.getUsername() != null){
        //   System.out.println("Usuario encotrado:\n " + loc);

        // }else{
        //   System.out.println("Usuario não encotrado");
        // }

        // ------------------------------------------------------------
        // Deletar usuario pelo ID / OBJ
        // ------------------------------------------------------------
        // if(userRepository.delete(1)){
        //   System.out.println("Usuario deletado");
        // }else{
        //   System.out.println("Não foi possivel deletar o usuario");
        // 
        //------------------------------------------------------------
        // Atualizar User
        //userRepository.update(users);

        List <User> activeUsers = userRepository.selectAllActive();
        for(User u : activeUsers)
        System.out.println(u);





        

        

       

    }
}
 