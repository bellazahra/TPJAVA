package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TClients")


   public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@OneToMany
	
	private List<Facture> factures1;
	
	@OneToMany(cascade = {CascadeType.PERSIST})
	private List<Facture> factures;
	public Client() {
	}
	
	
	public Client(String name) {
	this.name = name;
	}


	public void setFactures(List<Facture> factures2) {
		// TODO Auto-generated method stub
		
	}
	
	@ManyToMany(cascade = {CascadeType.PERSIST})
	private List<Promotion> promotions;
	public void setPromotions(List<Promotion> promotions2) {
		// TODO Auto-generated method stub
		
	}

}