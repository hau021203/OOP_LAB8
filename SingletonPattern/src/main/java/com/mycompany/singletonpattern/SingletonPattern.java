/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.singletonpattern;

/**
 *
 * @author pc
 */
public class SingletonPattern {

    public static void main(String[] args) {
        CompanyInfo companyinfo = CompanyInfo.getInstance();
        companyinfo.displayInfo();
        companyinfo.setCompanyName("EIU-Đại học Quốc tế Miền Đông");
        companyinfo.setAddress("3M38+6F3, Nam Kỳ Khởi Nghĩa, Định Hòa,Thủ Dầu Một, Bình Dương");
        companyinfo.setPhoneNumber("(+84) 0274 222 0372");
        companyinfo.displayInfo();

    }
}
