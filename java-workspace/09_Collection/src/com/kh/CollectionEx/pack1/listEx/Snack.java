package com.kh.CollectionEx.pack1.listEx;

public class Snack {

   private String snackname; // 과자이름
   private int snackprice; // 과자가격
   private int snackquantity; // 과자 수량

    public Snack() {
    }

    public Snack(String snackname, int snackprice, int snackquantity) {
        this.snackname = snackname;
        this.snackprice = snackprice;
        this.snackquantity = snackquantity;
    }

    public void setSnackname(String snackname) {
        this.snackname = snackname;
    }

    public void setSnackprice(int snackprice) {
        this.snackprice = snackprice;
    }

    public void setSnackquantity(int snackquantity) {
        this.snackquantity = snackquantity;
    }

    public String getSnackname() {
        return snackname;
    }

    public int getSnackprice() {
        return snackprice;
    }

    public int getSnackquantity() {
        return snackquantity;
    }

    @Override
    public String toString() {
        return
                "snackname='" + snackname + '\'' +
                ", snackprice=" + snackprice +
                ", snackquantity=" + snackquantity;
    }
}
