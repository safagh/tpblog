package fr.treeptik.dao;
import fr.treeptik.dao.impl.ArticleJPADAO;

public class DAOFactory {
	
	
//	private static String loadProperty() {
//
//		FileReader propertieReader;
//		String conf = "";
//		try {
//
//			propertieReader = new FileReader("config.properties");
//
//			Properties properties = new Properties();
//			properties.load(propertieReader);
//			conf = properties.getProperty("conf.dao");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return conf;
//	}
//
//	public static GenericDAO createGenericDAo() {
//		String conf = loadProperty();
//		GenericDAO<T, Pk> daoPersonne = null;
//		switch (conf) {
//		case "file":
//			daoPersonne = new DAOPersonneFileImpl();
//			break;
//		case "xml":
//			daoPersonne = new DAOPersonneXMLImpl();
//			break;
//
//		case "jdbc":
//			daoPersonne = new DAOPersonneJDBCImpl();
//			break;
//
//		default:
//			break;
//		}
//		return daoPersonne;
//	}
	
	
	
	
	


	// je l'appelle tres souvent je le cree une seule fois +-
	// cree obj ss param, tt le temps les mm finalement
	public static ArticleDAO getEmployeeDAO() {
		return new ArticleJPADAO();
	}

	
	
}
