package com.example.retrofitjava.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Result {
        @SerializedName("page")
        private float page;
        @SerializedName("per_page")
        private float per_page;
        @SerializedName("total")
        private float total;
        @SerializedName("total_pages")
        private float total_pages;

    public ArrayList<ResultItem> getData() {
        return data;
    }

    public void setData(ArrayList<ResultItem> data) {
        this.data = data;
    }
    @SerializedName("data")
    ArrayList<ResultItem> data = new ArrayList<>();


        // Getter Methods

        public float getPage() {
            return page;
        }

        public float getPer_page() {
            return per_page;
        }

        public float getTotal() {
            return total;
        }

        public float getTotal_pages() {
            return total_pages;
        }

        // Setter Methods

        public void setPage(float page) {
            this.page = page;
        }

        public void setPer_page(float per_page) {
            this.per_page = per_page;
        }

        public void setTotal(float total) {
            this.total = total;
        }

        public void setTotal_pages(float total_pages) {
            this.total_pages = total_pages;
        }
}
