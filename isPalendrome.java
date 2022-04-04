import java.util.*;

public class isPalendrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        DoPalendrome obj = new DoPalendrome();

        obj.setNum(a);
        String binNum = obj.getBinary();
        System.out.println("Number " + a + " in binary, is "+binNum);

        String isPale = obj.isPal();

        if(isPale == "true"){
            System.out.println("Binary number " + binNum + " is a palindrome!");
        }else{
            System.out.println("Binary number " + binNum + " is not a palindrome!");
        }

    }
}

class DoPalendrome {

    private int num;
    public String binary;
    private String noy;

    public String getBinary(){
        this.binary = Integer.toBinaryString(this.num);
        return binary;
    }

    public void setNum(int n){
        this.num = n;
    }

    public String isPal(){
        int i = this.binary.length();
        
        // for(int j; j<i;j++){
        //     binArr[j] = this.binary.charAt(j);
        // }

        for(int j = 0;j<i/2;j++){
            if(this.binary.charAt(j)==this.binary.charAt(i-j-1)){
                this.noy = "true";
            }else{
                this.noy = "false";
            }
        }

        return this.noy;
    }
}