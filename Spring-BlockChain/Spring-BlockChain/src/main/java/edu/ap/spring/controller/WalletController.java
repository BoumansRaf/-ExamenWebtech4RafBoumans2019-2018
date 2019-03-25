package edu.ap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/transaction")
    public String getTransaction(Model model){
        return "transaction";
    }

    @PostMapping("/transaction")
    public String postTransaction(@RequestParam("wallet1") String wallet1, @RequestParam("wallet2") String wallet2,@RequestParam("amount") float amount){
        Block block = new Block();
		block.setPreviousHash(bChain.getLastHash());
       
        if (wallet1 == "walletA"){
            try {
                block.addTransaction(walletA.sendFunds(walletB.getPublicKey(), amount), bChain);
            } catch(Exception e) {}
        }
        else if(wallet1 == "walletB"){
            try {
                block.addTransaction(walletB.sendFunds(walletA.getPublicKey(), amount), bChain);
            } catch(Exception e) {}
        }
        return "redirect:/transaction";
        
    }
    
}