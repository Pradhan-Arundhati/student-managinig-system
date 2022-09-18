import java.util.Scanner;

class TotalStudents {

    private String name; // student name
    private String number; // N

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /*public String getPhone() {
        return phone;
    }*/

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone; // phone

    /*public TotalStudents() {

    }*/

    public TotalStudents(String name,String number,String phone) {
        this.phone = phone;
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    /*public void show(String userName) {
        System.out.println (userName + "viewing" + this.name);
    }*/

    public String toString() {
        return "Name:" + name + ", Student ID:" + number + ", telephone:" + phone;
    }

}



public class Driver {
    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);

        TotalStudents[] student1 = new TotalStudents[2000];

        System.out.println ( "Welcome to the student management system:");
        do {
            // Enter the name of the future
            System.out.println ( "Please enter your user name:");
            String userName = in.next();
            //enter password
            System.out.println ( "Please enter your password:");
            String password = in.next();
            // determine whether the correct user name and password
            if ("admin".equals(userName) && "123".equals(password)) {
                System.out.println ( "Login successful");
                do {
                    // choose the operation you need to be
                    System.out.println ( "**** ***** college student management system");
                    System.out.println ( "**** 1. add students *****");
                    System.out.println ( "**** 2. remove students *****");
                    System.out.println ( "**** 3. modification information *****");
                    System.out.println ( "**** 4. student inquiry *****");
                    System.out.println ( "**** 5. print student *****");
                    System.out.println ( "**** 6. exit the system *****");
                    System.out.println ( "**** Please select the operation you need to do: *****");
                    int sel = in.nextInt();
                    switch (sel) {
                        //Add to
                        case 1:
                            System.out.println ( "Please enter your name");
                            String name = in.next();
                            System.out.println ( "Please enter the study");
                            String number = in.next();
                            System.out.println ( "Please enter the phone");
                            String phone = in.next();
                            TotalStudents student = new TotalStudents(name, number, phone);
                            for (int i = 0; i < student1.length; i++) {
                                if (student1[i] == null) {
                                    student1[i] = student;
                                    break;
                                }
                                else if(student1[i].getNumber().equals(number)){
                                    System.out.println ( "The Student ID repeat, please re-enter");
                                    break;
                                }
                                else if (student1[student1.length - 1] != null) {
                                    System.out.println ( "Number of students in full");
                                    break;
                                }
                            }
                            // array name .fori can directly create a for loop
                            for (TotalStudents totalStudents : student1) {
                                if (totalStudents != null) {
                                    System.out.println(totalStudents);
                                }
                            }

                            break;
                        // delete
                        case 2:
                            System.out.println ( "Please enter the name of the student you want to delete");
                            name = in.next();
                            // define a mark
                            for (int i = 0; i < student1.length; i++) {
                                if(student1[0]==null){
                                    System.out.println ( "No student");
                                    break;
                                }
                                if(student1[i]!=null&&student1[i].getName().equals(name)){
                                    student1[i] = null;
                                    System.out.println ( "deleted successfully!");
                                    break;
                                }
                                /*if (!flag) {
                                    System.out.println ( "The students do not exist");
                                }*/
                            }
                            break;
                        // 3 Modify
                        case 3:
                            System.out.println ( "Please enter the name of the student to be modified");
                            name = in.next();
                            System.out.println ( "Please enter the name of the revised");
                            String n2 = in.next();
                            System.out.println ( "Please enter the revised study");
                            number = in.next();
                            System.out.println ( "Please enter the phone");
                            phone = in.next();
                            boolean flag2=true;

                            for (TotalStudents totalStudents : student1) {
                                // when the array is not determined null books [i] .getName ()! = Name is false then flag2
                                if (totalStudents != null && !totalStudents.getName().equals(name)) {
                                    flag2 = false;
                                }
                                if (totalStudents != null && totalStudents.getNumber().equals(number)) {
                                    //System.out.println ( "The Student ID is already in use, please check and re-enter.");
                                    flag2 = false;
                                    break;
                                }
                                // determine if you need to modify students find it to be modified and prompts him
                                if (totalStudents != null && totalStudents.getName().equals(name)) {
                                    totalStudents.setName(n2);
                                    totalStudents.setNumber(number);
                                    totalStudents.setPhone(phone);
                                    System.out.println("modifications are complete");
                                    flag2 = true;
                                    break;
                                }
                            }
                            if (!flag2) {
                                System.out.println ( "This student or student number does not exist conflict");
                            }
                            break;
                        //Inquire
                        case 4:
                            System.out.println ( "Enter the student's name or Student ID required query");
                            String sname = in.next();
                            //number=in.next();
                            boolean flag3 = true;
                            // Enhanced data type for the variable name array or collection name
                            for (TotalStudents b : student1) {
                                if (b != null) {
                                    if (b.getName().equals(sname) || b.getNumber().equals(sname)) {
                                        flag3 = true;
                                        System.out.println(b);
                                        //break;
                                    } else {
                                        flag3 = false;
                                    }
                                }
                            }
                            if(!flag3){
                                System.out.println ( "students do not exist");
                            }
                            break;
                        //Inquire
                        case 5:
                            for (int i = student1.length - 1; i >= 0; i--) {
                                if(student1[i]!=null)
                                    System.out.println(student1[i]);
                            }
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                }while (true);

            } else {
                //flag = true;
                System.out.println ( "Login failed please re-enter:");
            }
        } while (true);
    }

}
