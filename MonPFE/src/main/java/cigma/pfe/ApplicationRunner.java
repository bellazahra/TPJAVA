package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cigma.pfe.presentation.ClientController;
import java.util.Arrays;
import java.util.List;



public class ApplicationRunner {

	public static void main(String[] args) throws BeansException {
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

    ClientController ctr= (ClientController) ctx.getBean("ctrl1");
    Client client = new Client("OMAR");
      List<Facture>factures = Arrays.asList(new Facture(1500,"facture1"),new Facture(2000,"facture2"));
   client.setFactures(factures);
   List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new
		   Promotion("solde 40%"));
		   client.setPromotions(promotions);
   ctr.save(client);
}
	
	
}



