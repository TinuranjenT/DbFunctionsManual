import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn=db.connect_to_db("tutdb", "postgres", "Tinu@123");
        db.createTable(conn, "employee");
        //db.insert_row(conn, "employee", "Rajesh","vellore");
        //db.update_name(conn, "employee", "Ram", "Raju");
        //db.search_by_name(conn, "employee", "Rahu");
        //db.search_by_id(conn, "employee", 4);
        //db.read_data(conn, "employee");
        //db.delete_row_by_name(conn, "employee", "Shivan");
        //db.read_data(conn, "employee");
       //db.delete_row_by_id(conn, "employee", 6);
        //db.read_data(conn, "employee");
        //db.delete_table(conn,"employee");
    }
}