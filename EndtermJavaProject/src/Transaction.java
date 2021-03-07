import java.util.Date;



public class Transaction extends Main{
    public Date date_of_transaction;
    public int transaction_id;
    public int item_id;
    public int customer_id;
    public int Return;
    public int total_cost;
    public int total_price;
    public String discount_code;





    public Transaction(int total_cost, int total_price, Date date_of_transaction, int transaction_id, int item_id, int customer_id, int Return, String discount_code) {
        this.date_of_transaction = date_of_transaction;
        this.total_cost=total_cost;
        this.customer_id=customer_id;
        this.discount_code=discount_code;
        this.item_id=item_id;
        this.Return=Return;
        this.total_price=total_price;
        this.transaction_id=transaction_id;
    }


    //
   @Override
   public String toString(){
       return "transaction id: "+transaction_id+" item ID: "+item_id+" customer id: "+customer_id+" date of transaction: "+date_of_transaction+" total_cost: "+total_cost+" total price: "+total_price+" discount code: "+discount_code;
    }
}

