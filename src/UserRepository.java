import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            System.out.println("Error: Não foi possivel inserir o Usuario: ");
            e.printStackTrace();

        }
    }

    public void selectAll(){}

    public void update(User _user){}

    public void delete(User _user){}

     
}
