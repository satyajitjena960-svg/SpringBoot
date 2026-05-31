import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        DtabaseCon db=new DtabaseCon();
        db.connectToDb();
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Employee Database");
        System.out.println();
        while (true) {
            System.out.println("Enter Your Choice");
            System.out.println("1.Insert New Employee Details\n2.Delete Employee\n3.Update Employee Details\n4.Display All Employee Details\n5.Display Employee By Id");
            int choice = sc.nextInt();
            Employee_Details e = new Employee_Details();


            switch (choice) {
                case 1:
                    System.out.println("Enter Id of the employee");
                    e.setId(sc.nextInt());
                    System.out.println("Enter name of the employee");
                    sc.nextLine();
                    e.setName(sc.nextLine());
                    System.out.println("Enter post of the employee");
                    //1sc.nextLine();
                    e.setPost(sc.nextLine());
                    System.out.println("Enter Salary of the employee");
                    e.setSalary(sc.nextInt());
                    int rws = db.insert(e);
                    System.out.println("Employee Inserted");
                    break;
                case 2:
                    System.out.println("Enter Id of the employee");
                    if (db.DeleteById(sc.nextInt())) {
                        System.out.println("Employee data deleted Successfully");
                    } else
                        System.out.println("1 Issue occured in Deleting");
                    break;
                case 3:
                    System.out.println("Enter Id of the employee You want to update");
                    e.setId(sc.nextInt());
                    System.out.println("Enter New name of the employee");
                    sc.nextLine();
                    e.setName(sc.nextLine());
                    System.out.println("Enter New post of the employee");
                    //1sc.nextLine();
                    e.setPost(sc.nextLine());
                    System.out.println("Enter New Salary of the employee");
                    e.setSalary(sc.nextInt());
                    if (db.update(e) > 0) {
                        System.out.println("Update successfully");
                    } else
                        System.out.println("1 Issue occured in Updating");
                    break;
                case 4:
                    db.display();
                    break;
                case 5:
                    System.out.println("Enter the employee Id");
                    db.getByid(sc.nextInt());
                    break;
                default:
                    System.out.println("Enter a Valid Input");
            }

        }

    }

}
