public class binary {
    public static void bina(int n,int lastp,String str){
        if(n==0){
            System.out.print(str);
        }
        bina(n-1,0,str+""){
            if(lastp==0){
                bina(n-1,0,str+"");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(bina(n, 0, ""));

    }

}
