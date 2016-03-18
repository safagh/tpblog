package fr.treeptik.notify.aspectj;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import fr.treeptik.notify.impl.Notifier;
import fr.treeptik.notify.impl.StringMessage;

@Aspect
public class NotifierAdvice {
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	@Autowired
	private Notifier notifier;

	@AfterReturning("execution(* fr.treeptik.service.impl.ArticleServiceImpl.create(..))")
	public void handleNotification(JoinPoint jp) {

		notifier.notify(new StringMessage("Ici AOP, appel de "
				+ jp.getSignature().getName()));
		// ecrire();

	}

	// public void ecrire() throws IOException
	// {
	// FileOutputStream fout = new FileOutputStream("file_AOP.txt");
	// BufferedOutputStream bout = new BufferedOutputStream(fout);
	//
	// byte b[] = s.getBytes();// conversion du String en tableau de byte
	// (d'octet)
	// bout.write(b);// çaremplit
	//
	// bout.flush();// ça le vide
	// bout.close();
	// fout.close();
	// System.out.println("succès");
	// }
}