import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    //DAO = Data access Object > Antigamente 
    //DAO > CRUD >
    // c -> create (insert into)
    // R -> read  (select from)
    // U -> update (update set)
    // D -> delete (delete from)

    private Connection conn =  null; //atributo de conexão

    public UserRepository(){
       this.conn = ConnectionFactory.createConnection();
    }

    public void save(User _user){

        String uSQL = "INSERT INTO tb_user(username, password, status, token) VALUES (?, ?, ?, ?)"; //template da string
        try {

            PreparedStatement ps = conn.prepareStatement(uSQL);
            ps.setString(1, _user.getUsername());
            ps.setString(2, _user.getPassword());
            ps.setInt(3, _user.getStatus());
            ps.setDouble(4, _user.getToken());

            ps.executeUpdate(); //INSERT , UPDATE E DELETE

            System.out.println("INFO: Usuario cadastrado!");

        } catch (SQLException e) {

            // TODO Auto-generated catch block
            System.out.println("Error: Não foi possivel inserir o Usuario!");
            e.printStackTrace();

        }
    }

    public User getOne(int id) {  

        String sql = "SELECT * FROM tb_user WHERE id =? ";
        User u = new User();

        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){ 
                   u.setId(rs.getInt("id"));
                   u.setUsername(rs.getString("username"));
                   u.setPassword(rs.getString("password"));
                   u.setStatus(rs.getInt("status"));
                   u.setToken(rs.getDouble("token"));
              }

              //System.out.println(rs);

              
              return u;
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            System.out.println("Erro ao buscar usuário com id =" + id);
            e.printStackTrace();
        }

        return null;
        
    }

    public List<User> selectAll(){

        String sql = "SELECT * FROM tb_user";

        List<User> users = new ArrayList<User>();

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);

           // ps.executeQuery(); //somente em selectAll
           
           ResultSet rs = ps.executeQuery();

           while(rs.next()){ // toda consulta 
             // System.out.println(
                // rs.getInt("id") +" - " +
                // rs.getString("username") +" - " +
                // rs.getString("password")
                // );
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setStatus(rs.getInt("status"));
                u.setToken(rs.getDouble("token"));
                users.add(u);
           }

           System.out.println(rs);
           
        } catch (SQLException e) {
            System.out.println("Error: Não foi possivel buscar os usuários");
            e.printStackTrace();
        }
       
        return null;

    }

    public boolean update(User _user){

        String sql = "UPDATE tb_user SET username = ?, password = ?, status = ?, token = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            
            ps.setString(1, _user.getUsername());
            ps.setString(1, _user.getPassword());
            ps.setInt(1, _user.getStatus());
            ps.setDouble(1, _user.getToken());

            ps.setInt(1, _user.getId());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Erro: Usuario não pode ser atualizado");
            e.printStackTrace();
        }
        return false;

    }

    public boolean delete(int id){

        String sql = "DELETE FROM tb_user WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);

            ps.executeUpdate();
            return true;


        } catch (SQLException e) {
            // TODO Auto-generated catch block

            System.out.println("Erro: Não foi possivel deletar o usuario");
            e.printStackTrace();
        }


        return false;

    }

    public List<User> selectAllActive () {
        
        String sql = "SELECT * FROM tb_user WHERE status = 1";

        List<User> activeUsers = new ArrayList<User>();

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);

           // ps.executeQuery(); //somente em selectAll
           
           ResultSet rs = ps.executeQuery();

           while(rs.next()){ // toda consulta 
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setStatus(rs.getInt("status"));
                u.setToken(rs.getDouble("token"));
                activeUsers.add(u);
           }

           System.out.println(rs);
           
        } catch (SQLException e) {
            System.out.println("Erro: Não foi possivel buscar os usuários ativos");
            e.printStackTrace();
        }
       
        return activeUsers;
    }
     
}
