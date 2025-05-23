package com.campusdual.classroom;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate ) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate  = expirationDate ;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }
    public String getFormattedDate(Date texpirationDate) {
        SimpleDateFormat FormattedDate = new SimpleDateFormat("dd-MM-yyyy");
        return FormattedDate.format(expirationDate);
    }

    @Override
    public Object getSpecificData() {
        StringBuilder chainMerchandise = new StringBuilder();
        chainMerchandise.append("name:" + this.getName() + "\n")
                .append("uniqueId:" + this.getUniqueId() + "\n")
                .append("responsibleId:" + this.getResponsibleId() + "\n")
                .append("zone:" + this.getZone() + "\n")
                .append("area:" + this.getArea() + "\n")
                .append("shelf:" + this.getShelf() + "\n")
                .append("quantity:" + this.getQuantity() + "\n")
                .append("expirationDate:" + getFormattedDate(this.expirationDate) + "\n");
        return chainMerchandise;
    }
    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
