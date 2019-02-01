package persistence.domain;

import javax.persistence.*;

public class Trainer {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	

}
