/**
 * author: hasna ben jillali
 * 11/30/2022
 * this program is to display the invoice 
 * 
 */
package receipt;

public class Receipt {
	public double price1=10,price2=12,price3=30,price4=7,price5=7,price6=11,price7=15;
	public int sunGlassesQty=5,walletQty=30,handBagQty=3,penCaseQty=12,product5Qty=7,packetQty=15,purseQty=10;
	public double sub=price1*(double)sunGlassesQty+price2*(double)walletQty+price3*(double)handBagQty
			+price4*(double)packetQty+price5*(double)purseQty+price6*(double)penCaseQty+price7*(double)product5Qty;

	public static void main(String[] args) {
		Receipt r=new Receipt();
		// declre variables 
	
		//calculate the discount
	    double discount=0.2;
	    //calculate the tax
	    double tax=7;
	    //calculat the total
	    double result=r.sub-(discount+tax);
	    
	    
		System.out.println("Invoice ");
		System.out.println("Invoice Number\t\tDate Issued");
		System.out.println("0001\t\t\t12/2/2022");
		System.out.println("\t\t\t\t\t\tBouzag inc.");
		System.out.println("Billed to \t\t\t\t\t4068 Georgetown");
		System.out.println("Someone's name\t\t\t\t\tBlue Ash OH");
		System.out.println("123 Street 145 \t\t\t\t\t5136551444");
		System.out.println("West Chester OH US\t\t\t\tbenjillali.hasna@gmail.com");
		System.out.println("45069\t\t\t\t\t\twww.yourwebsite.com");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Description\t\t\t\tUnit Cost\t\t\tQty/Hr/Rate\t\t\tAmount");
		System.out.println("_______________________________________________________________________________________________________________");
	    System.out.println("Product 1\t\t\t\t$"+r.price1+"\t\t\t\t"+r.sunGlassesQty+"\t\t\t\t$"+r.price1*r.sunGlassesQty);
	    System.out.println("Product 2\t\t\t\t$"+r.price2+"\t\t\t\t"+r.walletQty+"\t\t\t\t$"+r.price2*r.walletQty);
	    System.out.println("Product 3\t\t\t\t$"+r.price3+"\t\t\t\t"+r.penCaseQty+"\t\t\t\t$"+r.price3*r.penCaseQty);
	    System.out.println("Product 4\t\t\t\t$"+r.price4+"\t\t\t\t"+r.packetQty+"\t\t\t\t$"+r.price4*r.packetQty);
	    System.out.println("Product 5\t\t\t\t$"+r.price5+"\t\t\t\t"+r.purseQty+"\t\t\t\t$"+r.price5*r.purseQty);
	    System.out.println("Product 6\t\t\t\t$"+r.price6+"\t\t\t\t"+r.penCaseQty+"\t\t\t\t$"+r.price6*r.penCaseQty);
	    System.out.println("Product 7\t\t\t\t$"+r.price7+"\t\t\t\t"+r.product5Qty+"\t\t\t\t$"+r.price7*r.product5Qty);
	    System.out.println("_______________________________________________________________________________________________________________");
	   
	    
	    //display the total 
	    System.out.println("INVOICE TOTAL:\n$"+result+"\t\t\t\t\t\t\t\t\t\t\tSubtotal:\t$"+r.sub);
	    System.out.println("\t\t\t\t\t\t\t\t\t\t\tDiscount:\t$"+discount*r.sub);
	    System.out.println("\t\t\t\t\t\t\t\t\t\t\t(Tax Rate):\t"+tax+"%");
	    System.out.println("\t\t\t\t\t\t\t\t\t\t\tTax:\t$"+tax*r.sub/100);
	    System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal:\t$"+result);
	    
	    
	    System.out.println(" hello world \n heelo again");
	    
	    
	    
	    
	    
	    
	    
	}

}
