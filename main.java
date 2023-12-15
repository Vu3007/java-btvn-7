import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<book>books=new ArrayList<>();
        book Book=new book();
        book Book1 = new book(10,"a","nguyen tuan","bao","canh dieu vang",2023);
        book Book2 = new book(20,"b","luu quang vu","tieu thuyet","bong sen",2024);
        book Book3 = new book(30,"c","nguyen du","truyen","bong lua",2022);
        book Book4 = new book(40,"d","to huu","tap chi","bo giao duc",2020);
       books.add(Book1);
       books.add(Book2);
       books.add(Book3);
       books.add(Book4);
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên sach: ");
        String title=sc.nextLine();
        for (int i=0;i<books.size();i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                System.out.println(books.get(i));
            }
        }
        System.out.println("Nhập thể loại: ");
        String category=sc.nextLine();
        for (int i=0;i<books.size();i++){
            if (books.get(i).getCategory().equalsIgnoreCase(category)){
                System.out.println(books.get(i));
            }
        }
        for (int i=0;i<books.size();i++){
            if (books.get(i).getYear()==2023){
                System.out.println( "Sach xuat ban 2023 la: "+ books.get(i));
            }
        }
    }
}

