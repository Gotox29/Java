package bzh.gsbrh.vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import bzh.gsbrh.observateurs.Bouton;
import bzh.gsbrh.observateurs.Observable;
import bzh.gsbrh.observateurs.Observateur;

public class BReinitialiser extends Bouton implements ActionListener{
	

	public BReinitialiser(Observateur o, String titre) {
		super(o,titre);
		addActionListener(this);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		notifierObservateur();
	}
}