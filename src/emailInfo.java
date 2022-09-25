import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class emailInfo {
    private String department;
    private String name;
    private String surname;
    private String password;
    private String newEmail;

private String learnPassword;



    public void randomPass() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        generatedString=password;
        this.password=generatedString;
    }

public String getPassword(){

    System.out.println("Want to user your extinct email as a Company Email?  yes/no");


return getPassword();
}
    public String setDepartment(){



        System.out.println("Enter your department whith numbers");
        System.out.println("1-)sales \n2-)development \n3-)Accounting");
        Scanner in =new Scanner(System.in);
       department=in.nextLine();
        if(department.equals("3")){

            this.department=department;
return "accounting";
        }
      else  if(department.equals("2")){

            this.department=department;
            return "development";
        }
      else  if(department.equals("1")){

            this.department=department;
            return "sales";
        }



return department;


    }


    public String  setName() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name");

        name=in.nextLine().toLowerCase(Locale.ROOT);

        this.name = name;
        return name;
    }
    public String setSurname(){
        System.out.println("Enter your surname");
        Scanner inSurname=new Scanner(System.in);
        surname=inSurname.nextLine().toLowerCase(Locale.ROOT);


        this.surname=surname;
        return surname;
    }



    public void changePasswordnew(){
        System.out.println("Do you want to change your password");

        Scanner scan =new Scanner(System.in);
        String changePassword=scan.nextLine();
        if(changePassword.equals("yes")){
            password=scan.nextLine();
            System.out.println(password+" Is your new password");
        }
      else if(changePassword.equals("no")) {
            System.out.println("Your password remains same"+password); // random password method should be equal with password...

        }



    }
}
