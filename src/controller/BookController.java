package controller;
import module.Book;
public class BookController {
    
    public void sortByName (Book [] books){
        int n=books.length;
        int indiceMax;
        Book aux;
        for (int i=0;i<n;i++){
            indiceMax=i;
            for (int j=i+1;j<n;j++){
                if (books[j].getYear()< books[indiceMax].getYear()){
                    indiceMax=j;
                }
            }
            if (indiceMax!=i){
                aux=books[indiceMax];
                books[indiceMax]=books[i];
                books[i]=aux;
            }
        }
    }

    public Book searchByYear(Book[] books,int year){
        int bajo=0;
        int alto=books.length-1;
        while(bajo<=alto){
            int medio = (bajo+alto)/2;
            if(books[medio].getYear()==year){
                return books[medio];
            }else if(books[medio].getYear()>year){
                bajo=medio+1;
            }else{
                alto=medio-1;
            }
        }return books[bajo];
    }
}
