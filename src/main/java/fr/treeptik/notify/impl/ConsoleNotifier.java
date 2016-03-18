package fr.treeptik.notify.impl;

import org.springframework.stereotype.Component;




//Simple implémentation pour afficher le message dans la console
@Component
public class ConsoleNotifier implements Notifier {
	public void notify(Message message) {
		System.out.println(message.toString());
	}
}