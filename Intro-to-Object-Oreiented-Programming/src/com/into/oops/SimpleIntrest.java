package com.into.oops;

import java.math.BigDecimal;

public class SimpleIntrest {
	
	private BigDecimal principal;
	private BigDecimal intrest;

public SimpleIntrest(String principal,String intrest) {
	
	this.principal=new BigDecimal(principal);
	this.intrest=new BigDecimal(intrest).divide(new BigDecimal(100));
	
}

public BigDecimal calculateTotalValue(int noOfYears) {
	//total=principal+principal*intrest*noOfYears
	
	BigDecimal total=principal.add(
			principal.multiply(intrest)
			.multiply(new BigDecimal(noOfYears))
			);
	return total;
}
	
	
}
