package bzh.gsbrh.vues;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import bzh.gsbrh.observateurs.Bouton;
import bzh.gsbrh.observateurs.Lexique;
import bzh.gsbrh.observateurs.Observable;
import bzh.gsbrh.observateurs.Observateur;

public class BValider extends Bouton implements ActionListener{
	

	public BValider(Observateur o, String titre, int id) {
		super(o,titre, id);
		addActionListener(this);
		this.setBackground(Lexique.COLOR_BOUTON_VALIDER);
		this.setToolTipText(titre);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		notifierObservateur();
		notifierObservateur(id);
	}

	
}
