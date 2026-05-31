import java.util.Scanner;

public class Book_Manager {
        public static void main(String[] args) {
            ConnectDb db=new ConnectDb();
            db.connect();
            Scanner sc=new Scanner(System.in);

            System.out.println("Welcome to Our Library");
            System.out.println();
            while (true) {
                System.out.println("Enter Your Choice");
                System.out.println("1.Insert New Books \n2.Delete Books\n3.Update Book Details\n4.Display All Books Details\n5.Search Book");
                int choice = sc.nextInt();
                Book_Details e = new Book_Details();


                switch (choice) {
                    case 1:
                        System.out.println("Enter Id of Book");
                        e.setId(sc.nextInt());
                        System.out.println("Enter name of the Book");
                        sc.nextLine();
                        e.setName(sc.nextLine());
                        System.out.println("Enter Price of the Book");
                        e.setPrice(sc.nextInt());
                        int rws = db.insert(e);
                        System.out.println("Book Inserted");
                        break;
                    case 2:
                        System.out.println("Enter Id of the Book");
                        if (db.delete(sc.nextInt())) {
                            System.out.println("Book data deleted Successfully");
                        } else
                            System.out.println("1 Issue occured in Deleting");
                        break;
                    case 3:
                        System.out.println("Enter Id of the Book You want to update");
                        e.setId(sc.nextInt());
                        System.out.println("Enter New name of the Book");
                        sc.nextLine();
                        e.setName(sc.nextLine());
                        System.out.println("Enter New Price of the Book");
                        //1sc.nextLine();
                        e.setPrice(sc.nextInt());
                        if (db.update(e) > 0) {
                            System.out.println("Update successfully");
                        } else
                            System.out.println("1 Issue occured in Updating");
                        break;
                    case 4:
                        db.display();
                        break;
                    case 5:
                        System.out.println("Enter the Book Id");
                        db.Search(sc.nextInt());
                        break;
                    default:
                        System.out.println("Enter a Valid Input");
                }

            }

        }

    }

