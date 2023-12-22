package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {

	private int id;
	
	private int userId;
	
	private int goodsId;
	
	private String goodsName;
	
	private int itemCount;
	
	private int total;
	
	private Timestamp createdAt;
}
