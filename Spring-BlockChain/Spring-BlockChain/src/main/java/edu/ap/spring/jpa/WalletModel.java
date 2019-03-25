package edu.ap.spring.jpa;



public class WalletModel {
   
    private Long id;

  
    private String name;

    private double balance;


    public WalletModel() {
    }

    public WalletModel(String name, double balance){
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

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



	
}

