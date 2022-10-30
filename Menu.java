import java.util.Scanner;

public class Menu {
    static Scanner input=new Scanner(System.in);
    public static void mainMenu(){
        int option;
        do{
            System.out.print("--Please select an option--\n1-New group for tasks\n2-New task\n3-Edit task");
            System.out.print("4-Remove the task\n5-Search task\n6-Organize tasks\n7-Exit");
            option=input.nextInt();
            switch (option){
                case 1:
                    newGroup();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(option!=7);
    }
    public static void newGroup(){

    }
}
