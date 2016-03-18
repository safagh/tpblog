package fr.treeptik.runtime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.service.ArticleService;
import fr.treeptik.service.AuteurService;
import fr.treeptik.service.CategorieService;
import fr.treeptik.service.CommentaireService;
//import fr.treeptik.testi18n.TestMessageSource;
//import fr.treeptik.testi18n.Testi18n;

public class Runtime {

	public static void main(String[] args) throws ServiceExeption {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");

//		TestMessageSource test = (TestMessageSource) context
//				.getBean("testMessageSource");
//		test.printMessage();
		
		// déclenche l'instanciation
		@SuppressWarnings("unused")
		AuteurService auteurServiceImpl = (AuteurService) context
				.getBean("auteurServiceImpl");
		
//		Testi18n.testMessageource();

		/************** CRUD Auteur *****************/

//		 Auteur auteur1 = new Auteur();
//		 auteur1.setNom("Aspect");
//		 auteur1.setEmail("AspectJ@gmail.com");
//		 auteur1.setPrenom("J");
//		 auteur1.setUrl("AspectJ.com");
//		System.out.println("ici soucis");
//		 auteurServiceImpl.create(auteur1);
//		 List<Auteur> findAllAuteur = auteurServiceImpl.findAll();
//		 System.out.println("TOUS LES AUTEURS");
//		 for (Auteur auteur2 : findAllAuteur) {
//		 System.out.println(auteur2);
//		 }
		// Scanner sc = new Scanner(System.in);
		// System.out
		// .println("Bonjour taper l'email de l'auteur que vous voulez modifier SVP");
		// String emailChosen = sc.next();
		// Auteur auteur2 = auteurServiceImpl.findByEmail(emailChosen);
		//
		// auteur2.setNom("Cabrelllll");
		//
		// Auteur createAuteur = auteurServiceImpl.create(auteur2);
		// System.out.println(create);
		//
		// sc.close();

		/******************** CRUD Article **********************/
		ArticleService articleServiceImpl = (ArticleService) context
				.getBean("articleServiceImpl");
		// Article article=new Article();
		// article.setTitre("Multi agent system");
		// article.setChapeau("blabla blabla blabla");
		// article.setContenu("Now i believe in miracles and miracles win happen tonight");
		//
		// Article article1=new Article();
		// article1.setTitre("Order Picking");
		// article1.setChapeau("toto toto");
		// article1.setContenu("Heal the world make it a better place for you and for me and the entire human race");
		// articleServiceImpl.create(article1);

//		 List<Article> findAllArticle = articleServiceImpl.findAll();
//		 System.out.println("Tous les articles");
//		 for (Article article : findAllArticle) {
//		 System.out.println(article);
//		 }

		// Scanner sc = new Scanner(System.in);
		// System.out
		// .println("Bonjour taper le titre de l'article que vous voulez modifier SVP");
		// String titreChosen = sc.next();
		// Article article2 = articleServiceImpl.findByTitre(titreChosen);
		// article2.setTitre("TSP");
		// Article createArticle = articleServiceImpl.create(article2);
		// System.out.println(createArticle);
		// sc.close();
		// articleServiceImpl.removeById(4);

		/*************** des articles pour un auteur *************/

//		Article article5 = new Article();
//		article5.setTitre("Article1 de l'auteur Hemingway");
//		article5.setContenu("lalallaernest");
//		articleServiceImpl.create(article5);
//
//		Article article6 = new Article();
//		article6.setTitre("Article2 de l'auteur Hemingway");
//		article6.setContenu("lalallaernest2");
//		articleServiceImpl.create(article6);
//		List<Article> articles = new ArrayList<Article>();
//		articles.add(article5);
//		articles.add(article6);
//		
//
//		Auteur auteur5 = new Auteur();
//		auteur5.setNom("Hemingway");
//		auteur5.setEmail("Hemingway@gmail.com");
//		auteur5.setPrenom("Ersnest");
//		auteur5.setUrl("Ernest.com");
//		auteur5.setArticles(articles);
		
//		auteur5=auteurServiceImpl.create(auteur5);
//		articleServiceImpl.create(article5);
//		articleServiceImpl.create(article6);
				
		/************************************************/

		/**************** Catégorie ********************/

		/*************** Commentaire ***************/
		
		/************** JPQL ********************/
		System.out.println("Hallo, un peu de JPQL");
		
		/****Article  1  **********************************/
//		System.out.println("****** 1) Trouver les articles parus sur une période de temps******** ");
//		List<Article> articles = null;
//		try {
//			articles = articleServiceImpl.findArticleDate();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for (Article articleDate : articles) {
//			 System.out.println(articleDate);
//			 }
		
		/****Article 2  ***********************************/
//		System.out.println("******* 2) Trouver les articles commentés***********");
//		List<Article> articles=articleServiceImpl.findArticleComment();
//		 for (Article articleComment : articles) {
//		 System.out.println(articleComment);
//		 }
		
		/****Auteur 1 ************************************/
		System.out.println("**** 1) Trouver l'auteur avec l'article le plus commenté **********");
//		Auteur auteurComment =auteurServiceImpl.findAuteurPlusComment();
//		System.out.println(auteurComment);
		 
		
		/****AUteur 2 *************************************/
		System.out.println("**** 2) Liste par auteur du nombre d'articles en ligne");
		

		/*** Catégorie 1 **********************************/
		CategorieService categorieServiceImpl = (CategorieService) context
				.getBean("categorieServiceImpl");
		
		System.out.println("***** 1) Trouver nombre d'articles d'une catégorie ********");
//		 Scanner sc = new Scanner(System.in);
//				 System.out.println("Bonjour taper l'id de la catégorie qui vous interesse SVP");
//				 Integer categorieChosen = sc.nextInt();
//		int result=categorieServiceImpl.nombreArticleCategorie(categorieChosen);
//		System.out.println("result");
		/*** Catégorie 2 **********************************/
		
		
		System.out.println("**** 2) Trouver catégorie ayant le plus d'articles *******");
		
		
		/**** Catégorie 3 ********************************/
		System.out.println("**** 3) Trouver catégorie sans article*********");
	
//		List<Categorie> categories=categorieServiceImpl.findCategorieNoArticle();
//		 for (Categorie articleComment : categories) {
//		 System.out.println(articleComment);
//		 }
		
		/**** Commentaire 1 ***************************/
		CommentaireService commentaireServiceImpl = (CommentaireService) context
				.getBean("commentaireServiceImpl");
		
		System.out.println("***** 1) Trouver tous les commentaires d'un article******");
		
//		Scanner sc3 = new Scanner(System.in);
//		 System.out.println("Bonjour l'id de l'article que vous voulez manipuler SVP");
//		 int idChosen = sc3.nextInt();
//		List <Commentaire> commentaires=commentaireServiceImpl.findCommentsArticle(idChosen);
//		for (Commentaire commentaire : commentaires) {
//			System.out.println(commentaire);
//		}

		 
	}

}
