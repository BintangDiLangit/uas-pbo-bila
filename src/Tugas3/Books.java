/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Nadhifah Salsabila_19650025
 */
public class Books {

    String title;
    String author;
}
    class BooksTestdrive {

        public static void main(String[] args) {
            Books[] mybooks = new Books[3];
            int x = 0;
            
            mybooks[0] = new Books();
            mybooks[1] = new Books();
            mybooks[2] = new Books();
            
            mybooks[0].title = "Melawan Kemustahilan";
            mybooks[1].title = "Muhammad Al Fatih 1453";
            mybooks[2].title = "Awe-inspiring me";
            
            mybooks[0].author = "Dewa Eka Prayoga";
            mybooks[1].author = "felix Siaw";
            mybooks[2].author = "Dewi Nur Aisyah";

            while (x < mybooks.length){
                System.out.print(mybooks[x].title);
                System.out.println(" karya ");
                System.out.println(mybooks[x].author);
                x++;
            }
        }
    }

