public class reversestring {
    public static void main(String args[]){
        StringBuilder string=new StringBuilder("School");
        System.out.println(string);
        for(int i=0;i<string.length()/2;i++){
            int front=i;                            //i=0
            int back=string.length()-1-i;           //6-1-0=5

            char frontchar=string.charAt(front);
            char backchar=string.charAt(back);

            string.setCharAt(front,backchar);
            string.setCharAt(back,frontchar);
        }

            System.out.println(string);
        
    }
}
