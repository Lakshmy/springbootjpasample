package com.sprintboot.init.testlk.testlk;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String name;
    
    @OneToOne
    @JoinColumn(name = "owner_id",referencedColumnName="id")
    private Person owner;
    
    public Pet() {
    }
    
    /*public Integer getId() {
		return id;
	}*/

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public String getOwnerName() {
		return owner.getName();
	}
	
}
