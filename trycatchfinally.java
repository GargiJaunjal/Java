// finally block with try catch always runs wheter there is exception or not
public class trycatchfinally {
    public static void main(String [] args)
    {
            int [] a=new int [6];

            System.out.println("Hello guys");

            try{
                System.out.println(a[3]);
            }catch(Exception e){

                System.out.println("Exception handled");
            }finally{
                System.out.println("It will run always");
            }

            System.out.println("Bye");
    }
}


// public class trycatchfinally {
//     public static void main(String [] args)
//     {
//             int [] a=new int [6];

//             System.out.println("Hello guys");

//             try{
//                 System.out.println(a[4]);
//             }catch(Exception e){

//                 System.out.println("Exception handled");
//             }finally{
//                 System.out.println("It will run always");
//             }

//             System.out.println("Bye");
//     }
// }


// public class trycatchfinally {
//     public static void main(String [] args)
//     {
//             int [] a=new int [6];

//             System.out.println("Hello guys");

//             try{
//                 System.out.println(a[4]);
//             }finally{
//                 System.out.println("It will run always");
//             }

//             System.out.println("Bye");
//     }
// }


// public class trycatchfinally {
//     public static void main(String [] args)
//     {
//             int [] a=new int [6];

//             System.out.println("Hello guys");

//             try{
//                 System.out.println(a[8]);
//             }finally{
//                 System.out.println("It will run always");           //Exception i not catch here
//             }

//             System.out.println("Bye");
//     }
// }
//We cannot apply multiple finally block here