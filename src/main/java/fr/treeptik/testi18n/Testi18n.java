//package fr.treeptik.testi18n;
//
//import java.util.Locale;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//import fr.treeptik.pojo.Auteur;
//
//
//public class Testi18n {
//	
////		messageFrOREn();
////
////		noSuchMessageException();
////
////		messageWithParam();
//
////	testMessageource();
//	
//
//	public static void testMessageource() {
////		ApplicationContext context = new FileSystemXmlApplicationContext(
////				"applicationContext.xml");
//
////		TestMessageSource test = (TestMessageSource) context
////				.getBean("testMessageSource");
////		test.printMessage();
//	}
//
//	private static void messageWithParam() {
//		/**
//		 * Message avec tableau de paramètres
//		 */
//
//		ApplicationContext context = new FileSystemXmlApplicationContext(
//				"config-i18n-messageSource.xml");
//
//		Auteur auteur = new Auteur();
//		auteur.setNom("Emile");
//		String message = context.getMessage("register.user.already.exists",
//				new Object[] { auteur.getNom() }, null);
//
//		System.out.println(message);
//	}
//
//	private static void noSuchMessageException() {
//		ApplicationContext context = new FileSystemXmlApplicationContext(
//				"config-i18n-messageSource.xml");
//
//		/**
//		 * Dans l’appel précédent, si le MessageSource n’est pas en mesure de
//		 * résoudre le message qu’on lui demande, il lance une
//		 * NoSuchMessageException. Ce comportement peut être évité en passant
//		 * une valeur par défaut pour le message :
//		 **/
//		String msg = context.getMessage("unknown.message", null,
//		// "Message inconnu !",
//				null);
//		System.out.println(msg);
//	}
//
//	private static void messageFrOREn() {
//		ApplicationContext context = new FileSystemXmlApplicationContext(
//				"config-i18n-messageSource.xml");
//		Locale locale = new Locale("fr");
//		String bienvenue = context
//				.getMessage("welcome.to.treeptik", null, null);
//		// .getMessage("welcome.to.treeptik", null, locale);
//
//		System.out.println(bienvenue);
//	}
//
//}
