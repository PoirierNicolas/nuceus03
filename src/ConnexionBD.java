import java.sql.* ;

public class ConnexionBD {
	// Déclarer les attributs nécessaires à la connexion
	
	private static Connection connexion = null ;
	private static String dbURL = "jdbc:mysql://localhost:3306/noixcoop", user="noixcoop", password="noixcoop";
	
	private ConnexionBD() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance() ;
			connexion = (Connection) DriverManager.getConnection(dbURL,user,password);
			// Créer une connexion (initialisation de l'attribut connexion)
		}
		catch(Exception e){
			System.out.println("Erreur BD") ;
		}
	}
	
	public static Connection getConnexion(){
		if(connexion==null){
			new ConnexionBD();
		}
		return connexion;		
	}
}
