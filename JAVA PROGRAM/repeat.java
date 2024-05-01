import java.util.*;
public class repeat{
        public static void remove(int i,String str,StringBuilder newstr,boolean map[]){
                if(i==str.length()){
                        System.out.print(newstr);
                        return; 
                }
                char c = str.charAt(i);
                if(map[c-'a']==true){
                        remove(i+1,str,newstr,map);
                }
                else{
                        map[c-'a']=true;
                        remove(i+1,str,newstr.append(c),map);
                }
               // return true;
        }
        public static void main(String[]args){
                String str = "apnacollege";
                StringBuilder newstr = new StringBuilder("");
                System.out.print(remove(0,str,newstr,new boolean[26]));
                
        }
}