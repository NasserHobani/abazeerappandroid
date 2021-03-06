package com.abazeer.abazeerapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderModel {


    @Expose
    @SerializedName("s_name")
    private String s_name;
    @Expose
    @SerializedName("s_id")
    private int s_id;
    @Expose
    @SerializedName("l_name")
    private String l_name;
    @Expose
    @SerializedName("l_id")
    private int l_id;
    @Expose
    @SerializedName("r_name")
    private String r_name;
    @Expose
    @SerializedName("r_id")
    private int r_id;
    @Expose
    @SerializedName("c_name")
    private String c_name;
    @Expose
    @SerializedName("c_id")
    private int c_id;
    @Expose
    @SerializedName("date")
    private String date;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("id")
    private int id;

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

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

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
