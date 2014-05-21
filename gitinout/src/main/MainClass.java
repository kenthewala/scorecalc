package main;

import dao.GurukulDAO;

public class MainClass {

public static void main(String s[]){
GurukulDAO gurukulDAO = new GurukulDAO();
gurukulDAO.saveCentre("Pratap Nagar", "Ambabadi1", "Branch Office");
}

}