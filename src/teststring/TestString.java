/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststring;

/**
 *
 * @author Thinh
 */
public class TestString {

    private void testString(){
        String str1="con cac";
        
        
        String str2 = new String("CON CAC");
        
        String str3=" con   cac  ";
        
        String str4 = new String("con cac");
        if(str1==str3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
        char ch=str1.charAt(4);
        String string=str1.substring(2);
        String upper = str1.toUpperCase();
        String lower = str2.toLowerCase();
        String trim = str3.trim();
        
        System.out.println("char at 4: " +ch);
        System.out.println("sub string at 2: " + string);
        System.out.println("upper: "+upper);
        System.out.println("lower: "+lower);
        System.out.println("trim: "+trim);
    }
    public static void main(String[] args) {
        TestString ts = new TestString();
                
        ts.testString();
    }
}
