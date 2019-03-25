package edu.ap.spring.jpa;



public class WalletModel {
   
    private Long id;

  
    private String name;

    private float balance;


    public WalletModel() {
    }

    public WalletModel(String name, float balance){
        this.name = name;
        this.balance = balance;

    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }



	
}

