public class main extends emailInfo{
    public static void main(String[] args) {
emailInfo call=new emailInfo();


 System.out.println("Your company Email is: "+call.setName()+call.setSurname()+"@"+call.setDepartment()+".com");

        System.out.println("Your password is:");
        call.randomPass();
        call.changePasswordnew();




    }
}
