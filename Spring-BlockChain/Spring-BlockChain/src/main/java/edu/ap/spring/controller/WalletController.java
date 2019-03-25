package edu.ap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.ap.spring.jpa.WalletModel;
import edu.ap.spring.service.Block;
import edu.ap.spring.service.BlockChain;
import edu.ap.spring.service.Wallet;
import edu.ap.spring.transaction.Transaction;

@Controller
public class WalletController {
   
    @Autowired
	private BlockChain bChain;
	@Autowired
	private Wallet coinbase, walletA, walletB;
    private Transaction genesisTransaction;
    
    
   

    @GetMapping("/balance/walletA")
    public String getWalletA(Model model) {
        
        
        WalletModel w = new WalletModel("walletA",walletA.getBalance());
        model.addAttribute("wallet", w);
        
        return "wallet";
    }

    
    @GetMapping("/balance/walletB")
    public String getWalletB(Model model) {
        
        
        WalletModel w = new WalletModel("walletB",walletB.getBalance());
        model.addAttribute("wallet", w);
        
        return "wallet";
    }
    
}