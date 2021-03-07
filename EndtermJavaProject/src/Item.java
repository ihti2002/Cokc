import java.util.Date;

public class Item {
    public String item_name;
    public int item_id;
    public String item_category;
    public int item_price;
    public int item_cost;
    public int item_units_available;
    public String item_discount_code;


    public Item(String item_name,int item_id,String item_category,int item_price,int item_cost,int item_units_available,String item_discount_code) {
        this.item_name = item_name;
        this.item_category = item_category;
        this.item_cost=item_cost;
        this.item_discount_code=item_discount_code;
        this.item_id=item_id;
        this.item_price=item_price;
        this.item_units_available=item_units_available;
    }
    @Override
    public String toString(){
        return "item name: "+item_name+"item ID: "+item_id+"item category: "+item_category+"item price: "+item_price+"item cost: "+item_cost+"item units available: "+item_units_available+"item discount code: "+item_discount_code;
    }

}
