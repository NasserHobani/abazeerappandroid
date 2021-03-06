package com.abazeer.abazeerapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderItemModel {

    @Expose
    @SerializedName("l_name")
    private String l_name;
    @Expose
    @SerializedName("l_id")
    private int l_id;
    @Expose
    @SerializedName("p_name")
    private String p_name;
    @Expose
    @SerializedName("p_id")
    private int p_id;
    @Expose
    @SerializedName("reference")
    private String reference;
    @Expose
    @SerializedName("qty_done")
    private int qty_done;
    @Expose
    @SerializedName("id")
    private int id;

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getL_id() {
        return l_id;
    }

    public void setL_id(int l_id) {
        this.l_id = l_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getQty_done() {
        return qty_done;
    }

    public void setQty_done(int qty_done) {
        this.qty_done = qty_done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
